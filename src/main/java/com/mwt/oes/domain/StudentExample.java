package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andStuPswIsNull() {
            addCriterion("stu_psw is null");
            return (Criteria) this;
        }

        public Criteria andStuPswIsNotNull() {
            addCriterion("stu_psw is not null");
            return (Criteria) this;
        }

        public Criteria andStuPswEqualTo(String value) {
            addCriterion("stu_psw =", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswNotEqualTo(String value) {
            addCriterion("stu_psw <>", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswGreaterThan(String value) {
            addCriterion("stu_psw >", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswGreaterThanOrEqualTo(String value) {
            addCriterion("stu_psw >=", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswLessThan(String value) {
            addCriterion("stu_psw <", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswLessThanOrEqualTo(String value) {
            addCriterion("stu_psw <=", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswLike(String value) {
            addCriterion("stu_psw like", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswNotLike(String value) {
            addCriterion("stu_psw not like", value, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswIn(List<String> values) {
            addCriterion("stu_psw in", values, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswNotIn(List<String> values) {
            addCriterion("stu_psw not in", values, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswBetween(String value1, String value2) {
            addCriterion("stu_psw between", value1, value2, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuPswNotBetween(String value1, String value2) {
            addCriterion("stu_psw not between", value1, value2, "stuPsw");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcIsNull() {
            addCriterion("stu_img_src is null");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcIsNotNull() {
            addCriterion("stu_img_src is not null");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcEqualTo(String value) {
            addCriterion("stu_img_src =", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcNotEqualTo(String value) {
            addCriterion("stu_img_src <>", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcGreaterThan(String value) {
            addCriterion("stu_img_src >", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("stu_img_src >=", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcLessThan(String value) {
            addCriterion("stu_img_src <", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcLessThanOrEqualTo(String value) {
            addCriterion("stu_img_src <=", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcLike(String value) {
            addCriterion("stu_img_src like", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcNotLike(String value) {
            addCriterion("stu_img_src not like", value, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcIn(List<String> values) {
            addCriterion("stu_img_src in", values, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcNotIn(List<String> values) {
            addCriterion("stu_img_src not in", values, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcBetween(String value1, String value2) {
            addCriterion("stu_img_src between", value1, value2, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuImgSrcNotBetween(String value1, String value2) {
            addCriterion("stu_img_src not between", value1, value2, "stuImgSrc");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("stu_phone like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("stu_phone not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeIsNull() {
            addCriterion("stu_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeIsNotNull() {
            addCriterion("stu_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeEqualTo(Date value) {
            addCriterion("stu_create_time =", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeNotEqualTo(Date value) {
            addCriterion("stu_create_time <>", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeGreaterThan(Date value) {
            addCriterion("stu_create_time >", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_create_time >=", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeLessThan(Date value) {
            addCriterion("stu_create_time <", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_create_time <=", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeIn(List<Date> values) {
            addCriterion("stu_create_time in", values, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeNotIn(List<Date> values) {
            addCriterion("stu_create_time not in", values, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeBetween(Date value1, Date value2) {
            addCriterion("stu_create_time between", value1, value2, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_create_time not between", value1, value2, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeIsNull() {
            addCriterion("stu_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeIsNotNull() {
            addCriterion("stu_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeEqualTo(Date value) {
            addCriterion("stu_last_login_time =", value, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeNotEqualTo(Date value) {
            addCriterion("stu_last_login_time <>", value, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeGreaterThan(Date value) {
            addCriterion("stu_last_login_time >", value, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_last_login_time >=", value, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeLessThan(Date value) {
            addCriterion("stu_last_login_time <", value, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_last_login_time <=", value, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeIn(List<Date> values) {
            addCriterion("stu_last_login_time in", values, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeNotIn(List<Date> values) {
            addCriterion("stu_last_login_time not in", values, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("stu_last_login_time between", value1, value2, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_last_login_time not between", value1, value2, "stuLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(String value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(String value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(String value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(String value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(String value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLike(String value) {
            addCriterion("stu_status like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotLike(String value) {
            addCriterion("stu_status not like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<String> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<String> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(String value1, String value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(String value1, String value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeIsNull() {
            addCriterion("stu_security_code is null");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeIsNotNull() {
            addCriterion("stu_security_code is not null");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeEqualTo(String value) {
            addCriterion("stu_security_code =", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeNotEqualTo(String value) {
            addCriterion("stu_security_code <>", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeGreaterThan(String value) {
            addCriterion("stu_security_code >", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_security_code >=", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeLessThan(String value) {
            addCriterion("stu_security_code <", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeLessThanOrEqualTo(String value) {
            addCriterion("stu_security_code <=", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeLike(String value) {
            addCriterion("stu_security_code like", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeNotLike(String value) {
            addCriterion("stu_security_code not like", value, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeIn(List<String> values) {
            addCriterion("stu_security_code in", values, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeNotIn(List<String> values) {
            addCriterion("stu_security_code not in", values, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeBetween(String value1, String value2) {
            addCriterion("stu_security_code between", value1, value2, "stuSecurityCode");
            return (Criteria) this;
        }

        public Criteria andStuSecurityCodeNotBetween(String value1, String value2) {
            addCriterion("stu_security_code not between", value1, value2, "stuSecurityCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}