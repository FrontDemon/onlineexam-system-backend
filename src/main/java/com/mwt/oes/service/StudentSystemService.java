package com.mwt.oes.service;

import com.mwt.oes.domain.Student;

import java.util.Date;
import java.util.List;

public interface StudentSystemService {
    public Student getStudentInfoBySno(String sno);
    public List<Student> checkStudentPsw(String sno, String stuPsw);
    public boolean snoIsExist(String sno);
    public int registerStudent(String sno, String stuPsw, String stuName, String stuSex,
                               String stuEmail, String stuPhone, Date stuCreateTime,
                               String stuSecurityCode);
    public boolean updateStudent(Student student);
}
