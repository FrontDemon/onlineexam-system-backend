package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentPaperAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentPaperAnswerExample() {
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

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andStuAnswerIsNull() {
            addCriterion("stu_answer is null");
            return (Criteria) this;
        }

        public Criteria andStuAnswerIsNotNull() {
            addCriterion("stu_answer is not null");
            return (Criteria) this;
        }

        public Criteria andStuAnswerEqualTo(String value) {
            addCriterion("stu_answer =", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotEqualTo(String value) {
            addCriterion("stu_answer <>", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerGreaterThan(String value) {
            addCriterion("stu_answer >", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("stu_answer >=", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerLessThan(String value) {
            addCriterion("stu_answer <", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerLessThanOrEqualTo(String value) {
            addCriterion("stu_answer <=", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerLike(String value) {
            addCriterion("stu_answer like", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotLike(String value) {
            addCriterion("stu_answer not like", value, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerIn(List<String> values) {
            addCriterion("stu_answer in", values, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotIn(List<String> values) {
            addCriterion("stu_answer not in", values, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerBetween(String value1, String value2) {
            addCriterion("stu_answer between", value1, value2, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andStuAnswerNotBetween(String value1, String value2) {
            addCriterion("stu_answer not between", value1, value2, "stuAnswer");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNull() {
            addCriterion("isCorrect is null");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNotNull() {
            addCriterion("isCorrect is not null");
            return (Criteria) this;
        }

        public Criteria andIscorrectEqualTo(String value) {
            addCriterion("isCorrect =", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotEqualTo(String value) {
            addCriterion("isCorrect <>", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThan(String value) {
            addCriterion("isCorrect >", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThanOrEqualTo(String value) {
            addCriterion("isCorrect >=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThan(String value) {
            addCriterion("isCorrect <", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThanOrEqualTo(String value) {
            addCriterion("isCorrect <=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLike(String value) {
            addCriterion("isCorrect like", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotLike(String value) {
            addCriterion("isCorrect not like", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectIn(List<String> values) {
            addCriterion("isCorrect in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotIn(List<String> values) {
            addCriterion("isCorrect not in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectBetween(String value1, String value2) {
            addCriterion("isCorrect between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotBetween(String value1, String value2) {
            addCriterion("isCorrect not between", value1, value2, "iscorrect");
            return (Criteria) this;
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

        public Criteria andIscollectIsNull() {
            addCriterion("isCollect is null");
            return (Criteria) this;
        }

        public Criteria andIscollectIsNotNull() {
            addCriterion("isCollect is not null");
            return (Criteria) this;
        }

        public Criteria andIscollectEqualTo(String value) {
            addCriterion("isCollect =", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectNotEqualTo(String value) {
            addCriterion("isCollect <>", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectGreaterThan(String value) {
            addCriterion("isCollect >", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectGreaterThanOrEqualTo(String value) {
            addCriterion("isCollect >=", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectLessThan(String value) {
            addCriterion("isCollect <", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectLessThanOrEqualTo(String value) {
            addCriterion("isCollect <=", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectLike(String value) {
            addCriterion("isCollect like", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectNotLike(String value) {
            addCriterion("isCollect not like", value, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectIn(List<String> values) {
            addCriterion("isCollect in", values, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectNotIn(List<String> values) {
            addCriterion("isCollect not in", values, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectBetween(String value1, String value2) {
            addCriterion("isCollect between", value1, value2, "iscollect");
            return (Criteria) this;
        }

        public Criteria andIscollectNotBetween(String value1, String value2) {
            addCriterion("isCollect not between", value1, value2, "iscollect");
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