package com.mwt.oes.service;

import com.mwt.oes.domain.Teacher;

import java.util.List;
import java.util.Map;

public interface AdminTeacherService {
    public Map<String, Object> insertTeacherInfoList(List<Map<String, Object>> teacherList);
    public boolean tnoIsExist(String tno);
    public List<Teacher> getTeachersList();
    public int updateTeacherInfo(Teacher teacher);
    public List<Teacher> searchTeacherInfo(String tno, String teaName, String teaSex);
    public int insertTeacherInfo(Teacher teacher);
}
