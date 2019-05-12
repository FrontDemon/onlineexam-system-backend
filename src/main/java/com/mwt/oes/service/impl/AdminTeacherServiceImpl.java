package com.mwt.oes.service.impl;

import com.mwt.oes.dao.TeacherMapper;
import com.mwt.oes.domain.Teacher;
import com.mwt.oes.domain.TeacherExample;
import com.mwt.oes.service.AdminTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminTeacherServiceImpl implements AdminTeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Map<String, Object> insertTeacherInfoList(List<Map<String, Object>> teacherList) {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        int successItemCount = 0;
        for (Map<String, Object> teacherSingle : teacherList){
            Map<String, Object> responseTeacher = new HashMap<>();
            String tno = (String) teacherSingle.get("tno");
            String teaName = (String) teacherSingle.get("teaName");
            String teaSex = (String) teacherSingle.get("teaSex");
            responseTeacher.put("教工号", tno);
            responseTeacher.put("姓名", teaName);
            responseTeacher.put("性别", teaSex);
            boolean isRegistered = tnoIsExist(tno);
            if (isRegistered) {
                responseTeacher.put("上传状态", "失败，该教工号号已被注册");
            } else {
                responseTeacher.put("上传状态", "成功");
                successItemCount++;
                Teacher teacher = new Teacher();
                teacher.setTno(tno);
                teacher.setTeaName(teaName);
                teacher.setTeaSex(teaSex);
                int insertResult = teacherMapper.insertSelective(teacher);
            }
            responseList.add(responseTeacher);
        }
        map.put("responseList", responseList);
        map.put("allItemCount", teacherList.size());
        map.put("successItemCount", successItemCount);
        map.put("failItemCount", teacherList.size() - successItemCount);
        return map;
    }

    @Override
    public boolean tnoIsExist(String tno) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(tno);
        if (teacher != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Teacher> getTeachersList() {
        TeacherExample teacherExample = new TeacherExample();
        teacherExample.setOrderByClause("tno asc");
        List<Teacher> resultList = teacherMapper.selectByExample(teacherExample);
        return resultList;
    }

    @Override
    public int updateTeacherInfo(Teacher teacher) {
        int result = teacherMapper.updateByPrimaryKeySelective(teacher);
        return result;
    }

    @Override
    public List<Teacher> searchTeacherInfo(String tno, String teaName, String teaSex) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        if (!tno.equals("undefined")){
            criteria.andTnoLike("%" + tno + "%");
        }
        if (!teaName.equals("undefined")){
            criteria.andTeaNameLike("%" + teaName + "%");
        }
        if (!teaSex.equals("undefined")){
            criteria.andTeaSexEqualTo(teaSex);
        }
        teacherExample.setOrderByClause("tno asc");
        List<Teacher> resultList = teacherMapper.selectByExample(teacherExample);
        return resultList;
    }

    @Override
    public int insertTeacherInfo(Teacher teacher) {
        int result = teacherMapper.insertSelective(teacher);
        return result;
    }
}
