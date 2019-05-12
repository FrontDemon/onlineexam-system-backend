package com.mwt.oes.service;

import java.util.List;
import java.util.Map;

public interface TeacherBankManageService {
    public List<Map<String, Object>> getSingleList();
    public List<Map<String, Object>> searchSingleList(String content, Integer langId, String composeFlag);
    public int deleteSingle(Integer singleId);
    public int insertSingleInfo(Map<String, Object> obj);
    public int updateSingleInfo(Map<String, Object> obj);
    public int insertSingleList(List<Map<String, Object>> singleList);

    public List<Map<String, Object>> getMultipleList();
    public List<Map<String, Object>> searchMultipleList(String content, Integer langId, String composeFlag);
    public int deleteMultiple(Integer multipleId);
    public int insertMultipleInfo(Map<String, Object> obj);
    public int updateMultipleInfo(Map<String, Object> obj);
    public int insertMultipleList(List<Map<String, Object>> multipleList);

    public List<Map<String, Object>> getJudgeList();
    public List<Map<String, Object>> searchJudgeList(String content, Integer langId, String composeFlag);
    public int deleteJudge(Integer judgeId);
    public int insertJudgeInfo(Map<String, Object> obj);
    public int updateJudgeInfo(Map<String, Object> obj);
    public int insertJudgeList(List<Map<String, Object>> judgeList);

    public List<Map<String, Object>> getFillList();
    public List<Map<String, Object>> searchFillList(String content, Integer langId, String composeFlag);
    public int deleteFill(Integer fillId);
    public int insertFillInfo(Map<String, Object> obj);
    public int updateFillInfo(Map<String, Object> obj);
    public int inserFillList(List<Map<String, Object>> fillList);
}
