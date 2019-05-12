package com.mwt.oes.controller;

import com.mwt.oes.domain.Student;
import com.mwt.oes.service.StudentSystemService;
import com.mwt.oes.util.EmailUtil;
import com.mwt.oes.util.MobilePhoneUtil;
import com.mwt.oes.util.ProfileImageSavaUtil;
import com.mwt.oes.util.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
//@CrossOrigin
public class StudentSystemController {

    /*
        学生系统控制器：包含根据学号查找学生信息,学生登录校验，学生注册，学生找回密码，学生密码修改，学生个人信息修改，学生退出登录
     */

    @Autowired
    private StudentSystemService studentSystemService;

    //Log4j日志处理
    public static Logger log = LoggerFactory.getLogger(StudentSystemController.class);

    /*
        根据学号查找学生信息
     */
    @RequestMapping(value = "/getStudentInfoBySno/{sno}", method = RequestMethod.GET)
    public ServerResponse getStudentInfoBySno(@PathVariable("sno") String sno){
//        log.info(sno);
        Student student = studentSystemService.getStudentInfoBySno(sno);
//        log.info("查询学号：" + sno + "--返回学生信息");
        if(!student.equals("")){
            return ServerResponse.createBySuccess("查询成功",student);
        }
        else {
            return ServerResponse.createByError("查询失败");
        }
    }

    /*
        校验学生登录
     */
    @RequestMapping(value = "/checkStudentLogin", method = RequestMethod.POST)
    public ServerResponse checkStudentLogin(@RequestBody(required = false)Student student,
                                            HttpServletRequest request){
//        @RequestBody Map<String, String> jsonObject,
        String sno = student.getSno();
        String stuPsw = student.getStuPsw();
//        log.info(sno+"  "+stuPsw);
        HttpSession session = request.getSession();

        if(sno.equals(""))
            return ServerResponse.createByError("学号为空");

        //判断学号存在与否
        boolean isSnoFlag = studentSystemService.snoIsExist(sno);
        if (!isSnoFlag)
            return ServerResponse.createByError("学号不存在");
        else if(stuPsw.isEmpty())
            return ServerResponse.createByError("学号存在，但未输入密码");

        //判断学号密码是否匹配
        List<Student> resultList = studentSystemService.checkStudentPsw(sno, stuPsw);
        if (resultList != null && resultList.size() > 0){
            if(resultList.get(0).getStuStatus().equals("0"))
                return ServerResponse.createByError("该学号被限制登录");
            else {
                resultList.get(0).setStuLastLoginTime(new Date());
                //更新最近登录时间成功
                boolean isUpdate = studentSystemService.updateStudent(resultList.get(0));
                if (isUpdate){
                    //将登录成功后的学生信息存入session
                    session.setAttribute("stuObj",resultList.get(0));
                    //返回给前台json数据
                    return ServerResponse.createBySuccess("登录成功",resultList.get(0));
                }
                //更新最近登录时间失败
                else {
                    return ServerResponse.createByError("登录失败，后台数据存入错误");
                }
            }

        }
        else {
            return ServerResponse.createByError("密码错误");
        }
    }

    /*
        学生注册
     */
    @RequestMapping(value = "/studentRegister", method = RequestMethod.POST)
    public ServerResponse studentRegister(@RequestBody Map<String, String> obj){
        String sno = obj.get("newSno");
        String stuPsw = obj.get("newPsw");
        String stuPswConfirm = obj.get("newPswConfirm");
        String stuName = obj.get("newName");
        String stuEmail = obj.get("newEmail");
        String stuPhone = obj.get("newPhone");
        String stuSecurityCode = obj.get("newSecurityCode");
        String stuSecurityCodeConfirm = obj.get("newSecurityCodeConfirm");
        //性别默认为男
        String stuSex = "男";

        if(sno.isEmpty()){
            return ServerResponse.createByError("学号为空");
        }

        boolean isRegistered = studentSystemService.snoIsExist(sno);
        if(isRegistered){
            return ServerResponse.createByError("此学号已被注册");
        }
        else if(sno.length() != 12){
            return ServerResponse.createByError("学号长度为12位");
        }
        else if(stuPsw.isEmpty()){
            return ServerResponse.createByError("密码为空");
        }
        else if(stuPsw.length() < 6){
            return ServerResponse.createByError("密码长度至少为6位");
        }
        else if(stuPswConfirm.isEmpty()){
            return ServerResponse.createByError("再次输入密码为空");
        }
        else if(!stuPsw.equals(stuPswConfirm)){
            return ServerResponse.createByError("两次输入密码不一致");
        }
        else if(stuName.isEmpty()){
            return ServerResponse.createByError("姓名为空");
        }
        else if(stuEmail.isEmpty()){
            return ServerResponse.createByError("邮箱为空");
        }
        else if(!EmailUtil.isEmail(stuEmail)){
            return ServerResponse.createByError("邮箱格式不正确");
        }
        else if(stuPhone.isEmpty()){
            return ServerResponse.createByError("手机号为空");
        }
        else if(!MobilePhoneUtil.isMobileNO(stuPhone)){
            return ServerResponse.createByError("手机号不合法");
        }
        else if(stuSecurityCode.isEmpty()){
            return ServerResponse.createByError("安全码为空");
        }
        else if(stuSecurityCode.length() < 6){
            return ServerResponse.createByError("安全码长度至少为6位");
        }
        else if(stuSecurityCodeConfirm.isEmpty()){
            return ServerResponse.createByError("再次输入安全码为空");
        }
        else if(!stuSecurityCode.equals(stuSecurityCodeConfirm)){
            return ServerResponse.createByError("两次输入安全码不一致");
        }
        else {
            int result = studentSystemService.registerStudent(sno, stuPsw, stuName, stuSex, stuEmail,
                    stuPhone, new Date(), stuSecurityCode);
            if(result == 0)
                return ServerResponse.createByError("数据库错误，注册失败");
            else
                return ServerResponse.createBySuccess("注册成功",null);
        }
    }

    /*
        学生找回密码
     */
    @RequestMapping(value = "/studentFindPsw", method = RequestMethod.POST)
    public ServerResponse studentFindPsw (@RequestBody Map<String, String> obj){
        String sno = obj.get("findSno");
        String stuPhone = obj.get("findPhone");
        String securityCode = obj.get("findSecurityCode");
        String newPsw = obj.get("findNewPsw");
        String newPswConfirm = obj.get("findNewPswConfirm");

        if(sno.isEmpty()){
            return ServerResponse.createByError("学号为空");
        }
        else if(sno.length() != 12){
            return ServerResponse.createByError("学号长度为12位");
        }
        else if(stuPhone.isEmpty()){
            return ServerResponse.createByError("手机号为空");
        }
        else if(!MobilePhoneUtil.isMobileNO(stuPhone)){
            return ServerResponse.createByError("手机号不合法");
        }
        else if(securityCode.isEmpty()){
            return ServerResponse.createByError("安全码为空");
        }
        else if(securityCode.length() < 6){
            return ServerResponse.createByError("安全码长度至少为6位");
        }
        else if(newPsw.isEmpty()){
            return ServerResponse.createByError("新密码为空");
        }
        else if(newPsw.length() < 6){
            return ServerResponse.createByError("新密码长度至少为6位");
        }
        else if(newPswConfirm.isEmpty()){
            return ServerResponse.createByError("再次输入新密码为空");
        }
        else if(!newPsw.equals(newPswConfirm)){
            return ServerResponse.createByError("两次输入新密码不一致");
        }
        boolean isRegistered = studentSystemService.snoIsExist(sno);
        if(!isRegistered){
            return ServerResponse.createByError("此学号未注册");
        }
        Student student = studentSystemService.getStudentInfoBySno(sno);
        if(!student.getStuPhone().equals(stuPhone)){
            return ServerResponse.createByError("手机号码与当前学号不匹配");
        }
        else if(!student.getStuSecurityCode().equals(securityCode)){
            return ServerResponse.createByError("安全码与当前学号不匹配");
        }
        else {
            student.setStuPsw(newPsw);
            //判断密码是否修改成功
            boolean isUpdate = studentSystemService.updateStudent(student);
            if(isUpdate){
                return ServerResponse.createBySuccess("密码修改成功",student);
            }
            else {
                return ServerResponse.createByError("密码修改失败");
            }
        }
    }

    /*
        学生密码修改
     */
    @RequestMapping(value = "/studentPswChange", method = RequestMethod.POST)
    public ServerResponse studentPswChange(@RequestBody Map<String, String> jsonObject, HttpServletRequest request){
        //判断会话是否失效
/*        if (request.getSession(false)==null){
            return ServerResponse.createByError("会话失效，请重新登录");
        }*/
        String oldStuPsw = jsonObject.get("password");
        String stuPsw = jsonObject.get("newPassword");
        String stuPswConfirm = jsonObject.get("newPasswordConfirm");
        String sno = jsonObject.get("sno");

        HttpSession session = request.getSession();
        Student student = studentSystemService.getStudentInfoBySno(sno);

        if(oldStuPsw.equals("")){
            return ServerResponse.createByError("原始密码为空");
        }
        if(!student.getStuPsw().equals(oldStuPsw)){
            return ServerResponse.createByError("原始密码错误");
        }
        if(stuPsw.isEmpty()){
            return ServerResponse.createByError("新密码为空");
        }
        else if(stuPsw.length() < 6){
            return ServerResponse.createByError("新密码长度至少为6位");
        }
        else if(stuPswConfirm.isEmpty()){
            return ServerResponse.createByError("确认新密码为空");
        }
        else if(!stuPsw.equals(stuPswConfirm)){
            return ServerResponse.createByError("两次输入密码不一致");
        }
        else if(stuPswConfirm.equals(student.getStuPsw())){
            return ServerResponse.createByError("新密码与旧密码相同，请重新设置");
        }
        else {
           student.setStuPsw(stuPswConfirm);
           //判断密码是否修改成功
            boolean isUpdate = studentSystemService.updateStudent(student);
           if(isUpdate){
               session.setAttribute("stuObj",student);
               return ServerResponse.createBySuccess("密码修改成功",null);
           }
           else {
               return ServerResponse.createByError("密码修改失败");
           }
        }
    }

    /*
        学生个人信息修改
     */
    @RequestMapping(value = "/studentInfoChange", method = RequestMethod.POST)
    public ServerResponse studentInfoChange(MultipartFile stuImgSrc,
                                            HttpServletRequest request){
//        log.info("头像" + stuImgSrc.toString());
        //判断会话是否失效
//        if (request.getSession(false)==null){
//            return ServerResponse.createByError("会话失效，请重新登录");
//        }
        HttpSession session = request.getSession();
//        Student student = (Student) session.getAttribute("stuObj");
        String sno = request.getParameter("sno");
        Student student = studentSystemService.getStudentInfoBySno(sno);

//        String stuName = (String) objectMap.get("stuName");
//        String stuSex = (String) objectMap.get("stuSex");
//        MultipartFile stuImgSrc = (MultipartFile) objectMap.get("stuImgSrc");
//        log.info(stuImgSrc.toString());
//        String stuEmail = (String) objectMap.get("stuEmail");
//        String stuPhone = (String) objectMap.get("stuPhone");
        String stuName = request.getParameter("stuName");
        String stuSex = request.getParameter("stuSex");
        String stuEmail = request.getParameter("stuEmail");
        String stuPhone = request.getParameter("stuPhone");

        if(stuName.isEmpty()){
            return ServerResponse.createByError("姓名为空");
        }
        else if(stuSex.isEmpty()){
            return ServerResponse.createByError("性别为空");
        }
        else if(stuEmail.isEmpty()){
            return ServerResponse.createByError("邮箱为空");
        }
        else if(!EmailUtil.isEmail(stuEmail)){
            return ServerResponse.createByError("邮箱格式不正确");
        }
        else if(stuPhone.isEmpty()){
            return ServerResponse.createByError("手机号为空");
        }
        else if(!MobilePhoneUtil.isMobileNO(stuPhone)){
            return ServerResponse.createByError("手机号不合法");
        }
        else if(stuName.equals(student.getStuName()) && stuSex.equals(student.getStuSex())
                && stuEmail.equals(student.getStuEmail()) && stuPhone.equals(student.getStuPhone())
                && stuImgSrc == null){
            return ServerResponse.createByError("信息修改与之前一致");
        }
        else {
            if (stuImgSrc != null){
                student.setStuImgSrc(ProfileImageSavaUtil.qiniuImageSave(stuImgSrc,student));
            }
            student.setStuName(stuName);
            student.setStuSex(stuSex);
            student.setStuEmail(stuEmail);
            student.setStuPhone(stuPhone);
            //判断信息是否修改成功
            boolean isUpdate = studentSystemService.updateStudent(student);
            if(isUpdate){
                session.setAttribute("stuObj",student);
                return ServerResponse.createBySuccess("信息修改成功",student);
            }
            else {
                return ServerResponse.createByError("信息修改失败");
            }
        }
    }

    /*
        学生退出登录
     */
    @RequestMapping("/studentLoginOut")
    public ServerResponse studentLoginOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return ServerResponse.createBySuccess("退出登录成功",null);
    }

}
