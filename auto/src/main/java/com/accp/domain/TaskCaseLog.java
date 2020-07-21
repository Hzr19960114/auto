package com.accp.domain;

import java.util.Date;

public class TaskCaseLog {
    private Integer logId;

    private Integer taskCaseId;

    private Integer taskId;

    private String logDetail;

    private String logGrade;

    private String logStep;

    private String imgname;

    private Date createTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getTaskCaseId() {
        return taskCaseId;
    }

    public void setTaskCaseId(Integer taskCaseId) {
        this.taskCaseId = taskCaseId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getLogDetail() {
        return logDetail;
    }

    public void setLogDetail(String logDetail) {
        this.logDetail = logDetail;
    }

    public String getLogGrade() {
        return logGrade;
    }

    public void setLogGrade(String logGrade) {
        this.logGrade = logGrade;
    }

    public String getLogStep() {
        return logStep;
    }

    public void setLogStep(String logStep) {
        this.logStep = logStep;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}