package com.accp.domain;

public class ProjectCaseDebug {
    private Integer debugId;

    private Integer caseId;

    private Integer userId;

    private Integer debugIsend;

    private String logLevel;

    private String logDetail;

    public Integer getDebugId() {
        return debugId;
    }

    public void setDebugId(Integer debugId) {
        this.debugId = debugId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDebugIsend() {
        return debugIsend;
    }

    public void setDebugIsend(Integer debugIsend) {
        this.debugIsend = debugIsend;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogDetail() {
        return logDetail;
    }

    public void setLogDetail(String logDetail) {
        this.logDetail = logDetail;
    }
}