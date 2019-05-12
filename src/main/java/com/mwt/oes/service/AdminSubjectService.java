package com.mwt.oes.service;

import com.mwt.oes.domain.ProgramingLanguage;

import java.util.List;
import java.util.Map;

public interface AdminSubjectService {
    public List<Map<String, Object>> getSubjectsList();
    public List<Map<String, Object>> searchSubjectsList(String langName, String langDesc,
                                                        String langCreatedBy, String isRecommend);
    public int insertSubjectInfo(ProgramingLanguage programingLanguage);
    public int updateSubjectInfo(ProgramingLanguage programingLanguage);
    public int deleteSubject(Integer langId);
}
