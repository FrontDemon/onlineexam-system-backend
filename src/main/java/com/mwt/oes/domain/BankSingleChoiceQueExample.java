package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.List;

public class BankSingleChoiceQueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankSingleChoiceQueExample() {
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

        public Criteria andSingleContentIsNull() {
            addCriterion("single_content is null");
            return (Criteria) this;
        }

        public Criteria andSingleContentIsNotNull() {
            addCriterion("single_content is not null");
            return (Criteria) this;
        }

        public Criteria andSingleContentEqualTo(String value) {
            addCriterion("single_content =", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotEqualTo(String value) {
            addCriterion("single_content <>", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentGreaterThan(String value) {
            addCriterion("single_content >", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentGreaterThanOrEqualTo(String value) {
            addCriterion("single_content >=", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentLessThan(String value) {
            addCriterion("single_content <", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentLessThanOrEqualTo(String value) {
            addCriterion("single_content <=", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentLike(String value) {
            addCriterion("single_content like", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotLike(String value) {
            addCriterion("single_content not like", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentIn(List<String> values) {
            addCriterion("single_content in", values, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotIn(List<String> values) {
            addCriterion("single_content not in", values, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentBetween(String value1, String value2) {
            addCriterion("single_content between", value1, value2, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotBetween(String value1, String value2) {
            addCriterion("single_content not between", value1, value2, "singleContent");
            return (Criteria) this;
        }

        public Criteria andChoiceAIsNull() {
            addCriterion("choice_A is null");
            return (Criteria) this;
        }

        public Criteria andChoiceAIsNotNull() {
            addCriterion("choice_A is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceAEqualTo(String value) {
            addCriterion("choice_A =", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotEqualTo(String value) {
            addCriterion("choice_A <>", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAGreaterThan(String value) {
            addCriterion("choice_A >", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAGreaterThanOrEqualTo(String value) {
            addCriterion("choice_A >=", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALessThan(String value) {
            addCriterion("choice_A <", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALessThanOrEqualTo(String value) {
            addCriterion("choice_A <=", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALike(String value) {
            addCriterion("choice_A like", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotLike(String value) {
            addCriterion("choice_A not like", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAIn(List<String> values) {
            addCriterion("choice_A in", values, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotIn(List<String> values) {
            addCriterion("choice_A not in", values, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceABetween(String value1, String value2) {
            addCriterion("choice_A between", value1, value2, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotBetween(String value1, String value2) {
            addCriterion("choice_A not between", value1, value2, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceBIsNull() {
            addCriterion("choice_B is null");
            return (Criteria) this;
        }

        public Criteria andChoiceBIsNotNull() {
            addCriterion("choice_B is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceBEqualTo(String value) {
            addCriterion("choice_B =", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotEqualTo(String value) {
            addCriterion("choice_B <>", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBGreaterThan(String value) {
            addCriterion("choice_B >", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBGreaterThanOrEqualTo(String value) {
            addCriterion("choice_B >=", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLessThan(String value) {
            addCriterion("choice_B <", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLessThanOrEqualTo(String value) {
            addCriterion("choice_B <=", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLike(String value) {
            addCriterion("choice_B like", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotLike(String value) {
            addCriterion("choice_B not like", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBIn(List<String> values) {
            addCriterion("choice_B in", values, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotIn(List<String> values) {
            addCriterion("choice_B not in", values, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBBetween(String value1, String value2) {
            addCriterion("choice_B between", value1, value2, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotBetween(String value1, String value2) {
            addCriterion("choice_B not between", value1, value2, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceCIsNull() {
            addCriterion("choice_C is null");
            return (Criteria) this;
        }

        public Criteria andChoiceCIsNotNull() {
            addCriterion("choice_C is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceCEqualTo(String value) {
            addCriterion("choice_C =", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotEqualTo(String value) {
            addCriterion("choice_C <>", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCGreaterThan(String value) {
            addCriterion("choice_C >", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCGreaterThanOrEqualTo(String value) {
            addCriterion("choice_C >=", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLessThan(String value) {
            addCriterion("choice_C <", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLessThanOrEqualTo(String value) {
            addCriterion("choice_C <=", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLike(String value) {
            addCriterion("choice_C like", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotLike(String value) {
            addCriterion("choice_C not like", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCIn(List<String> values) {
            addCriterion("choice_C in", values, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotIn(List<String> values) {
            addCriterion("choice_C not in", values, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCBetween(String value1, String value2) {
            addCriterion("choice_C between", value1, value2, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotBetween(String value1, String value2) {
            addCriterion("choice_C not between", value1, value2, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceDIsNull() {
            addCriterion("choice_D is null");
            return (Criteria) this;
        }

        public Criteria andChoiceDIsNotNull() {
            addCriterion("choice_D is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceDEqualTo(String value) {
            addCriterion("choice_D =", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotEqualTo(String value) {
            addCriterion("choice_D <>", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDGreaterThan(String value) {
            addCriterion("choice_D >", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDGreaterThanOrEqualTo(String value) {
            addCriterion("choice_D >=", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLessThan(String value) {
            addCriterion("choice_D <", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLessThanOrEqualTo(String value) {
            addCriterion("choice_D <=", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLike(String value) {
            addCriterion("choice_D like", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotLike(String value) {
            addCriterion("choice_D not like", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDIn(List<String> values) {
            addCriterion("choice_D in", values, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotIn(List<String> values) {
            addCriterion("choice_D not in", values, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDBetween(String value1, String value2) {
            addCriterion("choice_D between", value1, value2, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotBetween(String value1, String value2) {
            addCriterion("choice_D not between", value1, value2, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceEIsNull() {
            addCriterion("choice_E is null");
            return (Criteria) this;
        }

        public Criteria andChoiceEIsNotNull() {
            addCriterion("choice_E is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceEEqualTo(String value) {
            addCriterion("choice_E =", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotEqualTo(String value) {
            addCriterion("choice_E <>", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEGreaterThan(String value) {
            addCriterion("choice_E >", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEGreaterThanOrEqualTo(String value) {
            addCriterion("choice_E >=", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceELessThan(String value) {
            addCriterion("choice_E <", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceELessThanOrEqualTo(String value) {
            addCriterion("choice_E <=", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceELike(String value) {
            addCriterion("choice_E like", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotLike(String value) {
            addCriterion("choice_E not like", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEIn(List<String> values) {
            addCriterion("choice_E in", values, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotIn(List<String> values) {
            addCriterion("choice_E not in", values, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEBetween(String value1, String value2) {
            addCriterion("choice_E between", value1, value2, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotBetween(String value1, String value2) {
            addCriterion("choice_E not between", value1, value2, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceFIsNull() {
            addCriterion("choice_F is null");
            return (Criteria) this;
        }

        public Criteria andChoiceFIsNotNull() {
            addCriterion("choice_F is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceFEqualTo(String value) {
            addCriterion("choice_F =", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotEqualTo(String value) {
            addCriterion("choice_F <>", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFGreaterThan(String value) {
            addCriterion("choice_F >", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFGreaterThanOrEqualTo(String value) {
            addCriterion("choice_F >=", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFLessThan(String value) {
            addCriterion("choice_F <", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFLessThanOrEqualTo(String value) {
            addCriterion("choice_F <=", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFLike(String value) {
            addCriterion("choice_F like", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotLike(String value) {
            addCriterion("choice_F not like", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFIn(List<String> values) {
            addCriterion("choice_F in", values, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotIn(List<String> values) {
            addCriterion("choice_F not in", values, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFBetween(String value1, String value2) {
            addCriterion("choice_F between", value1, value2, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotBetween(String value1, String value2) {
            addCriterion("choice_F not between", value1, value2, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceGIsNull() {
            addCriterion("choice_G is null");
            return (Criteria) this;
        }

        public Criteria andChoiceGIsNotNull() {
            addCriterion("choice_G is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceGEqualTo(String value) {
            addCriterion("choice_G =", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotEqualTo(String value) {
            addCriterion("choice_G <>", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGGreaterThan(String value) {
            addCriterion("choice_G >", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGGreaterThanOrEqualTo(String value) {
            addCriterion("choice_G >=", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGLessThan(String value) {
            addCriterion("choice_G <", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGLessThanOrEqualTo(String value) {
            addCriterion("choice_G <=", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGLike(String value) {
            addCriterion("choice_G like", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotLike(String value) {
            addCriterion("choice_G not like", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGIn(List<String> values) {
            addCriterion("choice_G in", values, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotIn(List<String> values) {
            addCriterion("choice_G not in", values, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGBetween(String value1, String value2) {
            addCriterion("choice_G between", value1, value2, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotBetween(String value1, String value2) {
            addCriterion("choice_G not between", value1, value2, "choiceG");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerIsNull() {
            addCriterion("single_answer is null");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerIsNotNull() {
            addCriterion("single_answer is not null");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerEqualTo(String value) {
            addCriterion("single_answer =", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerNotEqualTo(String value) {
            addCriterion("single_answer <>", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerGreaterThan(String value) {
            addCriterion("single_answer >", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("single_answer >=", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerLessThan(String value) {
            addCriterion("single_answer <", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerLessThanOrEqualTo(String value) {
            addCriterion("single_answer <=", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerLike(String value) {
            addCriterion("single_answer like", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerNotLike(String value) {
            addCriterion("single_answer not like", value, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerIn(List<String> values) {
            addCriterion("single_answer in", values, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerNotIn(List<String> values) {
            addCriterion("single_answer not in", values, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerBetween(String value1, String value2) {
            addCriterion("single_answer between", value1, value2, "singleAnswer");
            return (Criteria) this;
        }

        public Criteria andSingleAnswerNotBetween(String value1, String value2) {
            addCriterion("single_answer not between", value1, value2, "singleAnswer");
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