package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TaskSchedulingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskSchedulingExample() {
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

        public Criteria andSchedulingNameIsNull() {
            addCriterion("scheduling_name is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameIsNotNull() {
            addCriterion("scheduling_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameEqualTo(String value) {
            addCriterion("scheduling_name =", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameNotEqualTo(String value) {
            addCriterion("scheduling_name <>", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameGreaterThan(String value) {
            addCriterion("scheduling_name >", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameGreaterThanOrEqualTo(String value) {
            addCriterion("scheduling_name >=", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameLessThan(String value) {
            addCriterion("scheduling_name <", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameLessThanOrEqualTo(String value) {
            addCriterion("scheduling_name <=", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameLike(String value) {
            addCriterion("scheduling_name like", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameNotLike(String value) {
            addCriterion("scheduling_name not like", value, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameIn(List<String> values) {
            addCriterion("scheduling_name in", values, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameNotIn(List<String> values) {
            addCriterion("scheduling_name not in", values, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameBetween(String value1, String value2) {
            addCriterion("scheduling_name between", value1, value2, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andSchedulingNameNotBetween(String value1, String value2) {
            addCriterion("scheduling_name not between", value1, value2, "schedulingName");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
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

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Integer value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Integer value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Integer value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Integer value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Integer> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Integer> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionIsNull() {
            addCriterion("email_send_condition is null");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionIsNotNull() {
            addCriterion("email_send_condition is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionEqualTo(Integer value) {
            addCriterion("email_send_condition =", value, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionNotEqualTo(Integer value) {
            addCriterion("email_send_condition <>", value, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionGreaterThan(Integer value) {
            addCriterion("email_send_condition >", value, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_send_condition >=", value, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionLessThan(Integer value) {
            addCriterion("email_send_condition <", value, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionLessThanOrEqualTo(Integer value) {
            addCriterion("email_send_condition <=", value, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionIn(List<Integer> values) {
            addCriterion("email_send_condition in", values, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionNotIn(List<Integer> values) {
            addCriterion("email_send_condition not in", values, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionBetween(Integer value1, Integer value2) {
            addCriterion("email_send_condition between", value1, value2, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailSendConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("email_send_condition not between", value1, value2, "emailSendCondition");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNull() {
            addCriterion("email_address is null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNotNull() {
            addCriterion("email_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressEqualTo(String value) {
            addCriterion("email_address =", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotEqualTo(String value) {
            addCriterion("email_address <>", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThan(String value) {
            addCriterion("email_address >", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("email_address >=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThan(String value) {
            addCriterion("email_address <", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("email_address <=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLike(String value) {
            addCriterion("email_address like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotLike(String value) {
            addCriterion("email_address not like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIn(List<String> values) {
            addCriterion("email_address in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotIn(List<String> values) {
            addCriterion("email_address not in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressBetween(String value1, String value2) {
            addCriterion("email_address between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotBetween(String value1, String value2) {
            addCriterion("email_address not between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkIsNull() {
            addCriterion("building_link is null");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkIsNotNull() {
            addCriterion("building_link is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkEqualTo(String value) {
            addCriterion("building_link =", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkNotEqualTo(String value) {
            addCriterion("building_link <>", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkGreaterThan(String value) {
            addCriterion("building_link >", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkGreaterThanOrEqualTo(String value) {
            addCriterion("building_link >=", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkLessThan(String value) {
            addCriterion("building_link <", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkLessThanOrEqualTo(String value) {
            addCriterion("building_link <=", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkLike(String value) {
            addCriterion("building_link like", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkNotLike(String value) {
            addCriterion("building_link not like", value, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkIn(List<String> values) {
            addCriterion("building_link in", values, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkNotIn(List<String> values) {
            addCriterion("building_link not in", values, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkBetween(String value1, String value2) {
            addCriterion("building_link between", value1, value2, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andBuildingLinkNotBetween(String value1, String value2) {
            addCriterion("building_link not between", value1, value2, "buildingLink");
            return (Criteria) this;
        }

        public Criteria andRemoteShellIsNull() {
            addCriterion("remote_shell is null");
            return (Criteria) this;
        }

        public Criteria andRemoteShellIsNotNull() {
            addCriterion("remote_shell is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteShellEqualTo(String value) {
            addCriterion("remote_shell =", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellNotEqualTo(String value) {
            addCriterion("remote_shell <>", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellGreaterThan(String value) {
            addCriterion("remote_shell >", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellGreaterThanOrEqualTo(String value) {
            addCriterion("remote_shell >=", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellLessThan(String value) {
            addCriterion("remote_shell <", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellLessThanOrEqualTo(String value) {
            addCriterion("remote_shell <=", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellLike(String value) {
            addCriterion("remote_shell like", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellNotLike(String value) {
            addCriterion("remote_shell not like", value, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellIn(List<String> values) {
            addCriterion("remote_shell in", values, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellNotIn(List<String> values) {
            addCriterion("remote_shell not in", values, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellBetween(String value1, String value2) {
            addCriterion("remote_shell between", value1, value2, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andRemoteShellNotBetween(String value1, String value2) {
            addCriterion("remote_shell not between", value1, value2, "remoteShell");
            return (Criteria) this;
        }

        public Criteria andExThreadCountIsNull() {
            addCriterion("ex_thread_count is null");
            return (Criteria) this;
        }

        public Criteria andExThreadCountIsNotNull() {
            addCriterion("ex_thread_count is not null");
            return (Criteria) this;
        }

        public Criteria andExThreadCountEqualTo(Integer value) {
            addCriterion("ex_thread_count =", value, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountNotEqualTo(Integer value) {
            addCriterion("ex_thread_count <>", value, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountGreaterThan(Integer value) {
            addCriterion("ex_thread_count >", value, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ex_thread_count >=", value, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountLessThan(Integer value) {
            addCriterion("ex_thread_count <", value, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountLessThanOrEqualTo(Integer value) {
            addCriterion("ex_thread_count <=", value, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountIn(List<Integer> values) {
            addCriterion("ex_thread_count in", values, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountNotIn(List<Integer> values) {
            addCriterion("ex_thread_count not in", values, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountBetween(Integer value1, Integer value2) {
            addCriterion("ex_thread_count between", value1, value2, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andExThreadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ex_thread_count not between", value1, value2, "exThreadCount");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Integer value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Integer value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Integer value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Integer value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Integer value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Integer> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Integer> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Integer value1, Integer value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeIsNull() {
            addCriterion("browser_type is null");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeIsNotNull() {
            addCriterion("browser_type is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeEqualTo(Integer value) {
            addCriterion("browser_type =", value, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeNotEqualTo(Integer value) {
            addCriterion("browser_type <>", value, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeGreaterThan(Integer value) {
            addCriterion("browser_type >", value, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("browser_type >=", value, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeLessThan(Integer value) {
            addCriterion("browser_type <", value, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("browser_type <=", value, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeIn(List<Integer> values) {
            addCriterion("browser_type in", values, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeNotIn(List<Integer> values) {
            addCriterion("browser_type not in", values, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeBetween(Integer value1, Integer value2) {
            addCriterion("browser_type between", value1, value2, "browserType");
            return (Criteria) this;
        }

        public Criteria andBrowserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("browser_type not between", value1, value2, "browserType");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutIsNull() {
            addCriterion("task_timeout is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutIsNotNull() {
            addCriterion("task_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutEqualTo(Integer value) {
            addCriterion("task_timeout =", value, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutNotEqualTo(Integer value) {
            addCriterion("task_timeout <>", value, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutGreaterThan(Integer value) {
            addCriterion("task_timeout >", value, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_timeout >=", value, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutLessThan(Integer value) {
            addCriterion("task_timeout <", value, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("task_timeout <=", value, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutIn(List<Integer> values) {
            addCriterion("task_timeout in", values, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutNotIn(List<Integer> values) {
            addCriterion("task_timeout not in", values, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("task_timeout between", value1, value2, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andTaskTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("task_timeout not between", value1, value2, "taskTimeout");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathIsNull() {
            addCriterion("client_driver_path is null");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathIsNotNull() {
            addCriterion("client_driver_path is not null");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathEqualTo(String value) {
            addCriterion("client_driver_path =", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathNotEqualTo(String value) {
            addCriterion("client_driver_path <>", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathGreaterThan(String value) {
            addCriterion("client_driver_path >", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathGreaterThanOrEqualTo(String value) {
            addCriterion("client_driver_path >=", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathLessThan(String value) {
            addCriterion("client_driver_path <", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathLessThanOrEqualTo(String value) {
            addCriterion("client_driver_path <=", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathLike(String value) {
            addCriterion("client_driver_path like", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathNotLike(String value) {
            addCriterion("client_driver_path not like", value, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathIn(List<String> values) {
            addCriterion("client_driver_path in", values, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathNotIn(List<String> values) {
            addCriterion("client_driver_path not in", values, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathBetween(String value1, String value2) {
            addCriterion("client_driver_path between", value1, value2, "clientDriverPath");
            return (Criteria) this;
        }

        public Criteria andClientDriverPathNotBetween(String value1, String value2) {
            addCriterion("client_driver_path not between", value1, value2, "clientDriverPath");
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