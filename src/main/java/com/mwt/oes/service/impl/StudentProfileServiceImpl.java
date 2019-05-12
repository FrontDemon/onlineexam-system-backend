package com.mwt.oes.service.impl;

import com.mwt.oes.controller.StudentSystemController;
import com.mwt.oes.dao.PaperMapper;
import com.mwt.oes.dao.StudentFeedbackMapper;
import com.mwt.oes.dao.StudentPaperScoreMapper;
import com.mwt.oes.dao.TeacherNoticeMapper;
import com.mwt.oes.domain.*;
import com.mwt.oes.service.StudentHomeService;
import com.mwt.oes.service.StudentProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    @Autowired
    StudentFeedbackMapper studentFeedbackMapper;
    @Autowired
    TeacherNoticeMapper teacherNoticeMapper;
    @Autowired
    StudentPaperScoreMapper studentPaperScoreMapper;
    @Autowired
    PaperMapper paperMapper;
    @Autowired
    StudentHomeService studentHomeService;

    //Log4j日志处理
    public static Logger log = LoggerFactory.getLogger(StudentSystemController.class);

    /*
        学生我的页面反馈留言
     */
    @Override
    public int studentSendFeedback(String content, Date createTime, String sno, String stuName) {
        StudentFeedback studentFeedback = new StudentFeedback();
        studentFeedback.setFeedbackContent(content);
        studentFeedback.setFeedbackCreateTime(createTime);
        studentFeedback.setSno(sno);
        studentFeedback.setStuName(stuName);
        int result = studentFeedbackMapper.insertSelective(studentFeedback);

        return result;
    }

    /*
        我的页面顶部右侧管理员回复消息提醒
    */
    @Override
    public int getAdminReplyCount(String sno, String feedbackStatus){
        StudentFeedbackExample example = new StudentFeedbackExample();
        StudentFeedbackExample.Criteria criteria = example.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andFeedbackStatusEqualTo(feedbackStatus);
        int count = studentFeedbackMapper.countByExample(example);
        return count;
    }

    /*
        更新反馈信息状态为学生端已读取
     */
    @Override
    public int updateFeedbackStatusBySno(String sno, String feedbackStatus) {
        StudentFeedbackExample example = new StudentFeedbackExample();
        StudentFeedbackExample.Criteria criteria = example.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andFeedbackStatusEqualTo(feedbackStatus);

        StudentFeedback studentFeedback = new StudentFeedback();
        studentFeedback.setFeedbackStatus("2");
        int count = studentFeedbackMapper.updateByExampleSelective(studentFeedback,example);
        return count;
    }

    /*
        通过学号获取反馈信息
     */
    @Override
    public List<StudentFeedback> getFeedbackInfoBySno(String sno, String feedbackStatus) {
        StudentFeedbackExample example = new StudentFeedbackExample();
        StudentFeedbackExample.Criteria criteria = example.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andFeedbackStatusEqualTo(feedbackStatus);
        example.setOrderByClause("reply_time asc");
        List<StudentFeedback> result = studentFeedbackMapper.selectByExample(example);

        StudentFeedbackExample example2 = new StudentFeedbackExample();
        StudentFeedbackExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andSnoEqualTo(sno);
        criteria2.andFeedbackStatusEqualTo("1");
        example2.setOrderByClause("reply_time asc");
        List<StudentFeedback> result2 = studentFeedbackMapper.selectByExample(example2);

        for (StudentFeedback studentFeedback : result2){
            result.add(studentFeedback);
        }

        return result;
    }


    /*
        获取考试日历,即教师公告
     */
    @Override
    public List<TeacherNotice> getTeacherNotice() {
        TeacherNoticeExample example = new TeacherNoticeExample();
        example.setOrderByClause("notice_create_time desc");
        List<TeacherNotice> result = teacherNoticeMapper.selectByExample(example);
        return result;
    }

    /*
        通过学号sno获取学生试卷成绩信息
    */
    @Override
    public List<Map<String, Object>> getPaperScoreInfoBySno(String sno){

        List<Map<String, Object>> resultList = new ArrayList<>();

        StudentPaperScoreExample studentPaperScoreExample = new StudentPaperScoreExample();
        StudentPaperScoreExample.Criteria criteria = studentPaperScoreExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        studentPaperScoreExample.setOrderByClause("start_time desc");
        List<StudentPaperScore> studentPaperScoreList = studentPaperScoreMapper.selectByExample(studentPaperScoreExample);
        for (StudentPaperScore studentPaperScore : studentPaperScoreList){
            Map<String, Object> map = new HashMap<>();
            map.put("scoreId",studentPaperScore.getScoreId());
            map.put("score",studentPaperScore.getScore());
            map.put("timeUsed",studentPaperScore.getTimeUsed());
            map.put("startTime",studentPaperScore.getStartTime());
            map.put("endTime",studentPaperScore.getEndTime());
            map.put("paperId",studentPaperScore.getPaperId());

            Paper paper = paperMapper.selectByPrimaryKey(studentPaperScore.getPaperId());
            map.put("paperName",paper.getPaperName());
            map.put("paperCreateTime",paper.getPaperCreateTime());
            map.put("paperDuration",paper.getPaperDuration());
            map.put("paperDifficulty",paper.getPaperDifficulty());
            map.put("paperType",paper.getPaperType());
            map.put("paperDuration",paper.getPaperDuration());
            map.put("participateNum",paper.getParticipateNum());

            //计算试卷总分
            Map<String, Integer> numObj = studentHomeService.getPaperQueNumByPaperId(paper.getPaperId());
            int singleNum = numObj.get("singleNum");
            int multipleNum = numObj.get("multipleNum");
            int judgeNum = numObj.get("judgeNum");
            int fillNum = numObj.get("fillNum");
            int totalScore = singleNum*paper.getSingleScore() + multipleNum*paper.getMultipleScore()
                    + judgeNum*paper.getJudgeScore() + fillNum*paper.getFillScore();
            map.put("totalScore",totalScore);

            resultList.add(map);
        }
        return resultList;
    }
}
