package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.List;

public class BankFillQueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankFillQueExample() {
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

        public Criteria andFillIdIsNull() {
            addCriterion("fill_id is null");
            return (Criteria) this;
        }

        public Criteria andFillIdIsNotNull() {
            addCriterion("fill_id is not null");
            return (Criteria) this;
        }

        public Criteria andFillIdEqualTo(Integer value) {
            addCriterion("fill_id =", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdNotEqualTo(Integer value) {
            addCriterion("fill_id <>", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdGreaterThan(Integer value) {
            addCriterion("fill_id >", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_id >=", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdLessThan(Integer value) {
            addCriterion("fill_id <", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdLessThanOrEqualTo(Integer value) {
            addCriterion("fill_id <=", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdIn(List<Integer> values) {
            addCriterion("fill_id in", values, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdNotIn(List<Integer> values) {
            addCriterion("fill_id not in", values, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdBetween(Integer value1, Integer value2) {
            addCriterion("fill_id between", value1, value2, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_id not between", value1, value2, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillContentIsNull() {
            addCriterion("fill_content is null");
            return (Criteria) this;
        }

        public Criteria andFillContentIsNotNull() {
            addCriterion("fill_content is not null");
            return (Criteria) this;
        }

        public Criteria andFillContentEqualTo(String value) {
            addCriterion("fill_content =", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentNotEqualTo(String value) {
            addCriterion("fill_content <>", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentGreaterThan(String value) {
            addCriterion("fill_content >", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentGreaterThanOrEqualTo(String value) {
            addCriterion("fill_content >=", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentLessThan(String value) {
            addCriterion("fill_content <", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentLessThanOrEqualTo(String value) {
            addCriterion("fill_content <=", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentLike(String value) {
            addCriterion("fill_content like", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentNotLike(String value) {
            addCriterion("fill_content not like", value, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentIn(List<String> values) {
            addCriterion("fill_content in", values, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentNotIn(List<String> values) {
            addCriterion("fill_content not in", values, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentBetween(String value1, String value2) {
            addCriterion("fill_content between", value1, value2, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillContentNotBetween(String value1, String value2) {
            addCriterion("fill_content not between", value1, value2, "fillContent");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIsNull() {
            addCriterion("fill_answer is null");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIsNotNull() {
            addCriterion("fill_answer is not null");
            return (Criteria) this;
        }

        public Criteria andFillAnswerEqualTo(String value) {
            addCriterion("fill_answer =", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotEqualTo(String value) {
            addCriterion("fill_answer <>", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerGreaterThan(String value) {
            addCriterion("fill_answer >", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("fill_answer >=", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerLessThan(String value) {
            addCriterion("fill_answer <", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerLessThanOrEqualTo(String value) {
            addCriterion("fill_answer <=", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerLike(String value) {
            addCriterion("fill_answer like", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotLike(String value) {
            addCriterion("fill_answer not like", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIn(List<String> values) {
            addCriterion("fill_answer in", values, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotIn(List<String> values) {
            addCriterion("fill_answer not in", values, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerBetween(String value1, String value2) {
            addCriterion("fill_answer between", value1, value2, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotBetween(String value1, String value2) {
            addCriterion("fill_answer not between", value1, value2, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andComposeFlagIsNull() {
            addCriterion("compose_flag is null");
            return (Criteria) this;
        }

        public Criteria andComposeFlagIsNotNull() {
            addCriterion("compose_flag is not null");
            return (Criteria) this;
        }

        public Criteria andComposeFlagEqualTo(String value) {
            addCriterion("compose_flag =", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagNotEqualTo(String value) {
            addCriterion("compose_flag <>", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagGreaterThan(String value) {
            addCriterion("compose_flag >", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("compose_flag >=", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagLessThan(String value) {
            addCriterion("compose_flag <", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagLessThanOrEqualTo(String value) {
            addCriterion("compose_flag <=", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagLike(String value) {
            addCriterion("compose_flag like", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagNotLike(String value) {
            addCriterion("compose_flag not like", value, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagIn(List<String> values) {
            addCriterion("compose_flag in", values, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagNotIn(List<String> values) {
            addCriterion("compose_flag not in", values, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagBetween(String value1, String value2) {
            addCriterion("compose_flag between", value1, value2, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andComposeFlagNotBetween(String value1, String value2) {
            addCriterion("compose_flag not between", value1, value2, "composeFlag");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainIsNull() {
            addCriterion("answer_explain is null");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainIsNotNull() {
            addCriterion("answer_explain is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainEqualTo(String value) {
            addCriterion("answer_explain =", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainNotEqualTo(String value) {
            addCriterion("answer_explain <>", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainGreaterThan(String value) {
            addCriterion("answer_explain >", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainGreaterThanOrEqualTo(String value) {
            addCriterion("answer_explain >=", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainLessThan(String value) {
            addCriterion("answer_explain <", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainLessThanOrEqualTo(String value) {
            addCriterion("answer_explain <=", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainLike(String value) {
            addCriterion("answer_explain like", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainNotLike(String value) {
            addCriterion("answer_explain not like", value, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainIn(List<String> values) {
            addCriterion("answer_explain in", values, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainNotIn(List<String> values) {
            addCriterion("answer_explain not in", values, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainBetween(String value1, String value2) {
            addCriterion("answer_explain between", value1, value2, "answerExplain");
            return (Criteria) this;
        }

        public Criteria andAnswerExplainNotBetween(String value1, String value2) {
            addCriterion("answer_explain not between", value1, value2, "answerExplain");
            return (Criteria) this;
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