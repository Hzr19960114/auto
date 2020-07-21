package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ProjectCaseDebugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCaseDebugExample() {
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

        public Criteria andDebugIdIsNull() {
            addCriterion("debug_id is null");
            return (Criteria) this;
        }

        public Criteria andDebugIdIsNotNull() {
            addCriterion("debug_id is not null");
            return (Criteria) this;
        }

        public Criteria andDebugIdEqualTo(Integer value) {
            addCriterion("debug_id =", value, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdNotEqualTo(Integer value) {
            addCriterion("debug_id <>", value, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdGreaterThan(Integer value) {
            addCriterion("debug_id >", value, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("debug_id >=", value, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdLessThan(Integer value) {
            addCriterion("debug_id <", value, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdLessThanOrEqualTo(Integer value) {
            addCriterion("debug_id <=", value, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdIn(List<Integer> values) {
            addCriterion("debug_id in", values, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdNotIn(List<Integer> values) {
            addCriterion("debug_id not in", values, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdBetween(Integer value1, Integer value2) {
            addCriterion("debug_id between", value1, value2, "debugId");
            return (Criteria) this;
        }

        public Criteria andDebugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("debug_id not between", value1, value2, "debugId");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDebugIsendIsNull() {
            addCriterion("debug_isend is null");
            return (Criteria) this;
        }

        public Criteria andDebugIsendIsNotNull() {
            addCriterion("debug_isend is not null");
            return (Criteria) this;
        }

        public Criteria andDebugIsendEqualTo(Integer value) {
            addCriterion("debug_isend =", value, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendNotEqualTo(Integer value) {
            addCriterion("debug_isend <>", value, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendGreaterThan(Integer value) {
            addCriterion("debug_isend >", value, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendGreaterThanOrEqualTo(Integer value) {
            addCriterion("debug_isend >=", value, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendLessThan(Integer value) {
            addCriterion("debug_isend <", value, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendLessThanOrEqualTo(Integer value) {
            addCriterion("debug_isend <=", value, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendIn(List<Integer> values) {
            addCriterion("debug_isend in", values, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendNotIn(List<Integer> values) {
            addCriterion("debug_isend not in", values, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendBetween(Integer value1, Integer value2) {
            addCriterion("debug_isend between", value1, value2, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andDebugIsendNotBetween(Integer value1, Integer value2) {
            addCriterion("debug_isend not between", value1, value2, "debugIsend");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNull() {
            addCriterion("log_level is null");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNotNull() {
            addCriterion("log_level is not null");
            return (Criteria) this;
        }

        public Criteria andLogLevelEqualTo(String value) {
            addCriterion("log_level =", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotEqualTo(String value) {
            addCriterion("log_level <>", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThan(String value) {
            addCriterion("log_level >", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThanOrEqualTo(String value) {
            addCriterion("log_level >=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThan(String value) {
            addCriterion("log_level <", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThanOrEqualTo(String value) {
            addCriterion("log_level <=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLike(String value) {
            addCriterion("log_level like", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotLike(String value) {
            addCriterion("log_level not like", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelIn(List<String> values) {
            addCriterion("log_level in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotIn(List<String> values) {
            addCriterion("log_level not in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelBetween(String value1, String value2) {
            addCriterion("log_level between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotBetween(String value1, String value2) {
            addCriterion("log_level not between", value1, value2, "logLevel");
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