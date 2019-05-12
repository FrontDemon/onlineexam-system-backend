package com.mwt.oes.domain;

import java.util.Date;

public class Paper {
    private Integer paperId;

    private String paperName;

    private Date paperCreateTime;

    private Integer paperDuration;

    private Integer paperDifficulty;

    private String paperAttention;

    private Integer paperType;

    private Integer singleScore;

    private Integer multipleScore;

    private Integer judgeScore;

    private Integer fillScore;

    private Integer langId;

    private Integer participateNum;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Date getPaperCreateTime() {
        return paperCreateTime;
    }

    public void setPaperCreateTime(Date paperCreateTime) {
        this.paperCreateTime = paperCreateTime;
    }

    public Integer getPaperDuration() {
        return paperDuration;
    }

    public void setPaperDuration(Integer paperDuration) {
        this.paperDuration = paperDuration;
    }

    public Integer getPaperDifficulty() {
        return paperDifficulty;
    }

    public void setPaperDifficulty(Integer paperDifficulty) {
        this.paperDifficulty = paperDifficulty;
    }

    public String getPaperAttention() {
        return paperAttention;
    }

    public void setPaperAttention(String paperAttention) {
        this.paperAttention = paperAttention == null ? null : paperAttention.trim();
    }

    public Integer getPaperType() {
        return paperType;
    }

    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public Integer getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(Integer singleScore) {
        this.singleScore = singleScore;
    }

    public Integer getMultipleScore() {
        return multipleScore;
    }

    public void setMultipleScore(Integer multipleScore) {
        this.multipleScore = multipleScore;
    }

    public Integer getJudgeScore() {
        return judgeScore;
    }

    public void setJudgeScore(Integer judgeScore) {
        this.judgeScore = judgeScore;
    }

    public Integer getFillScore() {
        return fillScore;
    }

    public void setFillScore(Integer fillScore) {
        this.fillScore = fillScore;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public Integer getParticipateNum() {
        return participateNum;
    }

    public void setParticipateNum(Integer participateNum) {
        this.participateNum = participateNum;
    }
}