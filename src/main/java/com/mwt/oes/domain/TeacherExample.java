package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTnoIsNull() {
            addCriterion("tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(String value) {
            addCriterion("tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(String value) {
            addCriterion("tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(String value) {
            addCriterion("tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(String value) {
            addCriterion("tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(String value) {
            addCriterion("tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(String value) {
            addCriterion("tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLike(String value) {
            addCriterion("tno like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotLike(String value) {
            addCriterion("tno not like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<String> values) {
            addCriterion("tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<String> values) {
            addCriterion("tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(String value1, String value2) {
            addCriterion("tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(String value1, String value2) {
            addCriterion("tno not between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTeaPswIsNull() {
            addCriterion("tea_psw is null");
            return (Criteria) this;
        }

        public Criteria andTeaPswIsNotNull() {
            addCriterion("tea_psw is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPswEqualTo(String value) {
            addCriterion("tea_psw =", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswNotEqualTo(String value) {
            addCriterion("tea_psw <>", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswGreaterThan(String value) {
            addCriterion("tea_psw >", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswGreaterThanOrEqualTo(String value) {
            addCriterion("tea_psw >=", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswLessThan(String value) {
            addCriterion("tea_psw <", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswLessThanOrEqualTo(String value) {
            addCriterion("tea_psw <=", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswLike(String value) {
            addCriterion("tea_psw like", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswNotLike(String value) {
            addCriterion("tea_psw not like", value, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswIn(List<String> values) {
            addCriterion("tea_psw in", values, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswNotIn(List<String> values) {
            addCriterion("tea_psw not in", values, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswBetween(String value1, String value2) {
            addCriterion("tea_psw between", value1, value2, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaPswNotBetween(String value1, String value2) {
            addCriterion("tea_psw not between", value1, value2, "teaPsw");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_sex like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_sex not like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNull() {
            addCriterion("tea_email is null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNotNull() {
            addCriterion("tea_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailEqualTo(String value) {
            addCriterion("tea_email =", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotEqualTo(String value) {
            addCriterion("tea_email <>", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThan(String value) {
            addCriterion("tea_email >", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tea_email >=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThan(String value) {
            addCriterion("tea_email <", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThanOrEqualTo(String value) {
            addCriterion("tea_email <=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLike(String value) {
            addCriterion("tea_email like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotLike(String value) {
            addCriterion("tea_email not like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIn(List<String> values) {
            addCriterion("tea_email in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotIn(List<String> values) {
            addCriterion("tea_email not in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailBetween(String value1, String value2) {
            addCriterion("tea_email between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotBetween(String value1, String value2) {
            addCriterion("tea_email not between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIsNull() {
            addCriterion("tea_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIsNotNull() {
            addCriterion("tea_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneEqualTo(String value) {
            addCriterion("tea_phone =", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotEqualTo(String value) {
            addCriterion("tea_phone <>", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneGreaterThan(String value) {
            addCriterion("tea_phone >", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tea_phone >=", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLessThan(String value) {
            addCriterion("tea_phone <", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLessThanOrEqualTo(String value) {
            addCriterion("tea_phone <=", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLike(String value) {
            addCriterion("tea_phone like", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotLike(String value) {
            addCriterion("tea_phone not like", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIn(List<String> values) {
            addCriterion("tea_phone in", values, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotIn(List<String> values) {
            addCriterion("tea_phone not in", values, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneBetween(String value1, String value2) {
            addCriterion("tea_phone between", value1, value2, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotBetween(String value1, String value2) {
            addCriterion("tea_phone not between", value1, value2, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeIsNull() {
            addCriterion("tea_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeIsNotNull() {
            addCriterion("tea_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeEqualTo(Date value) {
            addCriterion("tea_last_login_time =", value, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeNotEqualTo(Date value) {
            addCriterion("tea_last_login_time <>", value, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeGreaterThan(Date value) {
            addCriterion("tea_last_login_time >", value, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_last_login_time >=", value, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeLessThan(Date value) {
            addCriterion("tea_last_login_time <", value, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("tea_last_login_time <=", value, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeIn(List<Date> values) {
            addCriterion("tea_last_login_time in", values, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeNotIn(List<Date> values) {
            addCriterion("tea_last_login_time not in", values, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("tea_last_login_time between", value1, value2, "teaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTeaLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("tea_last_login_time not between", value1, value2, "teaLastLoginTime");
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