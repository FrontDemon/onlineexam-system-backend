package com.mwt.oes.service;

import com.mwt.oes.domain.Student;

import java.util.List;
import java.util.Map;

public interface TeacherStudentService {
    public List<Student> getStudentsList();
    public int updateStudentInfo(Student student);
    public List<Student> searchStudentInfo(String sno, String stuName, String stuSex);
    public int insertStudentInfo(Student student);
    public List<Map<String, Object>> getScoresList();
    public List<Map<String, Object>> getPapersList();
    public int deleteScore(String sno, Integer paperId);
    public List<Map<String, Object>> searchScoresList(String sno, Integer paperId);
    public Map<String, Object> getChartData(Integer paperId);
    public Map<String, Object> insertStudentInfoList(List<Map<String, Object>> studentList);
}
