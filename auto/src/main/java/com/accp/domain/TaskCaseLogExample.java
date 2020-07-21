package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskCaseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskCaseLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdIsNull() {
            addCriterion("task_case_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdIsNotNull() {
            addCriterion("task_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdEqualTo(Integer value) {
            addCriterion("task_case_id =", value, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdNotEqualTo(Integer value) {
            addCriterion("task_case_id <>", value, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdGreaterThan(Integer value) {
            addCriterion("task_case_id >", value, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_case_id >=", value, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdLessThan(Integer value) {
            addCriterion("task_case_id <", value, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_case_id <=", value, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdIn(List<Integer> values) {
            addCriterion("task_case_id in", values, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdNotIn(List<Integer> values) {
            addCriterion("task_case_id not in", values, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("task_case_id between", value1, value2, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_case_id not between", value1, value2, "taskCaseId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andLogDetailIsNull() {
            addCriterion("log_detail is null");
            return (Criteria) this;
        }

        public Criteria andLogDetailIsNotNull() {
            addCriterion("log_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLogDetailEqualTo(String value) {
            addCriterion("log_detail =", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailNotEqualTo(String value) {
            addCriterion("log_detail <>", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailGreaterThan(String value) {
            addCriterion("log_detail >", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailGreaterThanOrEqualTo(String value) {
            addCriterion("log_detail >=", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailLessThan(String value) {
            addCriterion("log_detail <", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailLessThanOrEqualTo(String value) {
            addCriterion("log_detail <=", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailLike(String value) {
            addCriterion("log_detail like", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailNotLike(String value) {
            addCriterion("log_detail not like", value, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailIn(List<String> values) {
            addCriterion("log_detail in", values, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailNotIn(List<String> values) {
            addCriterion("log_detail not in", values, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailBetween(String value1, String value2) {
            addCriterion("log_detail between", value1, value2, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogDetailNotBetween(String value1, String value2) {
            addCriterion("log_detail not between", value1, value2, "logDetail");
            return (Criteria) this;
        }

        public Criteria andLogGradeIsNull() {
            addCriterion("log_grade is null");
            return (Criteria) this;
        }

        public Criteria andLogGradeIsNotNull() {
            addCriterion("log_grade is not null");
            return (Criteria) this;
        }

        public Criteria andLogGradeEqualTo(String value) {
            addCriterion("log_grade =", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeNotEqualTo(String value) {
            addCriterion("log_grade <>", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeGreaterThan(String value) {
            addCriterion("log_grade >", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeGreaterThanOrEqualTo(String value) {
            addCriterion("log_grade >=", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeLessThan(String value) {
            addCriterion("log_grade <", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeLessThanOrEqualTo(String value) {
            addCriterion("log_grade <=", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeLike(String value) {
            addCriterion("log_grade like", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeNotLike(String value) {
            addCriterion("log_grade not like", value, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeIn(List<String> values) {
            addCriterion("log_grade in", values, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeNotIn(List<String> values) {
            addCriterion("log_grade not in", values, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeBetween(String value1, String value2) {
            addCriterion("log_grade between", value1, value2, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogGradeNotBetween(String value1, String value2) {
            addCriterion("log_grade not between", value1, value2, "logGrade");
            return (Criteria) this;
        }

        public Criteria andLogStepIsNull() {
            addCriterion("log_step is null");
            return (Criteria) this;
        }

        public Criteria andLogStepIsNotNull() {
            addCriterion("log_step is not null");
            return (Criteria) this;
        }

        public Criteria andLogStepEqualTo(String value) {
            addCriterion("log_step =", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepNotEqualTo(String value) {
            addCriterion("log_step <>", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepGreaterThan(String value) {
            addCriterion("log_step >", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepGreaterThanOrEqualTo(String value) {
            addCriterion("log_step >=", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepLessThan(String value) {
            addCriterion("log_step <", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepLessThanOrEqualTo(String value) {
            addCriterion("log_step <=", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepLike(String value) {
            addCriterion("log_step like", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepNotLike(String value) {
            addCriterion("log_step not like", value, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepIn(List<String> values) {
            addCriterion("log_step in", values, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepNotIn(List<String> values) {
            addCriterion("log_step not in", values, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepBetween(String value1, String value2) {
            addCriterion("log_step between", value1, value2, "logStep");
            return (Criteria) this;
        }

        public Criteria andLogStepNotBetween(String value1, String value2) {
            addCriterion("log_step not between", value1, value2, "logStep");
            return (Criteria) this;
        }

        public Criteria andImgnameIsNull() {
            addCriterion("imgname is null");
            return (Criteria) this;
        }

        public Criteria andImgnameIsNotNull() {
            addCriterion("imgname is not null");
            return (Criteria) this;
        }

        public Criteria andImgnameEqualTo(String value) {
            addCriterion("imgname =", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotEqualTo(String value) {
            addCriterion("imgname <>", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameGreaterThan(String value) {
            addCriterion("imgname >", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameGreaterThanOrEqualTo(String value) {
            addCriterion("imgname >=", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLessThan(String value) {
            addCriterion("imgname <", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLessThanOrEqualTo(String value) {
            addCriterion("imgname <=", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLike(String value) {
            addCriterion("imgname like", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotLike(String value) {
            addCriterion("imgname not like", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameIn(List<String> values) {
            addCriterion("imgname in", values, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotIn(List<String> values) {
            addCriterion("imgname not in", values, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameBetween(String value1, String value2) {
            addCriterion("imgname between", value1, value2, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotBetween(String value1, String value2) {
            addCriterion("imgname not between", value1, value2, "imgname");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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