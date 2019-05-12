package com.mwt.oes.service;

import java.util.List;
import java.util.Map;

public interface TeacherPaperService {
    public List<Map<String, Object>> getPapersList();
    public List<Map<String, Object>> getLangOptions();
    public List<Map<String, Object>> searchPapersList(String paperName, Integer langId, Integer paperType);
    public int selectPaperScoreByPaperId(Integer paperId);
    public int deletePaper(Integer paperId);
    public Map<String, Object> getPaperQueDetailByPaperId(Integer paperId, Integer totalNum);
    public int randomInsertPaperInfo(Map<String, Object> obj);
    public Map<String, Object> getPaperQueDetailByLangId(Integer langId);
    public int fixedInsertPaperInfo(Map<String, Object> obj);
}
