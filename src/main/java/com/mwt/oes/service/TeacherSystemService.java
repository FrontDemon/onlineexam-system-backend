package com.mwt.oes.service;

import com.mwt.oes.domain.Teacher;

import java.util.List;

public interface TeacherSystemService {
    public List<Teacher> teacherLogin(String tno, String psw);
    public boolean updateTeacher(Teacher teacher);
    public String getTeaHuPsw(String tno);
}
