package com.mwt.oes.controller;

import com.mwt.oes.domain.StudentHomeRotationImg;
import com.mwt.oes.service.AdminRotationImgService;
import com.mwt.oes.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminRotationImgController {
    @Autowired
    private AdminRotationImgService adminRotationImgService;

    //    获取全部轮播图信息
    @RequestMapping("/getRotationImgsList")
    public ServerResponse getRotationImgsList(){
        List<Map<String, Object>> resultList = adminRotationImgService.getRotationImgsList();
        return ServerResponse.createBySuccess("获取全部轮播图信息成功",resultList);
    }

    //    获取搜索轮播图信息
    @RequestMapping("/searchRotationImgsList")
    public ServerResponse searchRotationImgsList(@RequestParam("imgTitle")String imgTitle,
                                                 @RequestParam("admName")String admName){
        List<Map<String, Object>> resultList = adminRotationImgService.searchRotationImgsList(imgTitle, admName);
        return ServerResponse.createBySuccess("获取搜索轮播图信息成功",resultList);
    }

    //    添加轮播图信息
    @RequestMapping(value = "/insertRotationImgInfo",method = RequestMethod.POST)
    public ServerResponse insertRotationImgInfo(@RequestBody(required = false)StudentHomeRotationImg studentHomeRotationImg){
        int result = adminRotationImgService.insertRotationImgInfo(studentHomeRotationImg);
        if (result > 0){
            return ServerResponse.createBySuccess("添加轮播图信息成功",null);
        }
        else {
            return ServerResponse.createByError("数据库错误，添加轮播图信息失败");
        }
    }

    //    更新轮播图信息
    @RequestMapping(value = "/updateRotationImgInfo",method = RequestMethod.POST)
    public ServerResponse updateRotationImgInfo(@RequestBody(required = false)StudentHomeRotationImg studentHomeRotationImg){
        int result = adminRotationImgService.updateRotationImgInfo(studentHomeRotationImg);
        if (result > 0){
            return ServerResponse.createBySuccess("更新轮播图信息成功",null);
        }
        else {
            return ServerResponse.createByError("数据库错误，更新轮播图信息失败");
        }
    }

    //  删除轮播图信息
    @RequestMapping(value = "/deleteRotationImgInfo",method = RequestMethod.POST)
    public ServerResponse deleteRotationImgInfo(@RequestBody Map<String, Object> obj){
        Integer imgId = (Integer) obj.get("imgId");
        int result = adminRotationImgService.deleteRotationImgInfo(imgId);
        if(result > 0){
            return ServerResponse.createBySuccess("删除成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，删除失败");
        }
    }
}
