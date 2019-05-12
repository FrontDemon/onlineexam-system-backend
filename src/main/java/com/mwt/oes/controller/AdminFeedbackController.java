package com.mwt.oes.controller;

import com.mwt.oes.domain.StudentFeedback;
import com.mwt.oes.service.AdminFeedbackService;
import com.mwt.oes.util.ServerResponse;
import com.mwt.oes.websocket.WebSocketDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminFeedbackController {
    @Autowired
    private AdminFeedbackService adminFeedbackService;

    //    获取全部留言信息
    @RequestMapping("/getFeedbacksList")
    public ServerResponse getFeedbacksList(){
        List<Map<String, Object>> resultList = adminFeedbackService.getFeedbacksList();
        return ServerResponse.createBySuccess("获取全部轮播图信息成功",resultList);
    }

    //    获取未回复留言条数
    @RequestMapping("/getUnReplyCount")
    public ServerResponse getUnReplyCount(){
        int result = adminFeedbackService.getUnReplyCount();
        return ServerResponse.createBySuccess("获取未回复留言条数成功",result);
    }

    //    获取全部留言信息
    @RequestMapping("/searchFeedbacksList")
    public ServerResponse searchFeedbacksList(@RequestParam("feedbackContent")String feedbackContent,
                                              @RequestParam("stuName")String stuName,
                                              @RequestParam("admAnswer")String admAnswer,
                                              @RequestParam("admName")String admName,
                                              @RequestParam("feedbackStatus")String feedbackStatus){
        List<Map<String, Object>> resultList = adminFeedbackService.searchFeedbacksList(feedbackContent, stuName, admAnswer, admName, feedbackStatus);
        return ServerResponse.createBySuccess("获取全部轮播图信息成功",resultList);
    }

    // 删除留言
    @RequestMapping(value = "/deleteFeedback",method = RequestMethod.POST)
    public ServerResponse deleteFeedback(@RequestBody Map<String, Object> obj){
        Integer feedbackId = (Integer) obj.get("feedbackId");
        int result = adminFeedbackService.deleteFeedback(feedbackId);
        if(result > 0){
            return ServerResponse.createBySuccess("删除成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，删除失败");
        }
    }

    // 回复留言
    @RequestMapping(value = "/replyFeedback",method = RequestMethod.POST)
    public ServerResponse replyFeedback(@RequestBody(required = false)StudentFeedback studentFeedback) throws IOException {
        int result = adminFeedbackService.replyFeedback(studentFeedback);
        if(result > 0){
            String sno = studentFeedback.getSno();
            ConcurrentHashMap<String, WebSocketDemo> webSocketSet = WebSocketDemo.getWebSocketDemo();
            if(webSocketSet.get(sno) != null) {
                webSocketSet.get(sno).sendMessage("留言");
            }
            for (String key : webSocketSet.keySet()) {
                if (key.length() == 6) {
                    webSocketSet.get(key).sendMessage("留言");
                }
            }
            return ServerResponse.createBySuccess("回复成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，插入回复信息失败");
        }
    }
}
