package com.mwt.oes.service.impl;

import com.mwt.oes.dao.TeacherNoticeMapper;
import com.mwt.oes.domain.TeacherNotice;
import com.mwt.oes.domain.TeacherNoticeExample;
import com.mwt.oes.service.TeacherNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherNoticeServiceImpl implements TeacherNoticeService {

    @Autowired
    TeacherNoticeMapper teacherNoticeMapper;

    @Override
    public List<Map<String, Object>> getNoticesList() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        TeacherNoticeExample teacherNoticeExample = new TeacherNoticeExample();
        teacherNoticeExample.setOrderByClause("notice_id asc");
        List<TeacherNotice> teacherNoticeList = teacherNoticeMapper.selectByExample(teacherNoticeExample);
        for (TeacherNotice teacherNotice : teacherNoticeList){
            Map<String, Object> map = new HashMap<>();
            map.put("id", teacherNoticeList.indexOf(teacherNotice) + 1);
            map.put("noticeId", teacherNotice.getNoticeId());
            map.put("noticeContent", teacherNotice.getNoticeContent());
            map.put("noticeCreateTime", teacherNotice.getNoticeCreateTime());
            map.put("teaName", teacherNotice.getTeaName());
            map.put("tno", teacherNotice.getTno());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public List<Map<String, Object>> searchNoticeInfo(String noticeContent, String teaName) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        TeacherNoticeExample teacherNoticeExample = new TeacherNoticeExample();
        TeacherNoticeExample.Criteria criteria = teacherNoticeExample.createCriteria();
        if(!noticeContent.equals("undefined")) {
            criteria.andNoticeContentLike("%" + noticeContent + "%");
        }
        if(!teaName.equals("undefined")) {
            criteria.andTeaNameLike("%" + teaName + "%");
        }
        teacherNoticeExample.setOrderByClause("notice_id asc");
        List<TeacherNotice> teacherNoticeList = teacherNoticeMapper.selectByExample(teacherNoticeExample);
        for (TeacherNotice teacherNotice : teacherNoticeList){
            Map<String, Object> map = new HashMap<>();
            map.put("id", teacherNoticeList.indexOf(teacherNotice) + 1);
            map.put("noticeId", teacherNotice.getNoticeId());
            map.put("noticeContent", teacherNotice.getNoticeContent());
            map.put("tno", teacherNotice.getTno());
            map.put("noticeCreateTime", teacherNotice.getNoticeCreateTime());
            map.put("teaName", teacherNotice.getTeaName());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public boolean noticeContentIsExist(String noticeContent) {
        TeacherNoticeExample teacherNoticeExample = new TeacherNoticeExample();
        TeacherNoticeExample.Criteria criteria = teacherNoticeExample.createCriteria();
        criteria.andNoticeContentEqualTo(noticeContent);
        List<TeacherNotice> resultList = teacherNoticeMapper.selectByExample(teacherNoticeExample);
        if(resultList.size() > 0){
            return  true;
        } else {
            return false;
        }
    }

    @Override
    public int insertNoticeInfo(TeacherNotice teacherNotice) {
        int result = teacherNoticeMapper.insertSelective(teacherNotice);
        return result;
    }

    @Override
    public int updateNoticeInfo(TeacherNotice teacherNotice) {
        int result = teacherNoticeMapper.updateByPrimaryKeySelective(teacherNotice);
        return result;
    }

    @Override
    public int deleteNotice(Integer noticeId) {
        int result = teacherNoticeMapper.deleteByPrimaryKey(noticeId);
        return result;
    }
}
