package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAnoIsNull() {
            addCriterion("ano is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ano is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(String value) {
            addCriterion("ano =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(String value) {
            addCriterion("ano <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(String value) {
            addCriterion("ano >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(String value) {
            addCriterion("ano >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(String value) {
            addCriterion("ano <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(String value) {
            addCriterion("ano <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLike(String value) {
            addCriterion("ano like", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotLike(String value) {
            addCriterion("ano not like", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<String> values) {
            addCriterion("ano in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<String> values) {
            addCriterion("ano not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(String value1, String value2) {
            addCriterion("ano between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(String value1, String value2) {
            addCriterion("ano not between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAdmPswIsNull() {
            addCriterion("adm_psw is null");
            return (Criteria) this;
        }

        public Criteria andAdmPswIsNotNull() {
            addCriterion("adm_psw is not null");
            return (Criteria) this;
        }

        public Criteria andAdmPswEqualTo(String value) {
            addCriterion("adm_psw =", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswNotEqualTo(String value) {
            addCriterion("adm_psw <>", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswGreaterThan(String value) {
            addCriterion("adm_psw >", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswGreaterThanOrEqualTo(String value) {
            addCriterion("adm_psw >=", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswLessThan(String value) {
            addCriterion("adm_psw <", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswLessThanOrEqualTo(String value) {
            addCriterion("adm_psw <=", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswLike(String value) {
            addCriterion("adm_psw like", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswNotLike(String value) {
            addCriterion("adm_psw not like", value, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswIn(List<String> values) {
            addCriterion("adm_psw in", values, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswNotIn(List<String> values) {
            addCriterion("adm_psw not in", values, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswBetween(String value1, String value2) {
            addCriterion("adm_psw between", value1, value2, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmPswNotBetween(String value1, String value2) {
            addCriterion("adm_psw not between", value1, value2, "admPsw");
            return (Criteria) this;
        }

        public Criteria andAdmNameIsNull() {
            addCriterion("adm_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmNameIsNotNull() {
            addCriterion("adm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmNameEqualTo(String value) {
            addCriterion("adm_name =", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotEqualTo(String value) {
            addCriterion("adm_name <>", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameGreaterThan(String value) {
            addCriterion("adm_name >", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_name >=", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameLessThan(String value) {
            addCriterion("adm_name <", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameLessThanOrEqualTo(String value) {
            addCriterion("adm_name <=", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameLike(String value) {
            addCriterion("adm_name like", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotLike(String value) {
            addCriterion("adm_name not like", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameIn(List<String> values) {
            addCriterion("adm_name in", values, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotIn(List<String> values) {
            addCriterion("adm_name not in", values, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameBetween(String value1, String value2) {
            addCriterion("adm_name between", value1, value2, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotBetween(String value1, String value2) {
            addCriterion("adm_name not between", value1, value2, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmSexIsNull() {
            addCriterion("adm_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdmSexIsNotNull() {
            addCriterion("adm_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdmSexEqualTo(String value) {
            addCriterion("adm_sex =", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotEqualTo(String value) {
            addCriterion("adm_sex <>", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexGreaterThan(String value) {
            addCriterion("adm_sex >", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexGreaterThanOrEqualTo(String value) {
            addCriterion("adm_sex >=", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexLessThan(String value) {
            addCriterion("adm_sex <", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexLessThanOrEqualTo(String value) {
            addCriterion("adm_sex <=", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexLike(String value) {
            addCriterion("adm_sex like", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotLike(String value) {
            addCriterion("adm_sex not like", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexIn(List<String> values) {
            addCriterion("adm_sex in", values, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotIn(List<String> values) {
            addCriterion("adm_sex not in", values, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexBetween(String value1, String value2) {
            addCriterion("adm_sex between", value1, value2, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotBetween(String value1, String value2) {
            addCriterion("adm_sex not between", value1, value2, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmEmailIsNull() {
            addCriterion("adm_email is null");
            return (Criteria) this;
        }

        public Criteria andAdmEmailIsNotNull() {
            addCriterion("adm_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdmEmailEqualTo(String value) {
            addCriterion("adm_email =", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailNotEqualTo(String value) {
            addCriterion("adm_email <>", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailGreaterThan(String value) {
            addCriterion("adm_email >", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailGreaterThanOrEqualTo(String value) {
            addCriterion("adm_email >=", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailLessThan(String value) {
            addCriterion("adm_email <", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailLessThanOrEqualTo(String value) {
            addCriterion("adm_email <=", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailLike(String value) {
            addCriterion("adm_email like", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailNotLike(String value) {
            addCriterion("adm_email not like", value, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailIn(List<String> values) {
            addCriterion("adm_email in", values, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailNotIn(List<String> values) {
            addCriterion("adm_email not in", values, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailBetween(String value1, String value2) {
            addCriterion("adm_email between", value1, value2, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmEmailNotBetween(String value1, String value2) {
            addCriterion("adm_email not between", value1, value2, "admEmail");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneIsNull() {
            addCriterion("adm_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneIsNotNull() {
            addCriterion("adm_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneEqualTo(String value) {
            addCriterion("adm_phone =", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotEqualTo(String value) {
            addCriterion("adm_phone <>", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneGreaterThan(String value) {
            addCriterion("adm_phone >", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("adm_phone >=", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneLessThan(String value) {
            addCriterion("adm_phone <", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneLessThanOrEqualTo(String value) {
            addCriterion("adm_phone <=", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneLike(String value) {
            addCriterion("adm_phone like", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotLike(String value) {
            addCriterion("adm_phone not like", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneIn(List<String> values) {
            addCriterion("adm_phone in", values, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotIn(List<String> values) {
            addCriterion("adm_phone not in", values, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneBetween(String value1, String value2) {
            addCriterion("adm_phone between", value1, value2, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotBetween(String value1, String value2) {
            addCriterion("adm_phone not between", value1, value2, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeIsNull() {
            addCriterion("adm_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeIsNotNull() {
            addCriterion("adm_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeEqualTo(Date value) {
            addCriterion("adm_last_login_time =", value, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeNotEqualTo(Date value) {
            addCriterion("adm_last_login_time <>", value, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeGreaterThan(Date value) {
            addCriterion("adm_last_login_time >", value, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adm_last_login_time >=", value, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeLessThan(Date value) {
            addCriterion("adm_last_login_time <", value, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("adm_last_login_time <=", value, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeIn(List<Date> values) {
            addCriterion("adm_last_login_time in", values, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeNotIn(List<Date> values) {
            addCriterion("adm_last_login_time not in", values, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("adm_last_login_time between", value1, value2, "admLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAdmLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("adm_last_login_time not between", value1, value2, "admLastLoginTime");
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