package com.mwt.oes.controller;

import com.mwt.oes.service.StudentSearchService;
import com.mwt.oes.util.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentSearchController {
    /*
        学生搜索页面，包含关键词模糊搜索
     */
    @Autowired
    private StudentSearchService studentSearchService;

    //Log4j日志处理
    public static Logger log = LoggerFactory.getLogger(StudentSystemController.class);

    /*
        根据关键词获取试卷列表数据
     */
    @RequestMapping("/getSearchPapers")
    public ServerResponse getSearchPapers(@RequestParam("keyword")String keyword){
        List<Map<String, Object>> resultList = studentSearchService.getSearchPapers(keyword);
        if(resultList != null && resultList.size() > 0){
            return ServerResponse.createBySuccess("根据关键词获取试卷列表成功",resultList);
        }
        else {
            return ServerResponse.createByError("该关键字暂无搜索结果");
        }
    }
}
