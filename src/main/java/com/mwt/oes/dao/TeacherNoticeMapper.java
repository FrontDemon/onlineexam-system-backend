package com.mwt.oes.dao;

import com.mwt.oes.domain.TeacherNotice;
import com.mwt.oes.domain.TeacherNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherNoticeMapper {
    int countByExample(TeacherNoticeExample example);

    int deleteByExample(TeacherNoticeExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(TeacherNotice record);

    int insertSelective(TeacherNotice record);

    List<TeacherNotice> selectByExample(TeacherNoticeExample example);

    TeacherNotice selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") TeacherNotice record, @Param("example") TeacherNoticeExample example);

    int updateByExample(@Param("record") TeacherNotice record, @Param("example") TeacherNoticeExample example);

    int updateByPrimaryKeySelective(TeacherNotice record);

    int updateByPrimaryKey(TeacherNotice record);
}