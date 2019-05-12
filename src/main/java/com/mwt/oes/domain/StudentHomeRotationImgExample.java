package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentHomeRotationImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentHomeRotationImgExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgTitleIsNull() {
            addCriterion("img_title is null");
            return (Criteria) this;
        }

        public Criteria andImgTitleIsNotNull() {
            addCriterion("img_title is not null");
            return (Criteria) this;
        }

        public Criteria andImgTitleEqualTo(String value) {
            addCriterion("img_title =", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotEqualTo(String value) {
            addCriterion("img_title <>", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleGreaterThan(String value) {
            addCriterion("img_title >", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("img_title >=", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleLessThan(String value) {
            addCriterion("img_title <", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleLessThanOrEqualTo(String value) {
            addCriterion("img_title <=", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleLike(String value) {
            addCriterion("img_title like", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotLike(String value) {
            addCriterion("img_title not like", value, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleIn(List<String> values) {
            addCriterion("img_title in", values, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotIn(List<String> values) {
            addCriterion("img_title not in", values, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleBetween(String value1, String value2) {
            addCriterion("img_title between", value1, value2, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgTitleNotBetween(String value1, String value2) {
            addCriterion("img_title not between", value1, value2, "imgTitle");
            return (Criteria) this;
        }

        public Criteria andImgSrcIsNull() {
            addCriterion("img_src is null");
            return (Criteria) this;
        }

        public Criteria andImgSrcIsNotNull() {
            addCriterion("img_src is not null");
            return (Criteria) this;
        }

        public Criteria andImgSrcEqualTo(String value) {
            addCriterion("img_src =", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotEqualTo(String value) {
            addCriterion("img_src <>", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcGreaterThan(String value) {
            addCriterion("img_src >", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("img_src >=", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLessThan(String value) {
            addCriterion("img_src <", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLessThanOrEqualTo(String value) {
            addCriterion("img_src <=", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLike(String value) {
            addCriterion("img_src like", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotLike(String value) {
            addCriterion("img_src not like", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcIn(List<String> values) {
            addCriterion("img_src in", values, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotIn(List<String> values) {
            addCriterion("img_src not in", values, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcBetween(String value1, String value2) {
            addCriterion("img_src between", value1, value2, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotBetween(String value1, String value2) {
            addCriterion("img_src not between", value1, value2, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeIsNull() {
            addCriterion("img_create_time is null");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeIsNotNull() {
            addCriterion("img_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeEqualTo(Date value) {
            addCriterion("img_create_time =", value, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeNotEqualTo(Date value) {
            addCriterion("img_create_time <>", value, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeGreaterThan(Date value) {
            addCriterion("img_create_time >", value, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("img_create_time >=", value, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeLessThan(Date value) {
            addCriterion("img_create_time <", value, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("img_create_time <=", value, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeIn(List<Date> values) {
            addCriterion("img_create_time in", values, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeNotIn(List<Date> values) {
            addCriterion("img_create_time not in", values, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeBetween(Date value1, Date value2) {
            addCriterion("img_create_time between", value1, value2, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andImgCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("img_create_time not between", value1, value2, "imgCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnoIsNull() {
            addCriterion("ano is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ano is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(Integer value) {
            addCriterion("ano =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(Integer value) {
            addCriterion("ano <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(Integer value) {
            addCriterion("ano >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ano >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(Integer value) {
            addCriterion("ano <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(Integer value) {
            addCriterion("ano <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<Integer> values) {
            addCriterion("ano in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<Integer> values) {
            addCriterion("ano not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(Integer value1, Integer value2) {
            addCriterion("ano between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(Integer value1, Integer value2) {
            addCriterion("ano not between", value1, value2, "ano");
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