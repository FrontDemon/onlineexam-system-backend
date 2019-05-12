package com.mwt.oes.domain;

import java.util.Date;

public class StudentFeedback {
    private Integer feedbackId;

    private String feedbackContent;

    private Date feedbackCreateTime;

    private String sno;

    private String stuName;

    private String admAnswer;

    private String ano;

    private String admName;

    private String feedbackStatus;

    private Date replyTime;

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    public Date getFeedbackCreateTime() {
        return feedbackCreateTime;
    }

    public void setFeedbackCreateTime(Date feedbackCreateTime) {
        this.feedbackCreateTime = feedbackCreateTime;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getAdmAnswer() {
        return admAnswer;
    }

    public void setAdmAnswer(String admAnswer) {
        this.admAnswer = admAnswer == null ? null : admAnswer.trim();
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano == null ? null : ano.trim();
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName == null ? null : admName.trim();
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus == null ? null : feedbackStatus.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
}