package com.accp.domain;

public class ProjectTemplateParams {
    private Integer paramsId;

    private Integer templateId;

    private String paramName;

    private String paramValue;

    private Integer paramType;

    public Integer getParamsId() {
        return paramsId;
    }

    public void setParamsId(Integer paramsId) {
        this.paramsId = paramsId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Integer getParamType() {
        return paramType;
    }

    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }
}