package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QaAccidentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QaAccidentExample() {
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

        public Criteria andAccidentIdIsNull() {
            addCriterion("accident_id is null");
            return (Criteria) this;
        }

        public Criteria andAccidentIdIsNotNull() {
            addCriterion("accident_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentIdEqualTo(Integer value) {
            addCriterion("accident_id =", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdNotEqualTo(Integer value) {
            addCriterion("accident_id <>", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdGreaterThan(Integer value) {
            addCriterion("accident_id >", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accident_id >=", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdLessThan(Integer value) {
            addCriterion("accident_id <", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdLessThanOrEqualTo(Integer value) {
            addCriterion("accident_id <=", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdIn(List<Integer> values) {
            addCriterion("accident_id in", values, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdNotIn(List<Integer> values) {
            addCriterion("accident_id not in", values, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdBetween(Integer value1, Integer value2) {
            addCriterion("accident_id between", value1, value2, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accident_id not between", value1, value2, "accidentId");
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

        public Criteria andAccidentStatusIsNull() {
            addCriterion("accident_status is null");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusIsNotNull() {
            addCriterion("accident_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusEqualTo(String value) {
            addCriterion("accident_status =", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotEqualTo(String value) {
            addCriterion("accident_status <>", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusGreaterThan(String value) {
            addCriterion("accident_status >", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("accident_status >=", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusLessThan(String value) {
            addCriterion("accident_status <", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusLessThanOrEqualTo(String value) {
            addCriterion("accident_status <=", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusLike(String value) {
            addCriterion("accident_status like", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotLike(String value) {
            addCriterion("accident_status not like", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusIn(List<String> values) {
            addCriterion("accident_status in", values, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotIn(List<String> values) {
            addCriterion("accident_status not in", values, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusBetween(String value1, String value2) {
            addCriterion("accident_status between", value1, value2, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotBetween(String value1, String value2) {
            addCriterion("accident_status not between", value1, value2, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeIsNull() {
            addCriterion("accident_time is null");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeIsNotNull() {
            addCriterion("accident_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeEqualTo(String value) {
            addCriterion("accident_time =", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotEqualTo(String value) {
            addCriterion("accident_time <>", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeGreaterThan(String value) {
            addCriterion("accident_time >", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("accident_time >=", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeLessThan(String value) {
            addCriterion("accident_time <", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeLessThanOrEqualTo(String value) {
            addCriterion("accident_time <=", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeLike(String value) {
            addCriterion("accident_time like", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotLike(String value) {
            addCriterion("accident_time not like", value, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeIn(List<String> values) {
            addCriterion("accident_time in", values, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotIn(List<String> values) {
            addCriterion("accident_time not in", values, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeBetween(String value1, String value2) {
            addCriterion("accident_time between", value1, value2, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andAccidentTimeNotBetween(String value1, String value2) {
            addCriterion("accident_time not between", value1, value2, "accidentTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(String value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(String value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(String value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(String value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(String value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLike(String value) {
            addCriterion("report_time like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotLike(String value) {
            addCriterion("report_time not like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<String> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<String> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(String value1, String value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(String value1, String value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionIsNull() {
            addCriterion("accident_description is null");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionIsNotNull() {
            addCriterion("accident_description is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionEqualTo(String value) {
            addCriterion("accident_description =", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionNotEqualTo(String value) {
            addCriterion("accident_description <>", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionGreaterThan(String value) {
            addCriterion("accident_description >", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("accident_description >=", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionLessThan(String value) {
            addCriterion("accident_description <", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("accident_description <=", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionLike(String value) {
            addCriterion("accident_description like", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionNotLike(String value) {
            addCriterion("accident_description not like", value, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionIn(List<String> values) {
            addCriterion("accident_description in", values, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionNotIn(List<String> values) {
            addCriterion("accident_description not in", values, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionBetween(String value1, String value2) {
            addCriterion("accident_description between", value1, value2, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentDescriptionNotBetween(String value1, String value2) {
            addCriterion("accident_description not between", value1, value2, "accidentDescription");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelIsNull() {
            addCriterion("accident_level is null");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelIsNotNull() {
            addCriterion("accident_level is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelEqualTo(String value) {
            addCriterion("accident_level =", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelNotEqualTo(String value) {
            addCriterion("accident_level <>", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelGreaterThan(String value) {
            addCriterion("accident_level >", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelGreaterThanOrEqualTo(String value) {
            addCriterion("accident_level >=", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelLessThan(String value) {
            addCriterion("accident_level <", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelLessThanOrEqualTo(String value) {
            addCriterion("accident_level <=", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelLike(String value) {
            addCriterion("accident_level like", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelNotLike(String value) {
            addCriterion("accident_level not like", value, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelIn(List<String> values) {
            addCriterion("accident_level in", values, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelNotIn(List<String> values) {
            addCriterion("accident_level not in", values, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelBetween(String value1, String value2) {
            addCriterion("accident_level between", value1, value2, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentLevelNotBetween(String value1, String value2) {
            addCriterion("accident_level not between", value1, value2, "accidentLevel");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisIsNull() {
            addCriterion("accident_analysis is null");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisIsNotNull() {
            addCriterion("accident_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisEqualTo(String value) {
            addCriterion("accident_analysis =", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisNotEqualTo(String value) {
            addCriterion("accident_analysis <>", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisGreaterThan(String value) {
            addCriterion("accident_analysis >", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("accident_analysis >=", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisLessThan(String value) {
            addCriterion("accident_analysis <", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisLessThanOrEqualTo(String value) {
            addCriterion("accident_analysis <=", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisLike(String value) {
            addCriterion("accident_analysis like", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisNotLike(String value) {
            addCriterion("accident_analysis not like", value, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisIn(List<String> values) {
            addCriterion("accident_analysis in", values, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisNotIn(List<String> values) {
            addCriterion("accident_analysis not in", values, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisBetween(String value1, String value2) {
            addCriterion("accident_analysis between", value1, value2, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentAnalysisNotBetween(String value1, String value2) {
            addCriterion("accident_analysis not between", value1, value2, "accidentAnalysis");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIsNull() {
            addCriterion("accident_type is null");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIsNotNull() {
            addCriterion("accident_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeEqualTo(String value) {
            addCriterion("accident_type =", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotEqualTo(String value) {
            addCriterion("accident_type <>", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeGreaterThan(String value) {
            addCriterion("accident_type >", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("accident_type >=", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLessThan(String value) {
            addCriterion("accident_type <", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLessThanOrEqualTo(String value) {
            addCriterion("accident_type <=", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLike(String value) {
            addCriterion("accident_type like", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotLike(String value) {
            addCriterion("accident_type not like", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIn(List<String> values) {
            addCriterion("accident_type in", values, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotIn(List<String> values) {
            addCriterion("accident_type not in", values, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeBetween(String value1, String value2) {
            addCriterion("accident_type between", value1, value2, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotBetween(String value1, String value2) {
            addCriterion("accident_type not between", value1, value2, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceIsNull() {
            addCriterion("accident_consequence is null");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceIsNotNull() {
            addCriterion("accident_consequence is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceEqualTo(String value) {
            addCriterion("accident_consequence =", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceNotEqualTo(String value) {
            addCriterion("accident_consequence <>", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceGreaterThan(String value) {
            addCriterion("accident_consequence >", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceGreaterThanOrEqualTo(String value) {
            addCriterion("accident_consequence >=", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceLessThan(String value) {
            addCriterion("accident_consequence <", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceLessThanOrEqualTo(String value) {
            addCriterion("accident_consequence <=", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceLike(String value) {
            addCriterion("accident_consequence like", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceNotLike(String value) {
            addCriterion("accident_consequence not like", value, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceIn(List<String> values) {
            addCriterion("accident_consequence in", values, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceNotIn(List<String> values) {
            addCriterion("accident_consequence not in", values, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceBetween(String value1, String value2) {
            addCriterion("accident_consequence between", value1, value2, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andAccidentConsequenceNotBetween(String value1, String value2) {
            addCriterion("accident_consequence not between", value1, value2, "accidentConsequence");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionIsNull() {
            addCriterion("corrective_action is null");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionIsNotNull() {
            addCriterion("corrective_action is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionEqualTo(String value) {
            addCriterion("corrective_action =", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionNotEqualTo(String value) {
            addCriterion("corrective_action <>", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionGreaterThan(String value) {
            addCriterion("corrective_action >", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionGreaterThanOrEqualTo(String value) {
            addCriterion("corrective_action >=", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionLessThan(String value) {
            addCriterion("corrective_action <", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionLessThanOrEqualTo(String value) {
            addCriterion("corrective_action <=", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionLike(String value) {
            addCriterion("corrective_action like", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionNotLike(String value) {
            addCriterion("corrective_action not like", value, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionIn(List<String> values) {
            addCriterion("corrective_action in", values, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionNotIn(List<String> values) {
            addCriterion("corrective_action not in", values, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionBetween(String value1, String value2) {
            addCriterion("corrective_action between", value1, value2, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andCorrectiveActionNotBetween(String value1, String value2) {
            addCriterion("corrective_action not between", value1, value2, "correctiveAction");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeIsNull() {
            addCriterion("resolution_time is null");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeIsNotNull() {
            addCriterion("resolution_time is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeEqualTo(String value) {
            addCriterion("resolution_time =", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeNotEqualTo(String value) {
            addCriterion("resolution_time <>", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeGreaterThan(String value) {
            addCriterion("resolution_time >", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("resolution_time >=", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeLessThan(String value) {
            addCriterion("resolution_time <", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeLessThanOrEqualTo(String value) {
            addCriterion("resolution_time <=", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeLike(String value) {
            addCriterion("resolution_time like", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeNotLike(String value) {
            addCriterion("resolution_time not like", value, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeIn(List<String> values) {
            addCriterion("resolution_time in", values, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeNotIn(List<String> values) {
            addCriterion("resolution_time not in", values, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeBetween(String value1, String value2) {
            addCriterion("resolution_time between", value1, value2, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionTimeNotBetween(String value1, String value2) {
            addCriterion("resolution_time not between", value1, value2, "resolutionTime");
            return (Criteria) this;
        }

        public Criteria andResolutionerIsNull() {
            addCriterion("resolutioner is null");
            return (Criteria) this;
        }

        public Criteria andResolutionerIsNotNull() {
            addCriterion("resolutioner is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionerEqualTo(String value) {
            addCriterion("resolutioner =", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerNotEqualTo(String value) {
            addCriterion("resolutioner <>", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerGreaterThan(String value) {
            addCriterion("resolutioner >", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerGreaterThanOrEqualTo(String value) {
            addCriterion("resolutioner >=", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerLessThan(String value) {
            addCriterion("resolutioner <", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerLessThanOrEqualTo(String value) {
            addCriterion("resolutioner <=", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerLike(String value) {
            addCriterion("resolutioner like", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerNotLike(String value) {
            addCriterion("resolutioner not like", value, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerIn(List<String> values) {
            addCriterion("resolutioner in", values, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerNotIn(List<String> values) {
            addCriterion("resolutioner not in", values, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerBetween(String value1, String value2) {
            addCriterion("resolutioner between", value1, value2, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andResolutionerNotBetween(String value1, String value2) {
            addCriterion("resolutioner not between", value1, value2, "resolutioner");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionIsNull() {
            addCriterion("preventive_action is null");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionIsNotNull() {
            addCriterion("preventive_action is not null");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionEqualTo(String value) {
            addCriterion("preventive_action =", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionNotEqualTo(String value) {
            addCriterion("preventive_action <>", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionGreaterThan(String value) {
            addCriterion("preventive_action >", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionGreaterThanOrEqualTo(String value) {
            addCriterion("preventive_action >=", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionLessThan(String value) {
            addCriterion("preventive_action <", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionLessThanOrEqualTo(String value) {
            addCriterion("preventive_action <=", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionLike(String value) {
            addCriterion("preventive_action like", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionNotLike(String value) {
            addCriterion("preventive_action not like", value, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionIn(List<String> values) {
            addCriterion("preventive_action in", values, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionNotIn(List<String> values) {
            addCriterion("preventive_action not in", values, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionBetween(String value1, String value2) {
            addCriterion("preventive_action between", value1, value2, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiveActionNotBetween(String value1, String value2) {
            addCriterion("preventive_action not between", value1, value2, "preventiveAction");
            return (Criteria) this;
        }

        public Criteria andPreventiverIsNull() {
            addCriterion("preventiver is null");
            return (Criteria) this;
        }

        public Criteria andPreventiverIsNotNull() {
            addCriterion("preventiver is not null");
            return (Criteria) this;
        }

        public Criteria andPreventiverEqualTo(String value) {
            addCriterion("preventiver =", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverNotEqualTo(String value) {
            addCriterion("preventiver <>", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverGreaterThan(String value) {
            addCriterion("preventiver >", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverGreaterThanOrEqualTo(String value) {
            addCriterion("preventiver >=", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverLessThan(String value) {
            addCriterion("preventiver <", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverLessThanOrEqualTo(String value) {
            addCriterion("preventiver <=", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverLike(String value) {
            addCriterion("preventiver like", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverNotLike(String value) {
            addCriterion("preventiver not like", value, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverIn(List<String> values) {
            addCriterion("preventiver in", values, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverNotIn(List<String> values) {
            addCriterion("preventiver not in", values, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverBetween(String value1, String value2) {
            addCriterion("preventiver between", value1, value2, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventiverNotBetween(String value1, String value2) {
            addCriterion("preventiver not between", value1, value2, "preventiver");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateIsNull() {
            addCriterion("preventive_plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateIsNotNull() {
            addCriterion("preventive_plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateEqualTo(String value) {
            addCriterion("preventive_plan_date =", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateNotEqualTo(String value) {
            addCriterion("preventive_plan_date <>", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateGreaterThan(String value) {
            addCriterion("preventive_plan_date >", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateGreaterThanOrEqualTo(String value) {
            addCriterion("preventive_plan_date >=", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateLessThan(String value) {
            addCriterion("preventive_plan_date <", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateLessThanOrEqualTo(String value) {
            addCriterion("preventive_plan_date <=", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateLike(String value) {
            addCriterion("preventive_plan_date like", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateNotLike(String value) {
            addCriterion("preventive_plan_date not like", value, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateIn(List<String> values) {
            addCriterion("preventive_plan_date in", values, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateNotIn(List<String> values) {
            addCriterion("preventive_plan_date not in", values, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateBetween(String value1, String value2) {
            addCriterion("preventive_plan_date between", value1, value2, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventivePlanDateNotBetween(String value1, String value2) {
            addCriterion("preventive_plan_date not between", value1, value2, "preventivePlanDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateIsNull() {
            addCriterion("preventive_over_date is null");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateIsNotNull() {
            addCriterion("preventive_over_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateEqualTo(String value) {
            addCriterion("preventive_over_date =", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateNotEqualTo(String value) {
            addCriterion("preventive_over_date <>", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateGreaterThan(String value) {
            addCriterion("preventive_over_date >", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateGreaterThanOrEqualTo(String value) {
            addCriterion("preventive_over_date >=", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateLessThan(String value) {
            addCriterion("preventive_over_date <", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateLessThanOrEqualTo(String value) {
            addCriterion("preventive_over_date <=", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateLike(String value) {
            addCriterion("preventive_over_date like", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateNotLike(String value) {
            addCriterion("preventive_over_date not like", value, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateIn(List<String> values) {
            addCriterion("preventive_over_date in", values, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateNotIn(List<String> values) {
            addCriterion("preventive_over_date not in", values, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateBetween(String value1, String value2) {
            addCriterion("preventive_over_date between", value1, value2, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andPreventiveOverDateNotBetween(String value1, String value2) {
            addCriterion("preventive_over_date not between", value1, value2, "preventiveOverDate");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIsNull() {
            addCriterion("duration_time is null");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIsNotNull() {
            addCriterion("duration_time is not null");
            return (Criteria) this;
        }

        public Criteria andDurationTimeEqualTo(Integer value) {
            addCriterion("duration_time =", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotEqualTo(Integer value) {
            addCriterion("duration_time <>", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeGreaterThan(Integer value) {
            addCriterion("duration_time >", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration_time >=", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeLessThan(Integer value) {
            addCriterion("duration_time <", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeLessThanOrEqualTo(Integer value) {
            addCriterion("duration_time <=", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIn(List<Integer> values) {
            addCriterion("duration_time in", values, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotIn(List<Integer> values) {
            addCriterion("duration_time not in", values, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeBetween(Integer value1, Integer value2) {
            addCriterion("duration_time between", value1, value2, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("duration_time not between", value1, value2, "durationTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeIsNull() {
            addCriterion("impact_time is null");
            return (Criteria) this;
        }

        public Criteria andImpactTimeIsNotNull() {
            addCriterion("impact_time is not null");
            return (Criteria) this;
        }

        public Criteria andImpactTimeEqualTo(Integer value) {
            addCriterion("impact_time =", value, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeNotEqualTo(Integer value) {
            addCriterion("impact_time <>", value, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeGreaterThan(Integer value) {
            addCriterion("impact_time >", value, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("impact_time >=", value, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeLessThan(Integer value) {
            addCriterion("impact_time <", value, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeLessThanOrEqualTo(Integer value) {
            addCriterion("impact_time <=", value, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeIn(List<Integer> values) {
            addCriterion("impact_time in", values, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeNotIn(List<Integer> values) {
            addCriterion("impact_time not in", values, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeBetween(Integer value1, Integer value2) {
            addCriterion("impact_time between", value1, value2, "impactTime");
            return (Criteria) this;
        }

        public Criteria andImpactTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("impact_time not between", value1, value2, "impactTime");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameIsNull() {
            addCriterion("accident_file_name is null");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameIsNotNull() {
            addCriterion("accident_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameEqualTo(String value) {
            addCriterion("accident_file_name =", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameNotEqualTo(String value) {
            addCriterion("accident_file_name <>", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameGreaterThan(String value) {
            addCriterion("accident_file_name >", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("accident_file_name >=", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameLessThan(String value) {
            addCriterion("accident_file_name <", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameLessThanOrEqualTo(String value) {
            addCriterion("accident_file_name <=", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameLike(String value) {
            addCriterion("accident_file_name like", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameNotLike(String value) {
            addCriterion("accident_file_name not like", value, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameIn(List<String> values) {
            addCriterion("accident_file_name in", values, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameNotIn(List<String> values) {
            addCriterion("accident_file_name not in", values, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameBetween(String value1, String value2) {
            addCriterion("accident_file_name between", value1, value2, "accidentFileName");
            return (Criteria) this;
        }

        public Criteria andAccidentFileNameNotBetween(String value1, String value2) {
            addCriterion("accident_file_name not between", value1, value2, "accidentFileName");
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