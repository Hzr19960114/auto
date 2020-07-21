package com.accp.domain;

public class ProjectPlanCase {
    private Integer planCaseId;

    private Integer caseId;

    private Integer planId;

    private Integer priority;

    public Integer getPlanCaseId() {
        return planCaseId;
    }

    public void setPlanCaseId(Integer planCaseId) {
        this.planCaseId = planCaseId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}