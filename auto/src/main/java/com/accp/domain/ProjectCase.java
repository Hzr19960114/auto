package com.accp.domain;

import java.util.Date;

public class ProjectCase {
    private Integer caseId;

    private Integer caseSerialNumber;

    private String caseSign;

    private String caseName;

    private Integer projectId;

    private Integer moduleId;

    private Integer caseType;

    private Integer failcontinue;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getCaseSerialNumber() {
        return caseSerialNumber;
    }

    public void setCaseSerialNumber(Integer caseSerialNumber) {
        this.caseSerialNumber = caseSerialNumber;
    }

    public String getCaseSign() {
        return caseSign;
    }

    public void setCaseSign(String caseSign) {
        this.caseSign = caseSign;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public Integer getFailcontinue() {
        return failcontinue;
    }

    public void setFailcontinue(Integer failcontinue) {
        this.failcontinue = failcontinue;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}