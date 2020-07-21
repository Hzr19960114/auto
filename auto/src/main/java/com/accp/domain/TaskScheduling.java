package com.accp.domain;

public class TaskScheduling {
    private Integer schedulingId;

    private String schedulingName;

    private Integer jobId;

    private Integer projectId;

    private Integer planId;

    private Integer clientId;

    private Integer emailSendCondition;

    private String emailAddress;

    private String buildingLink;

    private String remoteShell;

    private Integer exThreadCount;

    private Integer taskType;

    private Integer browserType;

    private Integer taskTimeout;

    private String clientDriverPath;

    public Integer getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(Integer schedulingId) {
        this.schedulingId = schedulingId;
    }

    public String getSchedulingName() {
        return schedulingName;
    }

    public void setSchedulingName(String schedulingName) {
        this.schedulingName = schedulingName;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getEmailSendCondition() {
        return emailSendCondition;
    }

    public void setEmailSendCondition(Integer emailSendCondition) {
        this.emailSendCondition = emailSendCondition;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBuildingLink() {
        return buildingLink;
    }

    public void setBuildingLink(String buildingLink) {
        this.buildingLink = buildingLink;
    }

    public String getRemoteShell() {
        return remoteShell;
    }

    public void setRemoteShell(String remoteShell) {
        this.remoteShell = remoteShell;
    }

    public Integer getExThreadCount() {
        return exThreadCount;
    }

    public void setExThreadCount(Integer exThreadCount) {
        this.exThreadCount = exThreadCount;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getBrowserType() {
        return browserType;
    }

    public void setBrowserType(Integer browserType) {
        this.browserType = browserType;
    }

    public Integer getTaskTimeout() {
        return taskTimeout;
    }

    public void setTaskTimeout(Integer taskTimeout) {
        this.taskTimeout = taskTimeout;
    }

    public String getClientDriverPath() {
        return clientDriverPath;
    }

    public void setClientDriverPath(String clientDriverPath) {
        this.clientDriverPath = clientDriverPath;
    }
}