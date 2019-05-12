package com.mwt.oes.service;

import com.mwt.oes.domain.StudentFeedback;
import com.mwt.oes.domain.TeacherNotice;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StudentProfileService {
    public int studentSendFeedback(String content, Date createTime, String sno, String stuName);
    public int getAdminReplyCount(String sno, String feedbackStatus);
    public int updateFeedbackStatusBySno(String sno, String feedbackStatus);
    public List<StudentFeedback> getFeedbackInfoBySno(String sno, String feedbackStatus);
    public List<TeacherNotice> getTeacherNotice();
    public List<Map<String, Object>> getPaperScoreInfoBySno(String sno);
}
