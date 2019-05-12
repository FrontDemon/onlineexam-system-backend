package com.mwt.oes.controller;

import com.mwt.oes.domain.Paper;
import com.mwt.oes.domain.ProgramingLanguage;
import com.mwt.oes.domain.StudentPaperAnswer;
import com.mwt.oes.service.StudentHomeService;
import com.mwt.oes.service.StudentWrongService;
import com.mwt.oes.util.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentWrongController {
    /*
        学生错题查看页面，包含分类滑动点击显示错题列表，查看错题详情
     */
    @Autowired
    private StudentHomeService studentHomeService;
    @Autowired
    private StudentWrongService studentWrongService;

    //Log4j日志处理
    public static Logger log = LoggerFactory.getLogger(StudentSystemController.class);

    /*
        获取错题页面触摸滑动全部编程语言信息
     */
    @RequestMapping("/getWrongLanguagesInfo")
    public ServerResponse getSearchPapers(){
        List<ProgramingLanguage> programingLanguageList = studentHomeService.getLanguagesInfo();
        List<Map<String, Object>> resultList = new ArrayList<>();
        Map<String, Object> mapAll = new HashMap<>();
        mapAll.put("langId",0);
        mapAll.put("langName","全部");
        resultList.add(mapAll);
        for (ProgramingLanguage programingLanguage : programingLanguageList){
            Map<String, Object> map = new HashMap<>();
            map.put("langId",programingLanguage.getLangId());
            map.put("langName",programingLanguage.getLangName());
            resultList.add(map);
        }
        if(programingLanguageList != null && programingLanguageList.size() > 0){
            return ServerResponse.createBySuccess("获取错题页面全部编程语言信息成功",resultList);
        }
        else {
            return ServerResponse.createByError("获取错题页面全部编程语言信息失败");
        }
    }

    /*
       获取错题页面全部错题试卷
    */
    @RequestMapping("/getWrongAllPapers")
    public ServerResponse getWrongAllPapers(@RequestParam("sno")String sno){
        List<Map<String, Object>> resultList = studentWrongService.getWrongAllPapers(sno);
        return ServerResponse.createBySuccess("获取错题页面全部错题试卷成功",resultList);
    }
    /*
       获取错题页面全部错题试卷
    */
    @RequestMapping("/getWrongPapersByLangId")
    public ServerResponse getWrongPapersByLangId(@RequestParam("sno")String sno,
                                                 @RequestParam("langId")Integer langId){
        List<Map<String, Object>> resultList = studentWrongService.getWrongPapersByLangId(sno, langId);
        return ServerResponse.createBySuccess("获取错题页面指定语言错题试卷成功",resultList);
    }

    /*
       通过sno和paperId获取错题试卷及单选题、多选题、判断题和填空题信息
    */
    @RequestMapping("/getPapersInfoByWrongPaperId")
    public ServerResponse getPapersInfoByWrongPaperId(@RequestParam("sno")String sno,
                                                      @RequestParam("paperId")Integer paperId ){
        Paper paper = studentHomeService.getPapersInfoByPaperId(paperId);
        Map<String, Integer> numObj = studentHomeService.getPaperQueNumByPaperId(paperId);
        List<Map<String, Object>> singleQueList = studentWrongService.getSingleQueListByWrongPaperId(sno, paperId);
        List<Map<String, Object>> multipleQueList = studentWrongService.getMultipleQueListByWrongPaperId(sno, paperId);
        List<Map<String, Object>> judgeQueList = studentWrongService.getJudgeQueListByWrongPaperId(sno, paperId);
        List<Map<String, Object>> fillQueList = studentWrongService.getFillQueListByWrongPaperId(sno, paperId);
        if(paper != null && numObj != null){
            Map<String, Object> map = new HashMap<>();
            map.put("paperInfo",paper);
            map.put("queNumInfo",numObj);
            map.put("singleQueList",singleQueList);
            map.put("multipleQueList",multipleQueList);
            map.put("judgeQueList",judgeQueList);
            map.put("fillQueList",fillQueList);
            return ServerResponse.createBySuccess("错题试卷id为" + paperId + "的试卷信息获取成功",map);
        }
        else {
            return ServerResponse.createByError("错题试卷id为" + paperId + "的试卷信息获取失败");
        }
    }

    /*
        请求根据answerId更新学生试卷答案表isCollect字段
     */
    @RequestMapping(value = "/updatePaperAnswerIsCollect", method = RequestMethod.POST)
    public ServerResponse updatePaperAnswerIsCollect(@RequestBody Map<String, Object> map){
        StudentPaperAnswer studentPaperAnswer = new StudentPaperAnswer();
        studentPaperAnswer.setAnswerId((Integer) map.get("answerId"));
        studentPaperAnswer.setIscollect((String) map.get("isCollect"));
        int result = studentWrongService.updatePaperAnswerIsCollect(studentPaperAnswer);
        if(result != 0){
            return ServerResponse.createBySuccess("更新成功",null);
        }
        else {
            return ServerResponse.createByError("更新失败");
        }
    }

    /*
       获取全部收藏题目
    */
    @RequestMapping("/getAllCollections")
    public ServerResponse getAllCollections(@RequestParam("sno")String sno){
        List<Map<String, Object>> resultList = studentWrongService.getAllCollections(sno);
        return ServerResponse.createBySuccess("获取全部收藏题目成功",resultList);
    }
    /*
       通过题目类型id获取收藏题目
    */
    @RequestMapping("/getCollectionsById")
    public ServerResponse getCollectionsById(@RequestParam("sno")String sno,
                                                 @RequestParam("queType")Integer queType){
        List<Map<String, Object>> resultList = studentWrongService.getCollectionsById(sno, queType);
        return ServerResponse.createBySuccess("通过题目类型id获取收藏题目成功",resultList);
    }
    /*
        通过answerId获取收藏单选题信息
     */
    @RequestMapping("/getSingleByAnswerId")
    public ServerResponse getSingleByAnswerId(@RequestParam("answerId")Integer answerId){
        Map<String, Object> map = studentWrongService.getSingleByAnswerId(answerId);
        if(map != null){
            return ServerResponse.createBySuccess("通过answerId获取收藏单选题信息成功",map);
        }
        else {
            return ServerResponse.createByError("通过answerId获取收藏单选题信息失败");
        }
    }
    /*
        通过answerId获取收藏多选题信息
     */
    @RequestMapping("/getMultipleByAnswerId")
    public ServerResponse getMultipleByAnswerId(@RequestParam("answerId")Integer answerId){
        Map<String, Object> map = studentWrongService.getMultipleByAnswerId(answerId);
        if(map != null){
            return ServerResponse.createBySuccess("通过answerId获取收藏多选题信息成功",map);
        }
        else {
            return ServerResponse.createByError("通过answerId获取收藏多选题信息失败");
        }
    }
    /*
        通过answerId获取收藏判断题信息
    */
    @RequestMapping("/getJudgeByAnswerId")
    public ServerResponse getJudgeByAnswerId(@RequestParam("answerId")Integer answerId){
        Map<String, Object> map = studentWrongService.getJudgeByAnswerId(answerId);
        if(map != null){
            return ServerResponse.createBySuccess("通过answerId获取收藏判断题信息成功",map);
        }
        else {
            return ServerResponse.createByError("通过answerId获取收藏判断题信息失败");
        }
    }
    /*
        通过answerId获取收藏填空题信息
    */
    @RequestMapping("/getFillByAnswerId")
    public ServerResponse getFillByAnswerId(@RequestParam("answerId")Integer answerId){
        Map<String, Object> map = studentWrongService.getFillByAnswerId(answerId);
        if(map != null){
            return ServerResponse.createBySuccess("通过answerId获取收藏填空题信息成功",map);
        }
        else {
            return ServerResponse.createByError("通过answerId获取收藏填空题信息失败");
        }
    }
}
