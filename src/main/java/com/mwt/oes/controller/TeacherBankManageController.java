package com.mwt.oes.controller;

import com.mwt.oes.service.TeacherBankManageService;
import com.mwt.oes.service.TeacherPaperService;
import com.mwt.oes.util.QiniuCloudUtil;
import com.mwt.oes.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/teacher")
public class TeacherBankManageController {
    @Autowired
    private TeacherPaperService teacherPaperService;
    @Autowired
    private TeacherBankManageService teacherBankManageService;

    //    获取全部单选题信息
    @RequestMapping("/getSingleList")
    public ServerResponse getSingleList(){
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> singleList = teacherBankManageService.getSingleList();
        map.put("singleList",singleList);
        List<Map<String, Object>> langOptions = teacherPaperService.getLangOptions();
        map.put("langOptions",langOptions);
        return ServerResponse.createBySuccess("获取全部单选题信息成功",map);
    }

    //    获取搜索单选题信息
    @RequestMapping("/searchSingleList")
    public ServerResponse searchSingleList(@RequestParam("content")String content,
                                           @RequestParam("langId")Integer langId,
                                           @RequestParam("composeFlag")String composeFlag){
        List<Map<String, Object>> resultList = teacherBankManageService.searchSingleList(content, langId, composeFlag);
        return ServerResponse.createBySuccess("获取搜索单选题信息成功",resultList);
    }

    //  删除单选题
    @RequestMapping(value = "/deleteSingle",method = RequestMethod.POST)
    public ServerResponse deleteSingle(@RequestBody Map<String, Object> obj){
        int singleId = (int) obj.get("singleId");
        int result = teacherBankManageService.deleteSingle(singleId);
        if(result > 0){
            return ServerResponse.createBySuccess("删除成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，删除失败");
        }
    }

    // 上传题目配图
    @RequestMapping(value = "/uploadPicture",method = RequestMethod.POST)
    public ServerResponse uploadPicture(MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            String imageName = "programImages/" + UUID.randomUUID().toString();
            String url = "";

            try {
                //使用base64方式上传到七牛云
                url = QiniuCloudUtil.put64image(bytes, imageName);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ServerResponse.createBySuccess("文件上传成功",url);
        } catch (IOException e) {
            return ServerResponse.createByError("文件上传发生异常！");
        }
    }

    // 添加单选题题目
    @RequestMapping(value = "/insertSingleInfo",method = RequestMethod.POST)
    public ServerResponse insertSingleInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.insertSingleInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("添加成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，添加失败");
        }
    }

    // 更新单选题题目
    @RequestMapping(value = "/updateSingleInfo",method = RequestMethod.POST)
    public ServerResponse updateSingleInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.updateSingleInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("更新成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，更新失败");
        }
    }

    // 添加导入单选题Excel文件
    @RequestMapping(value = "/insertSingleList",method = RequestMethod.POST)
    public ServerResponse insertSingleList(@RequestBody Map<String, Object> obj){
        List<Map<String, Object>> singleList = (List<Map<String, Object>>) obj.get("singleList");
        int result = teacherBankManageService.insertSingleList(singleList);
        return ServerResponse.createBySuccess("文件上传成功",result);
    }

    // ----------------------------------------------------------------------------------
    //    获取全部多选题信息
    @RequestMapping("/getMultipleList")
    public ServerResponse getMultipleList(){
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> multipleList = teacherBankManageService.getMultipleList();
        map.put("multipleList",multipleList);
        List<Map<String, Object>> langOptions = teacherPaperService.getLangOptions();
        map.put("langOptions",langOptions);
        return ServerResponse.createBySuccess("获取全部多选题信息成功",map);
    }

    //    获取搜索多选题信息
    @RequestMapping("/searchMultipleList")
    public ServerResponse searchMultipleList(@RequestParam("content")String content,
                                           @RequestParam("langId")Integer langId,
                                           @RequestParam("composeFlag")String composeFlag){
        List<Map<String, Object>> resultList = teacherBankManageService.searchMultipleList(content, langId, composeFlag);
        return ServerResponse.createBySuccess("获取搜索多选题信息成功",resultList);
    }

    //  删除多选题
    @RequestMapping(value = "/deleteMultiple",method = RequestMethod.POST)
    public ServerResponse deleteMultiple(@RequestBody Map<String, Object> obj){
        int multipleId = (int) obj.get("multipleId");
        int result = teacherBankManageService.deleteMultiple(multipleId);
        if(result > 0){
            return ServerResponse.createBySuccess("删除成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，删除失败");
        }
    }

    // 添加多选题题目
    @RequestMapping(value = "/insertMultipleInfo",method = RequestMethod.POST)
    public ServerResponse insertMultipleInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.insertMultipleInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("添加成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，添加失败");
        }
    }

    // 更新多选题题目
    @RequestMapping(value = "/updateMultipleInfo",method = RequestMethod.POST)
    public ServerResponse updateMultipleInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.updateMultipleInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("更新成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，更新失败");
        }
    }

    // 添加导入多选题Excel文件
    @RequestMapping(value = "/insertMultipleList",method = RequestMethod.POST)
    public ServerResponse insertMultipleList(@RequestBody Map<String, Object> obj){
        List<Map<String, Object>> multipleList = (List<Map<String, Object>>) obj.get("multipleList");
        int result = teacherBankManageService.insertMultipleList(multipleList);
        return ServerResponse.createBySuccess("文件上传成功",result);
    }
    // ----------------------------------------------------------------------------------
    //    获取全部判断题信息
    @RequestMapping("/getJudgeList")
    public ServerResponse getJudgeList(){
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> judgeList = teacherBankManageService.getJudgeList();
        map.put("judgeList",judgeList);
        List<Map<String, Object>> langOptions = teacherPaperService.getLangOptions();
        map.put("langOptions",langOptions);
        return ServerResponse.createBySuccess("获取全部判断题信息成功",map);
    }

    //    获取搜索判断题信息
    @RequestMapping("/searchJudgeList")
    public ServerResponse searchJudgeList(@RequestParam("content")String content,
                                             @RequestParam("langId")Integer langId,
                                             @RequestParam("composeFlag")String composeFlag){
        List<Map<String, Object>> resultList = teacherBankManageService.searchJudgeList(content, langId, composeFlag);
        return ServerResponse.createBySuccess("获取搜索判断题信息成功",resultList);
    }

    //  删除判断题
    @RequestMapping(value = "/deleteJudge",method = RequestMethod.POST)
    public ServerResponse deleteJudge(@RequestBody Map<String, Object> obj){
        int judgeId = (int) obj.get("judgeId");
        int result = teacherBankManageService.deleteJudge(judgeId);
        if(result > 0){
            return ServerResponse.createBySuccess("删除成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，删除失败");
        }
    }

    // 添加判断题题目
    @RequestMapping(value = "/insertJudgeInfo",method = RequestMethod.POST)
    public ServerResponse insertJudgeInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.insertJudgeInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("添加成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，添加失败");
        }
    }

    // 更新判断题题目
    @RequestMapping(value = "/updateJudgeInfo",method = RequestMethod.POST)
    public ServerResponse updateJudgeInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.updateJudgeInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("更新成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，更新失败");
        }
    }
    // 添加导入判断题Excel文件
    @RequestMapping(value = "/insertJudgeList",method = RequestMethod.POST)
    public ServerResponse insertJudgeList(@RequestBody Map<String, Object> obj){
        List<Map<String, Object>> judgeList = (List<Map<String, Object>>) obj.get("judgeList");
        int result = teacherBankManageService.insertJudgeList(judgeList);
        return ServerResponse.createBySuccess("文件上传成功",result);
    }
    // ----------------------------------------------------------------------------------
    //    获取全部填空题信息
    @RequestMapping("/getFillList")
    public ServerResponse getFillList(){
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> fillList = teacherBankManageService.getFillList();
        map.put("fillList",fillList);
        List<Map<String, Object>> langOptions = teacherPaperService.getLangOptions();
        map.put("langOptions",langOptions);
        return ServerResponse.createBySuccess("获取全部填空题信息成功",map);
    }

    //    获取搜索填空题信息
    @RequestMapping("/searchFillList")
    public ServerResponse searchFillList(@RequestParam("content")String content,
                                          @RequestParam("langId")Integer langId,
                                          @RequestParam("composeFlag")String composeFlag){
        List<Map<String, Object>> resultList = teacherBankManageService.searchFillList(content, langId, composeFlag);
        return ServerResponse.createBySuccess("获取搜索填空题信息成功",resultList);
    }

    //  删除填空题
    @RequestMapping(value = "/deleteFill",method = RequestMethod.POST)
    public ServerResponse deleteFill(@RequestBody Map<String, Object> obj){
        int fillId = (int) obj.get("fillId");
        int result = teacherBankManageService.deleteFill(fillId);
        if(result > 0){
            return ServerResponse.createBySuccess("删除成功",null);
        } else {
            return ServerResponse.createByError("数据库错误，删除失败");
        }
    }

    // 添加填空题题目
    @RequestMapping(value = "/insertFillInfo",method = RequestMethod.POST)
    public ServerResponse insertFillInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.insertFillInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("添加成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，添加失败");
        }
    }

    // 更新填空题题目
    @RequestMapping(value = "/updateFillInfo",method = RequestMethod.POST)
    public ServerResponse updateFillInfo(@RequestBody Map<String, Object> obj) {
        int result = teacherBankManageService.updateFillInfo(obj);
        if (result > 0) {
            return ServerResponse.createBySuccess("更新成功",result);
        } else {
            return ServerResponse.createByError("数据库错误，更新失败");
        }
    }
    // 添加导入填空题Excel文件
    @RequestMapping(value = "/inserFillList",method = RequestMethod.POST)
    public ServerResponse inserFillList(@RequestBody Map<String, Object> obj){
        List<Map<String, Object>> fillList = (List<Map<String, Object>>) obj.get("fillList");
        int result = teacherBankManageService.inserFillList(fillList);
        return ServerResponse.createBySuccess("文件上传成功",result);
    }
}
