package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExecuteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExecuteExample() {
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

        public Criteria andSchedulingIdIsNull() {
            addCriterion("scheduling_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdIsNotNull() {
            addCriterion("scheduling_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdEqualTo(Integer value) {
            addCriterion("scheduling_id =", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdNotEqualTo(Integer value) {
            addCriterion("scheduling_id <>", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdGreaterThan(Integer value) {
            addCriterion("scheduling_id >", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduling_id >=", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdLessThan(Integer value) {
            addCriterion("scheduling_id <", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdLessThanOrEqualTo(Integer value) {
            addCriterion("scheduling_id <=", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdIn(List<Integer> values) {
            addCriterion("scheduling_id in", values, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdNotIn(List<Integer> values) {
            addCriterion("scheduling_id not in", values, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_id between", value1, value2, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_id not between", value1, value2, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountIsNull() {
            addCriterion("case_total_count is null");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountIsNotNull() {
            addCriterion("case_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountEqualTo(Integer value) {
            addCriterion("case_total_count =", value, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountNotEqualTo(Integer value) {
            addCriterion("case_total_count <>", value, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountGreaterThan(Integer value) {
            addCriterion("case_total_count >", value, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_total_count >=", value, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountLessThan(Integer value) {
            addCriterion("case_total_count <", value, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("case_total_count <=", value, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountIn(List<Integer> values) {
            addCriterion("case_total_count in", values, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountNotIn(List<Integer> values) {
            addCriterion("case_total_count not in", values, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("case_total_count between", value1, value2, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("case_total_count not between", value1, value2, "caseTotalCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountIsNull() {
            addCriterion("case_succ_count is null");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountIsNotNull() {
            addCriterion("case_succ_count is not null");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountEqualTo(Integer value) {
            addCriterion("case_succ_count =", value, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountNotEqualTo(Integer value) {
            addCriterion("case_succ_count <>", value, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountGreaterThan(Integer value) {
            addCriterion("case_succ_count >", value, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_succ_count >=", value, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountLessThan(Integer value) {
            addCriterion("case_succ_count <", value, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountLessThanOrEqualTo(Integer value) {
            addCriterion("case_succ_count <=", value, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountIn(List<Integer> values) {
            addCriterion("case_succ_count in", values, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountNotIn(List<Integer> values) {
            addCriterion("case_succ_count not in", values, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountBetween(Integer value1, Integer value2) {
            addCriterion("case_succ_count between", value1, value2, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseSuccCountNotBetween(Integer value1, Integer value2) {
            addCriterion("case_succ_count not between", value1, value2, "caseSuccCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountIsNull() {
            addCriterion("case_fail_count is null");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountIsNotNull() {
            addCriterion("case_fail_count is not null");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountEqualTo(Integer value) {
            addCriterion("case_fail_count =", value, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountNotEqualTo(Integer value) {
            addCriterion("case_fail_count <>", value, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountGreaterThan(Integer value) {
            addCriterion("case_fail_count >", value, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_fail_count >=", value, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountLessThan(Integer value) {
            addCriterion("case_fail_count <", value, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("case_fail_count <=", value, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountIn(List<Integer> values) {
            addCriterion("case_fail_count in", values, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountNotIn(List<Integer> values) {
            addCriterion("case_fail_count not in", values, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountBetween(Integer value1, Integer value2) {
            addCriterion("case_fail_count between", value1, value2, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("case_fail_count not between", value1, value2, "caseFailCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountIsNull() {
            addCriterion("case_lock_count is null");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountIsNotNull() {
            addCriterion("case_lock_count is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountEqualTo(Integer value) {
            addCriterion("case_lock_count =", value, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountNotEqualTo(Integer value) {
            addCriterion("case_lock_count <>", value, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountGreaterThan(Integer value) {
            addCriterion("case_lock_count >", value, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_lock_count >=", value, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountLessThan(Integer value) {
            addCriterion("case_lock_count <", value, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountLessThanOrEqualTo(Integer value) {
            addCriterion("case_lock_count <=", value, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountIn(List<Integer> values) {
            addCriterion("case_lock_count in", values, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountNotIn(List<Integer> values) {
            addCriterion("case_lock_count not in", values, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountBetween(Integer value1, Integer value2) {
            addCriterion("case_lock_count between", value1, value2, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseLockCountNotBetween(Integer value1, Integer value2) {
            addCriterion("case_lock_count not between", value1, value2, "caseLockCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountIsNull() {
            addCriterion("case_noexec_count is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountIsNotNull() {
            addCriterion("case_noexec_count is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountEqualTo(Integer value) {
            addCriterion("case_noexec_count =", value, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountNotEqualTo(Integer value) {
            addCriterion("case_noexec_count <>", value, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountGreaterThan(Integer value) {
            addCriterion("case_noexec_count >", value, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_noexec_count >=", value, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountLessThan(Integer value) {
            addCriterion("case_noexec_count <", value, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountLessThanOrEqualTo(Integer value) {
            addCriterion("case_noexec_count <=", value, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountIn(List<Integer> values) {
            addCriterion("case_noexec_count in", values, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountNotIn(List<Integer> values) {
            addCriterion("case_noexec_count not in", values, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountBetween(Integer value1, Integer value2) {
            addCriterion("case_noexec_count between", value1, value2, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andCaseNoexecCountNotBetween(Integer value1, Integer value2) {
            addCriterion("case_noexec_count not between", value1, value2, "caseNoexecCount");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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