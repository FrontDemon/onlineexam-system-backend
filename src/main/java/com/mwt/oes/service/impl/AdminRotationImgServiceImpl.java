package com.mwt.oes.service.impl;

import com.mwt.oes.dao.StudentHomeRotationImgMapper;
import com.mwt.oes.domain.StudentHomeRotationImg;
import com.mwt.oes.domain.StudentHomeRotationImgExample;
import com.mwt.oes.service.AdminRotationImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AdminRotationImgServiceImpl implements AdminRotationImgService {

    @Autowired
    StudentHomeRotationImgMapper studentHomeRotationImgMapper;

    @Override
    public List<Map<String, Object>> getRotationImgsList() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        StudentHomeRotationImgExample studentHomeRotationImgExample = new StudentHomeRotationImgExample();
        studentHomeRotationImgExample.setOrderByClause("img_id asc");
        List<StudentHomeRotationImg> studentHomeRotationImgList = studentHomeRotationImgMapper.selectByExample(studentHomeRotationImgExample);
        for (StudentHomeRotationImg studentHomeRotationImg : studentHomeRotationImgList) {
            int index = studentHomeRotationImgList.indexOf(studentHomeRotationImg);
            Map<String, Object> map = new HashMap<>();
            map.put("id", index + 1);
            map.put("imgId", studentHomeRotationImg.getImgId());
            map.put("imgTitle", studentHomeRotationImg.getImgTitle());
            map.put("imgCreateTime", studentHomeRotationImg.getImgCreateTime());
            map.put("imgSrc", studentHomeRotationImg.getImgSrc());
            map.put("ano", studentHomeRotationImg.getAno());
            map.put("admName", studentHomeRotationImg.getAdmName());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public List<Map<String, Object>> searchRotationImgsList(String imgTitle, String admName) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        StudentHomeRotationImgExample studentHomeRotationImgExample = new StudentHomeRotationImgExample();
        StudentHomeRotationImgExample.Criteria criteria = studentHomeRotationImgExample.createCriteria();
        if (!imgTitle.equals("undefined")) {
            criteria.andImgTitleLike("%" + imgTitle + "%");
        }
        if (!admName.equals("undefined")) {
            criteria.andAdmNameLike("%" + admName + "%");
        }
        studentHomeRotationImgExample.setOrderByClause("img_id asc");
        List<StudentHomeRotationImg> studentHomeRotationImgList = studentHomeRotationImgMapper.selectByExample(studentHomeRotationImgExample);
        for (StudentHomeRotationImg studentHomeRotationImg : studentHomeRotationImgList) {
            int index = studentHomeRotationImgList.indexOf(studentHomeRotationImg);
            Map<String, Object> map = new HashMap<>();
            map.put("id", index + 1);
            map.put("imgId", studentHomeRotationImg.getImgId());
            map.put("imgTitle", studentHomeRotationImg.getImgTitle());
            map.put("imgSrc", studentHomeRotationImg.getImgSrc());
            map.put("ano", studentHomeRotationImg.getAno());
            map.put("imgCreateTime", studentHomeRotationImg.getImgCreateTime());
            map.put("admName", studentHomeRotationImg.getAdmName());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public int insertRotationImgInfo(StudentHomeRotationImg studentHomeRotationImg) {
        studentHomeRotationImg.setImgCreateTime(new Date());
        int result = studentHomeRotationImgMapper.insertSelective(studentHomeRotationImg);
        return result;
    }

    @Override
    public int updateRotationImgInfo(StudentHomeRotationImg studentHomeRotationImg) {
        int result = studentHomeRotationImgMapper.updateByPrimaryKeySelective(studentHomeRotationImg);
        return result;
    }

    @Override
    public int deleteRotationImgInfo(Integer imgId) {
        int result = studentHomeRotationImgMapper.deleteByPrimaryKey(imgId);
        return result;
    }
}
