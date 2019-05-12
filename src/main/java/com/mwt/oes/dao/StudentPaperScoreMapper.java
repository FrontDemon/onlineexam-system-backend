package com.mwt.oes.dao;

import com.mwt.oes.domain.StudentPaperScore;
import com.mwt.oes.domain.StudentPaperScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentPaperScoreMapper {
    int countByExample(StudentPaperScoreExample example);

    int deleteByExample(StudentPaperScoreExample example);

    int deleteByPrimaryKey(Integer scoreId);

    int insert(StudentPaperScore record);

    int insertSelective(StudentPaperScore record);

    List<StudentPaperScore> selectByExample(StudentPaperScoreExample example);

    StudentPaperScore selectByPrimaryKey(Integer scoreId);

    int updateByExampleSelective(@Param("record") StudentPaperScore record, @Param("example") StudentPaperScoreExample example);

    int updateByExample(@Param("record") StudentPaperScore record, @Param("example") StudentPaperScoreExample example);

    int updateByPrimaryKeySelective(StudentPaperScore record);

    int updateByPrimaryKey(StudentPaperScore record);
}