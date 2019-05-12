package com.mwt.oes.domain;

public class BankMultipleChoiceQue {
    private Integer multipleId;

    private String multipleContent;

    private String choiceA;

    private String choiceB;

    private String choiceC;

    private String choiceD;

    private String choiceE;

    private String choiceF;

    private String choiceG;

    private String multipleAnswer;

    private String composeFlag;

    private String answerExplain;

    private Integer langId;

    private PaperQue paperQue;

    public Integer getMultipleId() {
        return multipleId;
    }

    public void setMultipleId(Integer multipleId) {
        this.multipleId = multipleId;
    }

    public String getMultipleContent() {
        return multipleContent;
    }

    public void setMultipleContent(String multipleContent) {
        this.multipleContent = multipleContent == null ? null : multipleContent.trim();
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA == null ? null : choiceA.trim();
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB == null ? null : choiceB.trim();
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC == null ? null : choiceC.trim();
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD == null ? null : choiceD.trim();
    }

    public String getChoiceE() {
        return choiceE;
    }

    public void setChoiceE(String choiceE) {
        this.choiceE = choiceE == null ? null : choiceE.trim();
    }

    public String getChoiceF() {
        return choiceF;
    }

    public void setChoiceF(String choiceF) {
        this.choiceF = choiceF == null ? null : choiceF.trim();
    }

    public String getChoiceG() {
        return choiceG;
    }

    public void setChoiceG(String choiceG) {
        this.choiceG = choiceG == null ? null : choiceG.trim();
    }

    public String getMultipleAnswer() {
        return multipleAnswer;
    }

    public void setMultipleAnswer(String multipleAnswer) {
        this.multipleAnswer = multipleAnswer == null ? null : multipleAnswer.trim();
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