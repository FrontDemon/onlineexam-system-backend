package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.List;

public class PaperQueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperQueExample() {
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

        public Criteria andQueIdIsNull() {
            addCriterion("que_id is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(Integer value) {
            addCriterion("que_id =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(Integer value) {
            addCriterion("que_id <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(Integer value) {
            addCriterion("que_id >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_id >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(Integer value) {
            addCriterion("que_id <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("que_id <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<Integer> values) {
            addCriterion("que_id in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<Integer> values) {
            addCriterion("que_id not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(Integer value1, Integer value2) {
            addCriterion("que_id between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("que_id not between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNull() {
            addCriterion("que_type is null");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNotNull() {
            addCriterion("que_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueTypeEqualTo(Integer value) {
            addCriterion("que_type =", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotEqualTo(Integer value) {
            addCriterion("que_type <>", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThan(Integer value) {
            addCriterion("que_type >", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_type >=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThan(Integer value) {
            addCriterion("que_type <", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThanOrEqualTo(Integer value) {
            addCriterion("que_type <=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeIn(List<Integer> values) {
            addCriterion("que_type in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotIn(List<Integer> values) {
            addCriterion("que_type not in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeBetween(Integer value1, Integer value2) {
            addCriterion("que_type between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("que_type not between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andSingleIdIsNull() {
            addCriterion("single_id is null");
            return (Criteria) this;
        }

        public Criteria andSingleIdIsNotNull() {
            addCriterion("single_id is not null");
            return (Criteria) this;
        }

        public Criteria andSingleIdEqualTo(Integer value) {
            addCriterion("single_id =", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotEqualTo(Integer value) {
            addCriterion("single_id <>", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdGreaterThan(Integer value) {
            addCriterion("single_id >", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_id >=", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdLessThan(Integer value) {
            addCriterion("single_id <", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdLessThanOrEqualTo(Integer value) {
            addCriterion("single_id <=", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdIn(List<Integer> values) {
            addCriterion("single_id in", values, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotIn(List<Integer> values) {
            addCriterion("single_id not in", values, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdBetween(Integer value1, Integer value2) {
            addCriterion("single_id between", value1, value2, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("single_id not between", value1, value2, "singleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdIsNull() {
            addCriterion("multiple_id is null");
            return (Criteria) this;
        }

        public Criteria andMultipleIdIsNotNull() {
            addCriterion("multiple_id is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleIdEqualTo(Integer value) {
            addCriterion("multiple_id =", value, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdNotEqualTo(Integer value) {
            addCriterion("multiple_id <>", value, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdGreaterThan(Integer value) {
            addCriterion("multiple_id >", value, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple_id >=", value, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdLessThan(Integer value) {
            addCriterion("multiple_id <", value, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdLessThanOrEqualTo(Integer value) {
            addCriterion("multiple_id <=", value, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdIn(List<Integer> values) {
            addCriterion("multiple_id in", values, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdNotIn(List<Integer> values) {
            addCriterion("multiple_id not in", values, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdBetween(Integer value1, Integer value2) {
            addCriterion("multiple_id between", value1, value2, "multipleId");
            return (Criteria) this;
        }

        public Criteria andMultipleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple_id not between", value1, value2, "multipleId");
            return (Criteria) this;
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
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