package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.List;

public class BankJudgeQueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankJudgeQueExample() {
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

        public Criteria andJudgeIdIsNull() {
            addCriterion("judge_id is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIsNotNull() {
            addCriterion("judge_id is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdEqualTo(Integer value) {
            addCriterion("judge_id =", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotEqualTo(Integer value) {
            addCriterion("judge_id <>", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThan(Integer value) {
            addCriterion("judge_id >", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_id >=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThan(Integer value) {
            addCriterion("judge_id <", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("judge_id <=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIn(List<Integer> values) {
            addCriterion("judge_id in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotIn(List<Integer> values) {
            addCriterion("judge_id not in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdBetween(Integer value1, Integer value2) {
            addCriterion("judge_id between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_id not between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeContentIsNull() {
            addCriterion("judge_content is null");
            return (Criteria) this;
        }

        public Criteria andJudgeContentIsNotNull() {
            addCriterion("judge_content is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeContentEqualTo(String value) {
            addCriterion("judge_content =", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentNotEqualTo(String value) {
            addCriterion("judge_content <>", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentGreaterThan(String value) {
            addCriterion("judge_content >", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentGreaterThanOrEqualTo(String value) {
            addCriterion("judge_content >=", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentLessThan(String value) {
            addCriterion("judge_content <", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentLessThanOrEqualTo(String value) {
            addCriterion("judge_content <=", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentLike(String value) {
            addCriterion("judge_content like", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentNotLike(String value) {
            addCriterion("judge_content not like", value, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentIn(List<String> values) {
            addCriterion("judge_content in", values, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentNotIn(List<String> values) {
            addCriterion("judge_content not in", values, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentBetween(String value1, String value2) {
            addCriterion("judge_content between", value1, value2, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeContentNotBetween(String value1, String value2) {
            addCriterion("judge_content not between", value1, value2, "judgeContent");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIsNull() {
            addCriterion("judge_answer is null");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIsNotNull() {
            addCriterion("judge_answer is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerEqualTo(String value) {
            addCriterion("judge_answer =", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotEqualTo(String value) {
            addCriterion("judge_answer <>", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerGreaterThan(String value) {
            addCriterion("judge_answer >", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("judge_answer >=", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLessThan(String value) {
            addCriterion("judge_answer <", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLessThanOrEqualTo(String value) {
            addCriterion("judge_answer <=", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLike(String value) {
            addCriterion("judge_answer like", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotLike(String value) {
            addCriterion("judge_answer not like", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIn(List<String> values) {
            addCriterion("judge_answer in", values, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotIn(List<String> values) {
            addCriterion("judge_answer not in", values, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerBetween(String value1, String value2) {
            addCriterion("judge_answer between", value1, value2, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotBetween(String value1, String value2) {
            addCriterion("judge_answer not between", value1, value2, "judgeAnswer");
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