package com.accp.domain;

import java.util.Date;

public class TaskExecute {
    private Integer taskId;

    private Integer schedulingId;

    private Integer projectId;

    private String taskName;

    private Integer taskStatus;

    private Integer caseTotalCount;

    private Integer caseSuccCount;

    private Integer caseFailCount;

    private Integer caseLockCount;

    private Integer caseNoexecCount;

    private Date finishTime;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(Integer schedulingId) {
        this.schedulingId = schedulingId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getCaseTotalCount() {
        return caseTotalCount;
    }

    public void setCaseTotalCount(Integer caseTotalCount) {
        this.caseTotalCount = caseTotalCount;
    }

    public Integer getCaseSuccCount() {
        return caseSuccCount;
    }

    public void setCaseSuccCount(Integer caseSuccCount) {
        this.caseSuccCount = caseSuccCount;
    }

    public Integer getCaseFailCount() {
        return caseFailCount;
    }

    public void setCaseFailCount(Integer caseFailCount) {
        this.caseFailCount = caseFailCount;
    }

    public Integer getCaseLockCount() {
        return caseLockCount;
    }

    public void setCaseLockCount(Integer caseLockCount) {
        this.caseLockCount = caseLockCount;
    }

    public Integer getCaseNoexecCount() {
        return caseNoexecCount;
    }

    public void setCaseNoexecCount(Integer caseNoexecCount) {
        this.caseNoexecCount = caseNoexecCount;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
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
}