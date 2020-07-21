package com.accp.domain;

public class SysProject {
    private Integer projectId;

    private String projectName;

    private Integer deptId;

    private String projectSign;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getProjectSign() {
        return projectSign;
    }

    public void setProjectSign(String projectSign) {
        this.projectSign = projectSign;
    }
}