package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QaVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QaVersionExample() {
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

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
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

        public Criteria andVersionNumberIsNull() {
            addCriterion("version_number is null");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIsNotNull() {
            addCriterion("version_number is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNumberEqualTo(String value) {
            addCriterion("version_number =", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotEqualTo(String value) {
            addCriterion("version_number <>", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberGreaterThan(String value) {
            addCriterion("version_number >", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("version_number >=", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLessThan(String value) {
            addCriterion("version_number <", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLessThanOrEqualTo(String value) {
            addCriterion("version_number <=", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLike(String value) {
            addCriterion("version_number like", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotLike(String value) {
            addCriterion("version_number not like", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIn(List<String> values) {
            addCriterion("version_number in", values, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotIn(List<String> values) {
            addCriterion("version_number not in", values, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberBetween(String value1, String value2) {
            addCriterion("version_number between", value1, value2, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotBetween(String value1, String value2) {
            addCriterion("version_number not between", value1, value2, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionStatusIsNull() {
            addCriterion("version_status is null");
            return (Criteria) this;
        }

        public Criteria andVersionStatusIsNotNull() {
            addCriterion("version_status is not null");
            return (Criteria) this;
        }

        public Criteria andVersionStatusEqualTo(String value) {
            addCriterion("version_status =", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusNotEqualTo(String value) {
            addCriterion("version_status <>", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusGreaterThan(String value) {
            addCriterion("version_status >", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("version_status >=", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusLessThan(String value) {
            addCriterion("version_status <", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusLessThanOrEqualTo(String value) {
            addCriterion("version_status <=", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusLike(String value) {
            addCriterion("version_status like", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusNotLike(String value) {
            addCriterion("version_status not like", value, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusIn(List<String> values) {
            addCriterion("version_status in", values, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusNotIn(List<String> values) {
            addCriterion("version_status not in", values, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusBetween(String value1, String value2) {
            addCriterion("version_status between", value1, value2, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andVersionStatusNotBetween(String value1, String value2) {
            addCriterion("version_status not between", value1, value2, "versionStatus");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andTesterIsNull() {
            addCriterion("tester is null");
            return (Criteria) this;
        }

        public Criteria andTesterIsNotNull() {
            addCriterion("tester is not null");
            return (Criteria) this;
        }

        public Criteria andTesterEqualTo(String value) {
            addCriterion("tester =", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotEqualTo(String value) {
            addCriterion("tester <>", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThan(String value) {
            addCriterion("tester >", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThanOrEqualTo(String value) {
            addCriterion("tester >=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThan(String value) {
            addCriterion("tester <", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThanOrEqualTo(String value) {
            addCriterion("tester <=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLike(String value) {
            addCriterion("tester like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotLike(String value) {
            addCriterion("tester not like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterIn(List<String> values) {
            addCriterion("tester in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotIn(List<String> values) {
            addCriterion("tester not in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterBetween(String value1, String value2) {
            addCriterion("tester between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotBetween(String value1, String value2) {
            addCriterion("tester not between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateIsNull() {
            addCriterion("plan_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateIsNotNull() {
            addCriterion("plan_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateEqualTo(String value) {
            addCriterion("plan_finish_date =", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateNotEqualTo(String value) {
            addCriterion("plan_finish_date <>", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateGreaterThan(String value) {
            addCriterion("plan_finish_date >", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateGreaterThanOrEqualTo(String value) {
            addCriterion("plan_finish_date >=", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateLessThan(String value) {
            addCriterion("plan_finish_date <", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateLessThanOrEqualTo(String value) {
            addCriterion("plan_finish_date <=", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateLike(String value) {
            addCriterion("plan_finish_date like", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateNotLike(String value) {
            addCriterion("plan_finish_date not like", value, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateIn(List<String> values) {
            addCriterion("plan_finish_date in", values, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateNotIn(List<String> values) {
            addCriterion("plan_finish_date not in", values, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateBetween(String value1, String value2) {
            addCriterion("plan_finish_date between", value1, value2, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andPlanFinishDateNotBetween(String value1, String value2) {
            addCriterion("plan_finish_date not between", value1, value2, "planFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateIsNull() {
            addCriterion("actually_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateIsNotNull() {
            addCriterion("actually_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateEqualTo(String value) {
            addCriterion("actually_finish_date =", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateNotEqualTo(String value) {
            addCriterion("actually_finish_date <>", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateGreaterThan(String value) {
            addCriterion("actually_finish_date >", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateGreaterThanOrEqualTo(String value) {
            addCriterion("actually_finish_date >=", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateLessThan(String value) {
            addCriterion("actually_finish_date <", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateLessThanOrEqualTo(String value) {
            addCriterion("actually_finish_date <=", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateLike(String value) {
            addCriterion("actually_finish_date like", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateNotLike(String value) {
            addCriterion("actually_finish_date not like", value, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateIn(List<String> values) {
            addCriterion("actually_finish_date in", values, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateNotIn(List<String> values) {
            addCriterion("actually_finish_date not in", values, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateBetween(String value1, String value2) {
            addCriterion("actually_finish_date between", value1, value2, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andActuallyFinishDateNotBetween(String value1, String value2) {
            addCriterion("actually_finish_date not between", value1, value2, "actuallyFinishDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateIsNull() {
            addCriterion("launch_date is null");
            return (Criteria) this;
        }

        public Criteria andLaunchDateIsNotNull() {
            addCriterion("launch_date is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchDateEqualTo(String value) {
            addCriterion("launch_date =", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateNotEqualTo(String value) {
            addCriterion("launch_date <>", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateGreaterThan(String value) {
            addCriterion("launch_date >", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateGreaterThanOrEqualTo(String value) {
            addCriterion("launch_date >=", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateLessThan(String value) {
            addCriterion("launch_date <", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateLessThanOrEqualTo(String value) {
            addCriterion("launch_date <=", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateLike(String value) {
            addCriterion("launch_date like", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateNotLike(String value) {
            addCriterion("launch_date not like", value, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateIn(List<String> values) {
            addCriterion("launch_date in", values, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateNotIn(List<String> values) {
            addCriterion("launch_date not in", values, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateBetween(String value1, String value2) {
            addCriterion("launch_date between", value1, value2, "launchDate");
            return (Criteria) this;
        }

        public Criteria andLaunchDateNotBetween(String value1, String value2) {
            addCriterion("launch_date not between", value1, value2, "launchDate");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionIsNull() {
            addCriterion("time_limit_version is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionIsNotNull() {
            addCriterion("time_limit_version is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionEqualTo(Integer value) {
            addCriterion("time_limit_version =", value, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionNotEqualTo(Integer value) {
            addCriterion("time_limit_version <>", value, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionGreaterThan(Integer value) {
            addCriterion("time_limit_version >", value, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit_version >=", value, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionLessThan(Integer value) {
            addCriterion("time_limit_version <", value, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit_version <=", value, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionIn(List<Integer> values) {
            addCriterion("time_limit_version in", values, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionNotIn(List<Integer> values) {
            addCriterion("time_limit_version not in", values, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionBetween(Integer value1, Integer value2) {
            addCriterion("time_limit_version between", value1, value2, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andTimeLimitVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit_version not between", value1, value2, "timeLimitVersion");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysIsNull() {
            addCriterion("project_deviation_days is null");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysIsNotNull() {
            addCriterion("project_deviation_days is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysEqualTo(Integer value) {
            addCriterion("project_deviation_days =", value, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysNotEqualTo(Integer value) {
            addCriterion("project_deviation_days <>", value, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysGreaterThan(Integer value) {
            addCriterion("project_deviation_days >", value, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_deviation_days >=", value, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysLessThan(Integer value) {
            addCriterion("project_deviation_days <", value, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysLessThanOrEqualTo(Integer value) {
            addCriterion("project_deviation_days <=", value, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysIn(List<Integer> values) {
            addCriterion("project_deviation_days in", values, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysNotIn(List<Integer> values) {
            addCriterion("project_deviation_days not in", values, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysBetween(Integer value1, Integer value2) {
            addCriterion("project_deviation_days between", value1, value2, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("project_deviation_days not between", value1, value2, "projectDeviationDays");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentIsNull() {
            addCriterion("project_deviation_percent is null");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentIsNotNull() {
            addCriterion("project_deviation_percent is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentEqualTo(Float value) {
            addCriterion("project_deviation_percent =", value, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentNotEqualTo(Float value) {
            addCriterion("project_deviation_percent <>", value, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentGreaterThan(Float value) {
            addCriterion("project_deviation_percent >", value, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("project_deviation_percent >=", value, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentLessThan(Float value) {
            addCriterion("project_deviation_percent <", value, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentLessThanOrEqualTo(Float value) {
            addCriterion("project_deviation_percent <=", value, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentIn(List<Float> values) {
            addCriterion("project_deviation_percent in", values, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentNotIn(List<Float> values) {
            addCriterion("project_deviation_percent not in", values, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentBetween(Float value1, Float value2) {
            addCriterion("project_deviation_percent between", value1, value2, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andProjectDeviationPercentNotBetween(Float value1, Float value2) {
            addCriterion("project_deviation_percent not between", value1, value2, "projectDeviationPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishIsNull() {
            addCriterion("demand_plan_finish is null");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishIsNotNull() {
            addCriterion("demand_plan_finish is not null");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishEqualTo(Integer value) {
            addCriterion("demand_plan_finish =", value, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishNotEqualTo(Integer value) {
            addCriterion("demand_plan_finish <>", value, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishGreaterThan(Integer value) {
            addCriterion("demand_plan_finish >", value, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_plan_finish >=", value, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishLessThan(Integer value) {
            addCriterion("demand_plan_finish <", value, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishLessThanOrEqualTo(Integer value) {
            addCriterion("demand_plan_finish <=", value, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishIn(List<Integer> values) {
            addCriterion("demand_plan_finish in", values, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishNotIn(List<Integer> values) {
            addCriterion("demand_plan_finish not in", values, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishBetween(Integer value1, Integer value2) {
            addCriterion("demand_plan_finish between", value1, value2, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPlanFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_plan_finish not between", value1, value2, "demandPlanFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishIsNull() {
            addCriterion("demand_actually_finish is null");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishIsNotNull() {
            addCriterion("demand_actually_finish is not null");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishEqualTo(Integer value) {
            addCriterion("demand_actually_finish =", value, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishNotEqualTo(Integer value) {
            addCriterion("demand_actually_finish <>", value, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishGreaterThan(Integer value) {
            addCriterion("demand_actually_finish >", value, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_actually_finish >=", value, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishLessThan(Integer value) {
            addCriterion("demand_actually_finish <", value, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishLessThanOrEqualTo(Integer value) {
            addCriterion("demand_actually_finish <=", value, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishIn(List<Integer> values) {
            addCriterion("demand_actually_finish in", values, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishNotIn(List<Integer> values) {
            addCriterion("demand_actually_finish not in", values, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishBetween(Integer value1, Integer value2) {
            addCriterion("demand_actually_finish between", value1, value2, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandActuallyFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_actually_finish not between", value1, value2, "demandActuallyFinish");
            return (Criteria) this;
        }

        public Criteria andDemandPercentIsNull() {
            addCriterion("demand_percent is null");
            return (Criteria) this;
        }

        public Criteria andDemandPercentIsNotNull() {
            addCriterion("demand_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDemandPercentEqualTo(Float value) {
            addCriterion("demand_percent =", value, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentNotEqualTo(Float value) {
            addCriterion("demand_percent <>", value, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentGreaterThan(Float value) {
            addCriterion("demand_percent >", value, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("demand_percent >=", value, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentLessThan(Float value) {
            addCriterion("demand_percent <", value, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentLessThanOrEqualTo(Float value) {
            addCriterion("demand_percent <=", value, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentIn(List<Float> values) {
            addCriterion("demand_percent in", values, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentNotIn(List<Float> values) {
            addCriterion("demand_percent not in", values, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentBetween(Float value1, Float value2) {
            addCriterion("demand_percent between", value1, value2, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andDemandPercentNotBetween(Float value1, Float value2) {
            addCriterion("demand_percent not between", value1, value2, "demandPercent");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountIsNull() {
            addCriterion("testcase_count is null");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountIsNotNull() {
            addCriterion("testcase_count is not null");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountEqualTo(Integer value) {
            addCriterion("testcase_count =", value, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountNotEqualTo(Integer value) {
            addCriterion("testcase_count <>", value, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountGreaterThan(Integer value) {
            addCriterion("testcase_count >", value, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("testcase_count >=", value, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountLessThan(Integer value) {
            addCriterion("testcase_count <", value, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountLessThanOrEqualTo(Integer value) {
            addCriterion("testcase_count <=", value, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountIn(List<Integer> values) {
            addCriterion("testcase_count in", values, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountNotIn(List<Integer> values) {
            addCriterion("testcase_count not in", values, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountBetween(Integer value1, Integer value2) {
            addCriterion("testcase_count between", value1, value2, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestcaseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("testcase_count not between", value1, value2, "testcaseCount");
            return (Criteria) this;
        }

        public Criteria andTestingReturnIsNull() {
            addCriterion("testing_return is null");
            return (Criteria) this;
        }

        public Criteria andTestingReturnIsNotNull() {
            addCriterion("testing_return is not null");
            return (Criteria) this;
        }

        public Criteria andTestingReturnEqualTo(Integer value) {
            addCriterion("testing_return =", value, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnNotEqualTo(Integer value) {
            addCriterion("testing_return <>", value, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnGreaterThan(Integer value) {
            addCriterion("testing_return >", value, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("testing_return >=", value, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnLessThan(Integer value) {
            addCriterion("testing_return <", value, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnLessThanOrEqualTo(Integer value) {
            addCriterion("testing_return <=", value, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnIn(List<Integer> values) {
            addCriterion("testing_return in", values, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnNotIn(List<Integer> values) {
            addCriterion("testing_return not in", values, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnBetween(Integer value1, Integer value2) {
            addCriterion("testing_return between", value1, value2, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andTestingReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("testing_return not between", value1, value2, "testingReturn");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesIsNull() {
            addCriterion("dev_human_resources is null");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesIsNotNull() {
            addCriterion("dev_human_resources is not null");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesEqualTo(Integer value) {
            addCriterion("dev_human_resources =", value, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesNotEqualTo(Integer value) {
            addCriterion("dev_human_resources <>", value, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesGreaterThan(Integer value) {
            addCriterion("dev_human_resources >", value, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_human_resources >=", value, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesLessThan(Integer value) {
            addCriterion("dev_human_resources <", value, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesLessThanOrEqualTo(Integer value) {
            addCriterion("dev_human_resources <=", value, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesIn(List<Integer> values) {
            addCriterion("dev_human_resources in", values, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesNotIn(List<Integer> values) {
            addCriterion("dev_human_resources not in", values, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesBetween(Integer value1, Integer value2) {
            addCriterion("dev_human_resources between", value1, value2, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andDevHumanResourcesNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_human_resources not between", value1, value2, "devHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesIsNull() {
            addCriterion("test_human_resources is null");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesIsNotNull() {
            addCriterion("test_human_resources is not null");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesEqualTo(Integer value) {
            addCriterion("test_human_resources =", value, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesNotEqualTo(Integer value) {
            addCriterion("test_human_resources <>", value, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesGreaterThan(Integer value) {
            addCriterion("test_human_resources >", value, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_human_resources >=", value, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesLessThan(Integer value) {
            addCriterion("test_human_resources <", value, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesLessThanOrEqualTo(Integer value) {
            addCriterion("test_human_resources <=", value, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesIn(List<Integer> values) {
            addCriterion("test_human_resources in", values, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesNotIn(List<Integer> values) {
            addCriterion("test_human_resources not in", values, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesBetween(Integer value1, Integer value2) {
            addCriterion("test_human_resources between", value1, value2, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andTestHumanResourcesNotBetween(Integer value1, Integer value2) {
            addCriterion("test_human_resources not between", value1, value2, "testHumanResources");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeIsNull() {
            addCriterion("change_line_code is null");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeIsNotNull() {
            addCriterion("change_line_code is not null");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeEqualTo(Integer value) {
            addCriterion("change_line_code =", value, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeNotEqualTo(Integer value) {
            addCriterion("change_line_code <>", value, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeGreaterThan(Integer value) {
            addCriterion("change_line_code >", value, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_line_code >=", value, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeLessThan(Integer value) {
            addCriterion("change_line_code <", value, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeLessThanOrEqualTo(Integer value) {
            addCriterion("change_line_code <=", value, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeIn(List<Integer> values) {
            addCriterion("change_line_code in", values, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeNotIn(List<Integer> values) {
            addCriterion("change_line_code not in", values, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeBetween(Integer value1, Integer value2) {
            addCriterion("change_line_code between", value1, value2, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andChangeLineCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_line_code not between", value1, value2, "changeLineCode");
            return (Criteria) this;
        }

        public Criteria andBugZmIsNull() {
            addCriterion("bug_zm is null");
            return (Criteria) this;
        }

        public Criteria andBugZmIsNotNull() {
            addCriterion("bug_zm is not null");
            return (Criteria) this;
        }

        public Criteria andBugZmEqualTo(Integer value) {
            addCriterion("bug_zm =", value, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmNotEqualTo(Integer value) {
            addCriterion("bug_zm <>", value, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmGreaterThan(Integer value) {
            addCriterion("bug_zm >", value, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmGreaterThanOrEqualTo(Integer value) {
            addCriterion("bug_zm >=", value, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmLessThan(Integer value) {
            addCriterion("bug_zm <", value, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmLessThanOrEqualTo(Integer value) {
            addCriterion("bug_zm <=", value, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmIn(List<Integer> values) {
            addCriterion("bug_zm in", values, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmNotIn(List<Integer> values) {
            addCriterion("bug_zm not in", values, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmBetween(Integer value1, Integer value2) {
            addCriterion("bug_zm between", value1, value2, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugZmNotBetween(Integer value1, Integer value2) {
            addCriterion("bug_zm not between", value1, value2, "bugZm");
            return (Criteria) this;
        }

        public Criteria andBugYzIsNull() {
            addCriterion("bug_yz is null");
            return (Criteria) this;
        }

        public Criteria andBugYzIsNotNull() {
            addCriterion("bug_yz is not null");
            return (Criteria) this;
        }

        public Criteria andBugYzEqualTo(Integer value) {
            addCriterion("bug_yz =", value, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzNotEqualTo(Integer value) {
            addCriterion("bug_yz <>", value, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzGreaterThan(Integer value) {
            addCriterion("bug_yz >", value, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzGreaterThanOrEqualTo(Integer value) {
            addCriterion("bug_yz >=", value, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzLessThan(Integer value) {
            addCriterion("bug_yz <", value, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzLessThanOrEqualTo(Integer value) {
            addCriterion("bug_yz <=", value, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzIn(List<Integer> values) {
            addCriterion("bug_yz in", values, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzNotIn(List<Integer> values) {
            addCriterion("bug_yz not in", values, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzBetween(Integer value1, Integer value2) {
            addCriterion("bug_yz between", value1, value2, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYzNotBetween(Integer value1, Integer value2) {
            addCriterion("bug_yz not between", value1, value2, "bugYz");
            return (Criteria) this;
        }

        public Criteria andBugYbIsNull() {
            addCriterion("bug_yb is null");
            return (Criteria) this;
        }

        public Criteria andBugYbIsNotNull() {
            addCriterion("bug_yb is not null");
            return (Criteria) this;
        }

        public Criteria andBugYbEqualTo(Integer value) {
            addCriterion("bug_yb =", value, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbNotEqualTo(Integer value) {
            addCriterion("bug_yb <>", value, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbGreaterThan(Integer value) {
            addCriterion("bug_yb >", value, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbGreaterThanOrEqualTo(Integer value) {
            addCriterion("bug_yb >=", value, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbLessThan(Integer value) {
            addCriterion("bug_yb <", value, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbLessThanOrEqualTo(Integer value) {
            addCriterion("bug_yb <=", value, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbIn(List<Integer> values) {
            addCriterion("bug_yb in", values, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbNotIn(List<Integer> values) {
            addCriterion("bug_yb not in", values, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbBetween(Integer value1, Integer value2) {
            addCriterion("bug_yb between", value1, value2, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugYbNotBetween(Integer value1, Integer value2) {
            addCriterion("bug_yb not between", value1, value2, "bugYb");
            return (Criteria) this;
        }

        public Criteria andBugTsIsNull() {
            addCriterion("bug_ts is null");
            return (Criteria) this;
        }

        public Criteria andBugTsIsNotNull() {
            addCriterion("bug_ts is not null");
            return (Criteria) this;
        }

        public Criteria andBugTsEqualTo(Integer value) {
            addCriterion("bug_ts =", value, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsNotEqualTo(Integer value) {
            addCriterion("bug_ts <>", value, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsGreaterThan(Integer value) {
            addCriterion("bug_ts >", value, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bug_ts >=", value, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsLessThan(Integer value) {
            addCriterion("bug_ts <", value, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsLessThanOrEqualTo(Integer value) {
            addCriterion("bug_ts <=", value, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsIn(List<Integer> values) {
            addCriterion("bug_ts in", values, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsNotIn(List<Integer> values) {
            addCriterion("bug_ts not in", values, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsBetween(Integer value1, Integer value2) {
            addCriterion("bug_ts between", value1, value2, "bugTs");
            return (Criteria) this;
        }

        public Criteria andBugTsNotBetween(Integer value1, Integer value2) {
            addCriterion("bug_ts not between", value1, value2, "bugTs");
            return (Criteria) this;
        }

        public Criteria andCodeDiIsNull() {
            addCriterion("code_di is null");
            return (Criteria) this;
        }

        public Criteria andCodeDiIsNotNull() {
            addCriterion("code_di is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDiEqualTo(Float value) {
            addCriterion("code_di =", value, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiNotEqualTo(Float value) {
            addCriterion("code_di <>", value, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiGreaterThan(Float value) {
            addCriterion("code_di >", value, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiGreaterThanOrEqualTo(Float value) {
            addCriterion("code_di >=", value, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiLessThan(Float value) {
            addCriterion("code_di <", value, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiLessThanOrEqualTo(Float value) {
            addCriterion("code_di <=", value, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiIn(List<Float> values) {
            addCriterion("code_di in", values, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiNotIn(List<Float> values) {
            addCriterion("code_di not in", values, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiBetween(Float value1, Float value2) {
            addCriterion("code_di between", value1, value2, "codeDi");
            return (Criteria) this;
        }

        public Criteria andCodeDiNotBetween(Float value1, Float value2) {
            addCriterion("code_di not between", value1, value2, "codeDi");
            return (Criteria) this;
        }

        public Criteria andQualityReviewIsNull() {
            addCriterion("quality_review is null");
            return (Criteria) this;
        }

        public Criteria andQualityReviewIsNotNull() {
            addCriterion("quality_review is not null");
            return (Criteria) this;
        }

        public Criteria andQualityReviewEqualTo(String value) {
            addCriterion("quality_review =", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewNotEqualTo(String value) {
            addCriterion("quality_review <>", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewGreaterThan(String value) {
            addCriterion("quality_review >", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewGreaterThanOrEqualTo(String value) {
            addCriterion("quality_review >=", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewLessThan(String value) {
            addCriterion("quality_review <", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewLessThanOrEqualTo(String value) {
            addCriterion("quality_review <=", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewLike(String value) {
            addCriterion("quality_review like", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewNotLike(String value) {
            addCriterion("quality_review not like", value, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewIn(List<String> values) {
            addCriterion("quality_review in", values, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewNotIn(List<String> values) {
            addCriterion("quality_review not in", values, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewBetween(String value1, String value2) {
            addCriterion("quality_review between", value1, value2, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andQualityReviewNotBetween(String value1, String value2) {
            addCriterion("quality_review not between", value1, value2, "qualityReview");
            return (Criteria) this;
        }

        public Criteria andImprintIsNull() {
            addCriterion("imprint is null");
            return (Criteria) this;
        }

        public Criteria andImprintIsNotNull() {
            addCriterion("imprint is not null");
            return (Criteria) this;
        }

        public Criteria andImprintEqualTo(String value) {
            addCriterion("imprint =", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintNotEqualTo(String value) {
            addCriterion("imprint <>", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintGreaterThan(String value) {
            addCriterion("imprint >", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintGreaterThanOrEqualTo(String value) {
            addCriterion("imprint >=", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintLessThan(String value) {
            addCriterion("imprint <", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintLessThanOrEqualTo(String value) {
            addCriterion("imprint <=", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintLike(String value) {
            addCriterion("imprint like", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintNotLike(String value) {
            addCriterion("imprint not like", value, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintIn(List<String> values) {
            addCriterion("imprint in", values, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintNotIn(List<String> values) {
            addCriterion("imprint not in", values, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintBetween(String value1, String value2) {
            addCriterion("imprint between", value1, value2, "imprint");
            return (Criteria) this;
        }

        public Criteria andImprintNotBetween(String value1, String value2) {
            addCriterion("imprint not between", value1, value2, "imprint");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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