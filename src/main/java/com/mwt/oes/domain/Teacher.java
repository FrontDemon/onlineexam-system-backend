package com.mwt.oes.domain;

import java.util.Date;

public class Teacher {
    private String tno;

    private String teaPsw;

    private String teaName;

    private String teaSex;

    private String teaEmail;

    private String teaPhone;

    private Date teaLastLoginTime;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public String getTeaPsw() {
        return teaPsw;
    }

    public void setTeaPsw(String teaPsw) {
        this.teaPsw = teaPsw == null ? null : teaPsw.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    public String getTeaEmail() {
        return teaEmail;
    }

    public void setTeaEmail(String teaEmail) {
        this.teaEmail = teaEmail == null ? null : teaEmail.trim();
    }

    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone == null ? null : teaPhone.trim();
    }

    public Date getTeaLastLoginTime() {
        return teaLastLoginTime;
    }

    public void setTeaLastLoginTime(Date teaLastLoginTime) {
        this.teaLastLoginTime = teaLastLoginTime;
    }
}