package com.mwt.oes.domain;

public class BankFillQue {
    private Integer fillId;

    private String fillContent;

    private String fillAnswer;

    private String composeFlag;

    private String answerExplain;

    private Integer langId;

    private PaperQue paperQue;

    public Integer getFillId() {
        return fillId;
    }

    public void setFillId(Integer fillId) {
        this.fillId = fillId;
    }

    public String getFillContent() {
        return fillContent;
    }

    public void setFillContent(String fillContent) {
        this.fillContent = fillContent == null ? null : fillContent.trim();
    }

    public String getFillAnswer() {
        return fillAnswer;
    }

    public void setFillAnswer(String fillAnswer) {
        this.fillAnswer = fillAnswer == null ? null : fillAnswer.trim();
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