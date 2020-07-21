package com.accp.domain;

import java.util.Date;

public class ProjectCaseSteps {
    private Integer stepId;

    private Integer caseId;

    private Integer projectId;

    private Integer stepSerialNumber;

    private String stepPath;

    private String stepOperation;

    private String stepParameters;

    private String action;

    private String expectedResult;

    private Integer stepType;

    private String extend;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String stepRemark;

    public Integer getStepId() {
        return stepId;
    }

    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getStepSerialNumber() {
        return stepSerialNumber;
    }

    public void setStepSerialNumber(Integer stepSerialNumber) {
        this.stepSerialNumber = stepSerialNumber;
    }

    public String getStepPath() {
        return stepPath;
    }

    public void setStepPath(String stepPath) {
        this.stepPath = stepPath;
    }

    public String getStepOperation() {
        return stepOperation;
    }

    public void setStepOperation(String stepOperation) {
        this.stepOperation = stepOperation;
    }

    public String getStepParameters() {
        return stepParameters;
    }

    public void setStepParameters(String stepParameters) {
        this.stepParameters = stepParameters;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public Integer getStepType() {
        return stepType;
    }

    public void setStepType(Integer stepType) {
        this.stepType = stepType;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStepRemark() {
        return stepRemark;
    }

    public void setStepRemark(String stepRemark) {
        this.stepRemark = stepRemark;
    }
}