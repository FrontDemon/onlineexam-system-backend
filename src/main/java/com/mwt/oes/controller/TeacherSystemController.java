package com.mwt.oes.controller;

import com.mwt.oes.domain.Teacher;
import com.mwt.oes.service.TeacherSystemService;
import com.mwt.oes.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/teacher")
public class TeacherSystemController {

    @Autowired
    private TeacherSystemService teacherSystemService;

    @RequestMapping("/getTeaHuPsw")
    public ServerResponse getTeaHuPsw(@RequestParam("tno") String tno){
        String teaHuPsw = teacherSystemService.getTeaHuPsw(tno);
        return ServerResponse.createBySuccess("获取胡老师密码成功",teaHuPsw);
    }

    /*
        校验教师登录
     */
    @RequestMapping(value = "/teacherLogin", method = RequestMethod.POST)
    public ServerResponse teacherLogin(@RequestBody(required = false)Teacher teacher,
                                       HttpServletRequest request){

        HttpSession session = request.getSession();

        String tno = teacher.getTno();
        String psw = teacher.getTeaPsw();
        if (tno.equals(""))
            return ServerResponse.createByError("教工号为空");
        if (psw.equals(""))
            return ServerResponse.createByError("密码为空");
        //判断教工号学号是否匹配
        List<Teacher> resultList = teacherSystemService.teacherLogin(tno, psw);
        if (resultList != null && resultList.size() > 0){
            //更新最近登录时间
            Teacher updateTeacherObj = resultList.get(0);
            updateTeacherObj.setTeaLastLoginTime(new Date());
            boolean isUpdate = teacherSystemService.updateTeacher(updateTeacherObj);
            if(isUpdate){
                //将登录成功后的教师信息存入session
                session.setAttribute("teaObj",updateTeacherObj);
                //返回给前台json数据
                return ServerResponse.createBySuccess("登录成功",updateTeacherObj);
            }
            //更新最近登录时间失败
            else {
                return ServerResponse.createByError("登录失败，后台数据库更新最近登录时间错误");
            }
        }
        else {
            return ServerResponse.createByError("教工号或密码错误");
        }
    }

    /*
        教师退出登录
     */
    @RequestMapping("/teacherLogOut")
    public ServerResponse teacherLogOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return ServerResponse.createBySuccess("退出登录成功",null);
    }
}
