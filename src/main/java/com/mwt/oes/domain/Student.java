package com.mwt.oes.domain;

import java.util.Date;

public class Student {
    private String sno;

    private String stuPsw;

    private String stuName;

    private String stuImgSrc;

    private String stuSex;

    private String stuEmail;

    private String stuPhone;

    private Date stuCreateTime;

    private Date stuLastLoginTime;

    private String stuStatus;

    private String stuSecurityCode;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getStuPsw() {
        return stuPsw;
    }

    public void setStuPsw(String stuPsw) {
        this.stuPsw = stuPsw == null ? null : stuPsw.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuImgSrc() {
        return stuImgSrc;
    }

    public void setStuImgSrc(String stuImgSrc) {
        this.stuImgSrc = stuImgSrc == null ? null : stuImgSrc.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public Date getStuCreateTime() {
        return stuCreateTime;
    }

    public void setStuCreateTime(Date stuCreateTime) {
        this.stuCreateTime = stuCreateTime;
    }

    public Date getStuLastLoginTime() {
        return stuLastLoginTime;
    }

    public void setStuLastLoginTime(Date stuLastLoginTime) {
        this.stuLastLoginTime = stuLastLoginTime;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus == null ? null : stuStatus.trim();
    }

    public String getStuSecurityCode() {
        return stuSecurityCode;
    }

    public void setStuSecurityCode(String stuSecurityCode) {
        this.stuSecurityCode = stuSecurityCode == null ? null : stuSecurityCode.trim();
    }
}