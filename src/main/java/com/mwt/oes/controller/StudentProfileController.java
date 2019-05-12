package com.mwt.oes.controller;

import com.mwt.oes.domain.Student;
import com.mwt.oes.domain.StudentFeedback;
import com.mwt.oes.domain.TeacherNotice;
import com.mwt.oes.service.StudentProfileService;
import com.mwt.oes.service.StudentSystemService;
import com.mwt.oes.util.ServerResponse;
import com.mwt.oes.websocket.WebSocketDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentProfileController {
    /*
        学生我的页面控制器，包括反馈留言，回复提醒
     */
    @Autowired
    private StudentProfileService studentProfileService;
    @Autowired
    private StudentSystemService studentSystemService;

    //Log4j日志处理
    public static Logger log = LoggerFactory.getLogger(StudentSystemController.class);

    /*
        学生我的页面反馈留言
     */
    @RequestMapping(value = "/studentSendFeedback", method = RequestMethod.POST)
    public ServerResponse studentSendFeedback(@RequestBody Map<String, String> obj) throws IOException {
        //判断会话是否失效
/*        if (request.getSession(false)==null){
            return ServerResponse.createByError("会话失效，请重新登录");
        }*/

        String content = obj.get("feedback");
        String sno = obj.get("sno");

//        HttpSession session = request.getSession();
        Student student = studentSystemService.getStudentInfoBySno(sno);

        String stuName = student.getStuName();

        if(content.equals("")){
            return ServerResponse.createByError("留言内容为空");
        }
        else if(content.length() > 255){
            return ServerResponse.createByError("留言内容最多为255个字符");
        }
        else {
            int result = studentProfileService.studentSendFeedback(content, new Date(), sno, stuName);
            if(result == 0){
                return ServerResponse.createByError("数据库错误，留言失败");
            }
            else {
                ConcurrentHashMap<String, WebSocketDemo> webSocketSet = WebSocketDemo.getWebSocketDemo();
                for (String key : webSocketSet.keySet()) {
                    if (key.length() == 6) {
                        webSocketSet.get(key).sendMessage("留言");
                    }
                }
                return ServerResponse.createBySuccess("留言成功,请等待管理员回复",null);
            }
        }
    }
    /*
        我的页面顶部右侧管理员回复消息提醒
     */
    @RequestMapping(value = "/adminReplyCount", method = RequestMethod.GET)
    public ServerResponse adminReplyCount(@RequestParam("sno") String sno){
        int count = studentProfileService.getAdminReplyCount(sno, "1");
        if(count == 0){
            return ServerResponse.createByError("暂无管理员回复消息");
        }
        else {
            return ServerResponse.createBySuccess("获取管理员回复数目成功",count);
        }
    }

    /*
        更新反馈信息状态为学生端已读取
     */
    @RequestMapping(value = "/updateFeedbackStatus", method = RequestMethod.GET)
    public ServerResponse updateFeedbackStatus(@RequestParam("sno") String sno){
        //判断会话是否失效
/*        if (request.getSession(false)==null){
            return ServerResponse.createByError("会话失效，请重新登录");
        }
        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("stuObj");*/

//        String sno = student.getSno();
        int count = studentProfileService.updateFeedbackStatusBySno(sno, "1");
        if(count == 0){
            return ServerResponse.createByError("暂无未读消息");
        }
        else {
            return ServerResponse.createBySuccess("更新状态为已读成功，返回更新数目",count);
        }
    }

    /*
        获取反馈信息
     */
    @RequestMapping(value = "/getFeedbackInfo", method = RequestMethod.GET)
    public ServerResponse getFeedbackInfo(@RequestParam("sno") String sno){
        List<StudentFeedback> result = studentProfileService.getFeedbackInfoBySno(sno, "2");
        if(result.size()>0){
            return ServerResponse.createBySuccess("获取反馈信息成功",result);
        }
        else {
            return ServerResponse.createByError("获取反馈信息失败");
        }
    }


    /*
        获取考试日历,即教师公告
     */
    @RequestMapping(value = "/getExamCalendar", method = RequestMethod.GET)
    public ServerResponse getExamCalendar(){
        List<TeacherNotice> resultList = studentProfileService.getTeacherNotice();
        if(resultList != null && resultList.size() > 0){
            return ServerResponse.createBySuccess("考试日历数据获取成功",resultList);
        }
        else {
            return ServerResponse.createByError("考试日历数据获取失败");
        }
    }

    /*
      通过学号sno获取学生试卷成绩信息
   */
    @RequestMapping("/getPaperScoreInfo")
    public ServerResponse getPaperScoreInfo(@RequestParam("sno")String sno ){
        List<Map<String, Object>> resultList = studentProfileService.getPaperScoreInfoBySno(sno);
        if(resultList != null && resultList.size() > 0){
            return ServerResponse.createBySuccess("获取学生试卷成绩信息成功",resultList);
        }
        else if(resultList.size() == 0){
            return ServerResponse.createByError("成绩列表为空");
        }
        else {
            return ServerResponse.createByError("获取学生试卷成绩信息失败");
        }
    }
}
