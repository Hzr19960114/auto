package com.accp.domain;

import java.util.Date;

public class ProjectProtocolTemplate {
    private Integer templateId;

    private String templateName;

    private Integer projectId;

    private String headMsg;

    private String cerificatePath;

    private String encoding;

    private Integer timeout;

    private Integer isResponseHead;

    private Integer isResponseCode;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getHeadMsg() {
        return headMsg;
    }

    public void setHeadMsg(String headMsg) {
        this.headMsg = headMsg;
    }

    public String getCerificatePath() {
        return cerificatePath;
    }

    public void setCerificatePath(String cerificatePath) {
        this.cerificatePath = cerificatePath;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getIsResponseHead() {
        return isResponseHead;
    }

    public void setIsResponseHead(Integer isResponseHead) {
        this.isResponseHead = isResponseHead;
    }

    public Integer getIsResponseCode() {
        return isResponseCode;
    }

    public void setIsResponseCode(Integer isResponseCode) {
        this.isResponseCode = isResponseCode;
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