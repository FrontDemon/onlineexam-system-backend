package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramingLanguageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgramingLanguageExample() {
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

        public Criteria andLangIdIsNull() {
            addCriterion("lang_id is null");
            return (Criteria) this;
        }

        public Criteria andLangIdIsNotNull() {
            addCriterion("lang_id is not null");
            return (Criteria) this;
        }

        public Criteria andLangIdEqualTo(Integer value) {
            addCriterion("lang_id =", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotEqualTo(Integer value) {
            addCriterion("lang_id <>", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdGreaterThan(Integer value) {
            addCriterion("lang_id >", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lang_id >=", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdLessThan(Integer value) {
            addCriterion("lang_id <", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdLessThanOrEqualTo(Integer value) {
            addCriterion("lang_id <=", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdIn(List<Integer> values) {
            addCriterion("lang_id in", values, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotIn(List<Integer> values) {
            addCriterion("lang_id not in", values, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdBetween(Integer value1, Integer value2) {
            addCriterion("lang_id between", value1, value2, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lang_id not between", value1, value2, "langId");
            return (Criteria) this;
        }

        public Criteria andLangNameIsNull() {
            addCriterion("lang_name is null");
            return (Criteria) this;
        }

        public Criteria andLangNameIsNotNull() {
            addCriterion("lang_name is not null");
            return (Criteria) this;
        }

        public Criteria andLangNameEqualTo(String value) {
            addCriterion("lang_name =", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotEqualTo(String value) {
            addCriterion("lang_name <>", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameGreaterThan(String value) {
            addCriterion("lang_name >", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameGreaterThanOrEqualTo(String value) {
            addCriterion("lang_name >=", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameLessThan(String value) {
            addCriterion("lang_name <", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameLessThanOrEqualTo(String value) {
            addCriterion("lang_name <=", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameLike(String value) {
            addCriterion("lang_name like", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotLike(String value) {
            addCriterion("lang_name not like", value, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameIn(List<String> values) {
            addCriterion("lang_name in", values, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotIn(List<String> values) {
            addCriterion("lang_name not in", values, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameBetween(String value1, String value2) {
            addCriterion("lang_name between", value1, value2, "langName");
            return (Criteria) this;
        }

        public Criteria andLangNameNotBetween(String value1, String value2) {
            addCriterion("lang_name not between", value1, value2, "langName");
            return (Criteria) this;
        }

        public Criteria andLangDescIsNull() {
            addCriterion("lang_desc is null");
            return (Criteria) this;
        }

        public Criteria andLangDescIsNotNull() {
            addCriterion("lang_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLangDescEqualTo(String value) {
            addCriterion("lang_desc =", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescNotEqualTo(String value) {
            addCriterion("lang_desc <>", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescGreaterThan(String value) {
            addCriterion("lang_desc >", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescGreaterThanOrEqualTo(String value) {
            addCriterion("lang_desc >=", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescLessThan(String value) {
            addCriterion("lang_desc <", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescLessThanOrEqualTo(String value) {
            addCriterion("lang_desc <=", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescLike(String value) {
            addCriterion("lang_desc like", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescNotLike(String value) {
            addCriterion("lang_desc not like", value, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescIn(List<String> values) {
            addCriterion("lang_desc in", values, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescNotIn(List<String> values) {
            addCriterion("lang_desc not in", values, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescBetween(String value1, String value2) {
            addCriterion("lang_desc between", value1, value2, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangDescNotBetween(String value1, String value2) {
            addCriterion("lang_desc not between", value1, value2, "langDesc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcIsNull() {
            addCriterion("lang_img_src is null");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcIsNotNull() {
            addCriterion("lang_img_src is not null");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcEqualTo(String value) {
            addCriterion("lang_img_src =", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcNotEqualTo(String value) {
            addCriterion("lang_img_src <>", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcGreaterThan(String value) {
            addCriterion("lang_img_src >", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("lang_img_src >=", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcLessThan(String value) {
            addCriterion("lang_img_src <", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcLessThanOrEqualTo(String value) {
            addCriterion("lang_img_src <=", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcLike(String value) {
            addCriterion("lang_img_src like", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcNotLike(String value) {
            addCriterion("lang_img_src not like", value, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcIn(List<String> values) {
            addCriterion("lang_img_src in", values, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcNotIn(List<String> values) {
            addCriterion("lang_img_src not in", values, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcBetween(String value1, String value2) {
            addCriterion("lang_img_src between", value1, value2, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangImgSrcNotBetween(String value1, String value2) {
            addCriterion("lang_img_src not between", value1, value2, "langImgSrc");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeIsNull() {
            addCriterion("lang_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeIsNotNull() {
            addCriterion("lang_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeEqualTo(Date value) {
            addCriterion("lang_create_time =", value, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeNotEqualTo(Date value) {
            addCriterion("lang_create_time <>", value, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeGreaterThan(Date value) {
            addCriterion("lang_create_time >", value, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lang_create_time >=", value, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeLessThan(Date value) {
            addCriterion("lang_create_time <", value, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("lang_create_time <=", value, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeIn(List<Date> values) {
            addCriterion("lang_create_time in", values, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeNotIn(List<Date> values) {
            addCriterion("lang_create_time not in", values, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeBetween(Date value1, Date value2) {
            addCriterion("lang_create_time between", value1, value2, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("lang_create_time not between", value1, value2, "langCreateTime");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByIsNull() {
            addCriterion("lang_created_by is null");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByIsNotNull() {
            addCriterion("lang_created_by is not null");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByEqualTo(String value) {
            addCriterion("lang_created_by =", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByNotEqualTo(String value) {
            addCriterion("lang_created_by <>", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByGreaterThan(String value) {
            addCriterion("lang_created_by >", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("lang_created_by >=", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByLessThan(String value) {
            addCriterion("lang_created_by <", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByLessThanOrEqualTo(String value) {
            addCriterion("lang_created_by <=", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByLike(String value) {
            addCriterion("lang_created_by like", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByNotLike(String value) {
            addCriterion("lang_created_by not like", value, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByIn(List<String> values) {
            addCriterion("lang_created_by in", values, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByNotIn(List<String> values) {
            addCriterion("lang_created_by not in", values, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByBetween(String value1, String value2) {
            addCriterion("lang_created_by between", value1, value2, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangCreatedByNotBetween(String value1, String value2) {
            addCriterion("lang_created_by not between", value1, value2, "langCreatedBy");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeIsNull() {
            addCriterion("lang_change_time is null");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeIsNotNull() {
            addCriterion("lang_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeEqualTo(Date value) {
            addCriterion("lang_change_time =", value, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeNotEqualTo(Date value) {
            addCriterion("lang_change_time <>", value, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeGreaterThan(Date value) {
            addCriterion("lang_change_time >", value, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lang_change_time >=", value, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeLessThan(Date value) {
            addCriterion("lang_change_time <", value, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("lang_change_time <=", value, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeIn(List<Date> values) {
            addCriterion("lang_change_time in", values, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeNotIn(List<Date> values) {
            addCriterion("lang_change_time not in", values, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeBetween(Date value1, Date value2) {
            addCriterion("lang_change_time between", value1, value2, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("lang_change_time not between", value1, value2, "langChangeTime");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerIsNull() {
            addCriterion("lang_last_changer is null");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerIsNotNull() {
            addCriterion("lang_last_changer is not null");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerEqualTo(String value) {
            addCriterion("lang_last_changer =", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerNotEqualTo(String value) {
            addCriterion("lang_last_changer <>", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerGreaterThan(String value) {
            addCriterion("lang_last_changer >", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerGreaterThanOrEqualTo(String value) {
            addCriterion("lang_last_changer >=", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerLessThan(String value) {
            addCriterion("lang_last_changer <", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerLessThanOrEqualTo(String value) {
            addCriterion("lang_last_changer <=", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerLike(String value) {
            addCriterion("lang_last_changer like", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerNotLike(String value) {
            addCriterion("lang_last_changer not like", value, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerIn(List<String> values) {
            addCriterion("lang_last_changer in", values, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerNotIn(List<String> values) {
            addCriterion("lang_last_changer not in", values, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerBetween(String value1, String value2) {
            addCriterion("lang_last_changer between", value1, value2, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andLangLastChangerNotBetween(String value1, String value2) {
            addCriterion("lang_last_changer not between", value1, value2, "langLastChanger");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(String value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(String value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(String value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(String value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(String value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLike(String value) {
            addCriterion("is_recommend like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotLike(String value) {
            addCriterion("is_recommend not like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<String> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<String> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(String value1, String value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(String value1, String value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
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