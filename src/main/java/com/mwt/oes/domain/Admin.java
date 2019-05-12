package com.mwt.oes.domain;

import java.util.Date;

public class Admin {
    private String ano;

    private String admPsw;

    private String admName;

    private String admSex;

    private String admEmail;

    private String admPhone;

    private Date admLastLoginTime;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano == null ? null : ano.trim();
    }

    public String getAdmPsw() {
        return admPsw;
    }

    public void setAdmPsw(String admPsw) {
        this.admPsw = admPsw == null ? null : admPsw.trim();
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName == null ? null : admName.trim();
    }

    public String getAdmSex() {
        return admSex;
    }

    public void setAdmSex(String admSex) {
        this.admSex = admSex == null ? null : admSex.trim();
    }

    public String getAdmEmail() {
        return admEmail;
    }

    public void setAdmEmail(String admEmail) {
        this.admEmail = admEmail == null ? null : admEmail.trim();
    }

    public String getAdmPhone() {
        return admPhone;
    }

    public void setAdmPhone(String admPhone) {
        this.admPhone = admPhone == null ? null : admPhone.trim();
    }

    public Date getAdmLastLoginTime() {
        return admLastLoginTime;
    }

    public void setAdmLastLoginTime(Date admLastLoginTime) {
        this.admLastLoginTime = admLastLoginTime;
    }
}