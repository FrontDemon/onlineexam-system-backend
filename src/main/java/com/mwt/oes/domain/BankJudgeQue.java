package com.mwt.oes.domain;

public class BankJudgeQue {
    private Integer judgeId;

    private String judgeContent;

    private String judgeAnswer;

    private String composeFlag;

    private String answerExplain;

    private Integer langId;

    private PaperQue paperQue;

    public Integer getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public String getJudgeContent() {
        return judgeContent;
    }

    public void setJudgeContent(String judgeContent) {
        this.judgeContent = judgeContent == null ? null : judgeContent.trim();
    }

    public String getJudgeAnswer() {
        return judgeAnswer;
    }

    public void setJudgeAnswer(String judgeAnswer) {
        this.judgeAnswer = judgeAnswer == null ? null : judgeAnswer.trim();
    }

    public String getComposeFlag() {
        return composeFlag;
    }

    public void setComposeFlag(String composeFlag) {
        this.composeFlag = composeFlag == null ? null : composeFlag.trim();
    }

    public String getAnswerExplain() {
        return answerExplain;
    }

    public void setAnswerExplain(String answerExplain) {
        this.answerExplain = answerExplain == null ? null : answerExplain.trim();
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public PaperQue getPaperQue() {
        return paperQue;
    }

    public void setPaperQue(PaperQue paperQue) {
        this.paperQue = paperQue;
    }
}