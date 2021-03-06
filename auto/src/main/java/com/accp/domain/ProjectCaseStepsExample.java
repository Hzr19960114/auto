package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectCaseStepsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCaseStepsExample() {
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

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(Integer value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(Integer value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(Integer value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(Integer value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(Integer value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<Integer> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<Integer> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(Integer value1, Integer value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
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

        public Criteria andStepSerialNumberIsNull() {
            addCriterion("step_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberIsNotNull() {
            addCriterion("step_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberEqualTo(Integer value) {
            addCriterion("step_serial_number =", value, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberNotEqualTo(Integer value) {
            addCriterion("step_serial_number <>", value, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberGreaterThan(Integer value) {
            addCriterion("step_serial_number >", value, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_serial_number >=", value, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberLessThan(Integer value) {
            addCriterion("step_serial_number <", value, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("step_serial_number <=", value, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberIn(List<Integer> values) {
            addCriterion("step_serial_number in", values, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberNotIn(List<Integer> values) {
            addCriterion("step_serial_number not in", values, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("step_serial_number between", value1, value2, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("step_serial_number not between", value1, value2, "stepSerialNumber");
            return (Criteria) this;
        }

        public Criteria andStepPathIsNull() {
            addCriterion("step_path is null");
            return (Criteria) this;
        }

        public Criteria andStepPathIsNotNull() {
            addCriterion("step_path is not null");
            return (Criteria) this;
        }

        public Criteria andStepPathEqualTo(String value) {
            addCriterion("step_path =", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathNotEqualTo(String value) {
            addCriterion("step_path <>", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathGreaterThan(String value) {
            addCriterion("step_path >", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathGreaterThanOrEqualTo(String value) {
            addCriterion("step_path >=", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathLessThan(String value) {
            addCriterion("step_path <", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathLessThanOrEqualTo(String value) {
            addCriterion("step_path <=", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathLike(String value) {
            addCriterion("step_path like", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathNotLike(String value) {
            addCriterion("step_path not like", value, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathIn(List<String> values) {
            addCriterion("step_path in", values, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathNotIn(List<String> values) {
            addCriterion("step_path not in", values, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathBetween(String value1, String value2) {
            addCriterion("step_path between", value1, value2, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepPathNotBetween(String value1, String value2) {
            addCriterion("step_path not between", value1, value2, "stepPath");
            return (Criteria) this;
        }

        public Criteria andStepOperationIsNull() {
            addCriterion("step_operation is null");
            return (Criteria) this;
        }

        public Criteria andStepOperationIsNotNull() {
            addCriterion("step_operation is not null");
            return (Criteria) this;
        }

        public Criteria andStepOperationEqualTo(String value) {
            addCriterion("step_operation =", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationNotEqualTo(String value) {
            addCriterion("step_operation <>", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationGreaterThan(String value) {
            addCriterion("step_operation >", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationGreaterThanOrEqualTo(String value) {
            addCriterion("step_operation >=", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationLessThan(String value) {
            addCriterion("step_operation <", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationLessThanOrEqualTo(String value) {
            addCriterion("step_operation <=", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationLike(String value) {
            addCriterion("step_operation like", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationNotLike(String value) {
            addCriterion("step_operation not like", value, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationIn(List<String> values) {
            addCriterion("step_operation in", values, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationNotIn(List<String> values) {
            addCriterion("step_operation not in", values, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationBetween(String value1, String value2) {
            addCriterion("step_operation between", value1, value2, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepOperationNotBetween(String value1, String value2) {
            addCriterion("step_operation not between", value1, value2, "stepOperation");
            return (Criteria) this;
        }

        public Criteria andStepParametersIsNull() {
            addCriterion("step_parameters is null");
            return (Criteria) this;
        }

        public Criteria andStepParametersIsNotNull() {
            addCriterion("step_parameters is not null");
            return (Criteria) this;
        }

        public Criteria andStepParametersEqualTo(String value) {
            addCriterion("step_parameters =", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersNotEqualTo(String value) {
            addCriterion("step_parameters <>", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersGreaterThan(String value) {
            addCriterion("step_parameters >", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersGreaterThanOrEqualTo(String value) {
            addCriterion("step_parameters >=", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersLessThan(String value) {
            addCriterion("step_parameters <", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersLessThanOrEqualTo(String value) {
            addCriterion("step_parameters <=", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersLike(String value) {
            addCriterion("step_parameters like", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersNotLike(String value) {
            addCriterion("step_parameters not like", value, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersIn(List<String> values) {
            addCriterion("step_parameters in", values, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersNotIn(List<String> values) {
            addCriterion("step_parameters not in", values, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersBetween(String value1, String value2) {
            addCriterion("step_parameters between", value1, value2, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andStepParametersNotBetween(String value1, String value2) {
            addCriterion("step_parameters not between", value1, value2, "stepParameters");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andExpectedResultIsNull() {
            addCriterion("expected_result is null");
            return (Criteria) this;
        }

        public Criteria andExpectedResultIsNotNull() {
            addCriterion("expected_result is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedResultEqualTo(String value) {
            addCriterion("expected_result =", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultNotEqualTo(String value) {
            addCriterion("expected_result <>", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultGreaterThan(String value) {
            addCriterion("expected_result >", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultGreaterThanOrEqualTo(String value) {
            addCriterion("expected_result >=", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultLessThan(String value) {
            addCriterion("expected_result <", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultLessThanOrEqualTo(String value) {
            addCriterion("expected_result <=", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultLike(String value) {
            addCriterion("expected_result like", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultNotLike(String value) {
            addCriterion("expected_result not like", value, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultIn(List<String> values) {
            addCriterion("expected_result in", values, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultNotIn(List<String> values) {
            addCriterion("expected_result not in", values, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultBetween(String value1, String value2) {
            addCriterion("expected_result between", value1, value2, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andExpectedResultNotBetween(String value1, String value2) {
            addCriterion("expected_result not between", value1, value2, "expectedResult");
            return (Criteria) this;
        }

        public Criteria andStepTypeIsNull() {
            addCriterion("step_type is null");
            return (Criteria) this;
        }

        public Criteria andStepTypeIsNotNull() {
            addCriterion("step_type is not null");
            return (Criteria) this;
        }

        public Criteria andStepTypeEqualTo(Integer value) {
            addCriterion("step_type =", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeNotEqualTo(Integer value) {
            addCriterion("step_type <>", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeGreaterThan(Integer value) {
            addCriterion("step_type >", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_type >=", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeLessThan(Integer value) {
            addCriterion("step_type <", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeLessThanOrEqualTo(Integer value) {
            addCriterion("step_type <=", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeIn(List<Integer> values) {
            addCriterion("step_type in", values, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeNotIn(List<Integer> values) {
            addCriterion("step_type not in", values, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeBetween(Integer value1, Integer value2) {
            addCriterion("step_type between", value1, value2, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("step_type not between", value1, value2, "stepType");
            return (Criteria) this;
        }

        public Criteria andExtendIsNull() {
            addCriterion("extend is null");
            return (Criteria) this;
        }

        public Criteria andExtendIsNotNull() {
            addCriterion("extend is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEqualTo(String value) {
            addCriterion("extend =", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotEqualTo(String value) {
            addCriterion("extend <>", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThan(String value) {
            addCriterion("extend >", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThanOrEqualTo(String value) {
            addCriterion("extend >=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThan(String value) {
            addCriterion("extend <", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThanOrEqualTo(String value) {
            addCriterion("extend <=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLike(String value) {
            addCriterion("extend like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotLike(String value) {
            addCriterion("extend not like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendIn(List<String> values) {
            addCriterion("extend in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotIn(List<String> values) {
            addCriterion("extend not in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendBetween(String value1, String value2) {
            addCriterion("extend between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotBetween(String value1, String value2) {
            addCriterion("extend not between", value1, value2, "extend");
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

        public Criteria andStepRemarkIsNull() {
            addCriterion("step_remark is null");
            return (Criteria) this;
        }

        public Criteria andStepRemarkIsNotNull() {
            addCriterion("step_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStepRemarkEqualTo(String value) {
            addCriterion("step_remark =", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkNotEqualTo(String value) {
            addCriterion("step_remark <>", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkGreaterThan(String value) {
            addCriterion("step_remark >", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("step_remark >=", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkLessThan(String value) {
            addCriterion("step_remark <", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkLessThanOrEqualTo(String value) {
            addCriterion("step_remark <=", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkLike(String value) {
            addCriterion("step_remark like", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkNotLike(String value) {
            addCriterion("step_remark not like", value, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkIn(List<String> values) {
            addCriterion("step_remark in", values, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkNotIn(List<String> values) {
            addCriterion("step_remark not in", values, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkBetween(String value1, String value2) {
            addCriterion("step_remark between", value1, value2, "stepRemark");
            return (Criteria) this;
        }

        public Criteria andStepRemarkNotBetween(String value1, String value2) {
            addCriterion("step_remark not between", value1, value2, "stepRemark");
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