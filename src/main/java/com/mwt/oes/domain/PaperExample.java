package com.mwt.oes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
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

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeIsNull() {
            addCriterion("paper_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeIsNotNull() {
            addCriterion("paper_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeEqualTo(Date value) {
            addCriterion("paper_create_time =", value, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeNotEqualTo(Date value) {
            addCriterion("paper_create_time <>", value, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeGreaterThan(Date value) {
            addCriterion("paper_create_time >", value, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paper_create_time >=", value, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeLessThan(Date value) {
            addCriterion("paper_create_time <", value, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("paper_create_time <=", value, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeIn(List<Date> values) {
            addCriterion("paper_create_time in", values, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeNotIn(List<Date> values) {
            addCriterion("paper_create_time not in", values, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeBetween(Date value1, Date value2) {
            addCriterion("paper_create_time between", value1, value2, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("paper_create_time not between", value1, value2, "paperCreateTime");
            return (Criteria) this;
        }

        public Criteria andPaperDurationIsNull() {
            addCriterion("paper_duration is null");
            return (Criteria) this;
        }

        public Criteria andPaperDurationIsNotNull() {
            addCriterion("paper_duration is not null");
            return (Criteria) this;
        }

        public Criteria andPaperDurationEqualTo(Integer value) {
            addCriterion("paper_duration =", value, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationNotEqualTo(Integer value) {
            addCriterion("paper_duration <>", value, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationGreaterThan(Integer value) {
            addCriterion("paper_duration >", value, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_duration >=", value, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationLessThan(Integer value) {
            addCriterion("paper_duration <", value, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationLessThanOrEqualTo(Integer value) {
            addCriterion("paper_duration <=", value, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationIn(List<Integer> values) {
            addCriterion("paper_duration in", values, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationNotIn(List<Integer> values) {
            addCriterion("paper_duration not in", values, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationBetween(Integer value1, Integer value2) {
            addCriterion("paper_duration between", value1, value2, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_duration not between", value1, value2, "paperDuration");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyIsNull() {
            addCriterion("paper_difficulty is null");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyIsNotNull() {
            addCriterion("paper_difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyEqualTo(Integer value) {
            addCriterion("paper_difficulty =", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotEqualTo(Integer value) {
            addCriterion("paper_difficulty <>", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyGreaterThan(Integer value) {
            addCriterion("paper_difficulty >", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_difficulty >=", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyLessThan(Integer value) {
            addCriterion("paper_difficulty <", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("paper_difficulty <=", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyIn(List<Integer> values) {
            addCriterion("paper_difficulty in", values, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotIn(List<Integer> values) {
            addCriterion("paper_difficulty not in", values, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("paper_difficulty between", value1, value2, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_difficulty not between", value1, value2, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionIsNull() {
            addCriterion("paper_attention is null");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionIsNotNull() {
            addCriterion("paper_attention is not null");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionEqualTo(String value) {
            addCriterion("paper_attention =", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionNotEqualTo(String value) {
            addCriterion("paper_attention <>", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionGreaterThan(String value) {
            addCriterion("paper_attention >", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("paper_attention >=", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionLessThan(String value) {
            addCriterion("paper_attention <", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionLessThanOrEqualTo(String value) {
            addCriterion("paper_attention <=", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionLike(String value) {
            addCriterion("paper_attention like", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionNotLike(String value) {
            addCriterion("paper_attention not like", value, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionIn(List<String> values) {
            addCriterion("paper_attention in", values, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionNotIn(List<String> values) {
            addCriterion("paper_attention not in", values, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionBetween(String value1, String value2) {
            addCriterion("paper_attention between", value1, value2, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperAttentionNotBetween(String value1, String value2) {
            addCriterion("paper_attention not between", value1, value2, "paperAttention");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNull() {
            addCriterion("paper_type is null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNotNull() {
            addCriterion("paper_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeEqualTo(Integer value) {
            addCriterion("paper_type =", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotEqualTo(Integer value) {
            addCriterion("paper_type <>", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThan(Integer value) {
            addCriterion("paper_type >", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_type >=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThan(Integer value) {
            addCriterion("paper_type <", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThanOrEqualTo(Integer value) {
            addCriterion("paper_type <=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIn(List<Integer> values) {
            addCriterion("paper_type in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotIn(List<Integer> values) {
            addCriterion("paper_type not in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeBetween(Integer value1, Integer value2) {
            addCriterion("paper_type between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_type not between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andSingleScoreIsNull() {
            addCriterion("single_score is null");
            return (Criteria) this;
        }

        public Criteria andSingleScoreIsNotNull() {
            addCriterion("single_score is not null");
            return (Criteria) this;
        }

        public Criteria andSingleScoreEqualTo(Integer value) {
            addCriterion("single_score =", value, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreNotEqualTo(Integer value) {
            addCriterion("single_score <>", value, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreGreaterThan(Integer value) {
            addCriterion("single_score >", value, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_score >=", value, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreLessThan(Integer value) {
            addCriterion("single_score <", value, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreLessThanOrEqualTo(Integer value) {
            addCriterion("single_score <=", value, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreIn(List<Integer> values) {
            addCriterion("single_score in", values, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreNotIn(List<Integer> values) {
            addCriterion("single_score not in", values, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreBetween(Integer value1, Integer value2) {
            addCriterion("single_score between", value1, value2, "singleScore");
            return (Criteria) this;
        }

        public Criteria andSingleScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("single_score not between", value1, value2, "singleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreIsNull() {
            addCriterion("multiple_score is null");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreIsNotNull() {
            addCriterion("multiple_score is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreEqualTo(Integer value) {
            addCriterion("multiple_score =", value, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreNotEqualTo(Integer value) {
            addCriterion("multiple_score <>", value, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreGreaterThan(Integer value) {
            addCriterion("multiple_score >", value, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple_score >=", value, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreLessThan(Integer value) {
            addCriterion("multiple_score <", value, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreLessThanOrEqualTo(Integer value) {
            addCriterion("multiple_score <=", value, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreIn(List<Integer> values) {
            addCriterion("multiple_score in", values, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreNotIn(List<Integer> values) {
            addCriterion("multiple_score not in", values, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreBetween(Integer value1, Integer value2) {
            addCriterion("multiple_score between", value1, value2, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andMultipleScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple_score not between", value1, value2, "multipleScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreIsNull() {
            addCriterion("judge_score is null");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreIsNotNull() {
            addCriterion("judge_score is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreEqualTo(Integer value) {
            addCriterion("judge_score =", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreNotEqualTo(Integer value) {
            addCriterion("judge_score <>", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreGreaterThan(Integer value) {
            addCriterion("judge_score >", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_score >=", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreLessThan(Integer value) {
            addCriterion("judge_score <", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreLessThanOrEqualTo(Integer value) {
            addCriterion("judge_score <=", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreIn(List<Integer> values) {
            addCriterion("judge_score in", values, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreNotIn(List<Integer> values) {
            addCriterion("judge_score not in", values, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreBetween(Integer value1, Integer value2) {
            addCriterion("judge_score between", value1, value2, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_score not between", value1, value2, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreIsNull() {
            addCriterion("fill_score is null");
            return (Criteria) this;
        }

        public Criteria andFillScoreIsNotNull() {
            addCriterion("fill_score is not null");
            return (Criteria) this;
        }

        public Criteria andFillScoreEqualTo(Integer value) {
            addCriterion("fill_score =", value, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreNotEqualTo(Integer value) {
            addCriterion("fill_score <>", value, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreGreaterThan(Integer value) {
            addCriterion("fill_score >", value, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_score >=", value, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreLessThan(Integer value) {
            addCriterion("fill_score <", value, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreLessThanOrEqualTo(Integer value) {
            addCriterion("fill_score <=", value, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreIn(List<Integer> values) {
            addCriterion("fill_score in", values, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreNotIn(List<Integer> values) {
            addCriterion("fill_score not in", values, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreBetween(Integer value1, Integer value2) {
            addCriterion("fill_score between", value1, value2, "fillScore");
            return (Criteria) this;
        }

        public Criteria andFillScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_score not between", value1, value2, "fillScore");
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

        public Criteria andParticipateNumIsNull() {
            addCriterion("participate_num is null");
            return (Criteria) this;
        }

        public Criteria andParticipateNumIsNotNull() {
            addCriterion("participate_num is not null");
            return (Criteria) this;
        }

        public Criteria andParticipateNumEqualTo(Integer value) {
            addCriterion("participate_num =", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumNotEqualTo(Integer value) {
            addCriterion("participate_num <>", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumGreaterThan(Integer value) {
            addCriterion("participate_num >", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("participate_num >=", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumLessThan(Integer value) {
            addCriterion("participate_num <", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumLessThanOrEqualTo(Integer value) {
            addCriterion("participate_num <=", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumIn(List<Integer> values) {
            addCriterion("participate_num in", values, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumNotIn(List<Integer> values) {
            addCriterion("participate_num not in", values, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumBetween(Integer value1, Integer value2) {
            addCriterion("participate_num between", value1, value2, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("participate_num not between", value1, value2, "participateNum");
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