package com.accp.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SysRole {
    private Integer roleId;

    private String roleName;

    private String roleKey;

    private Integer roleSort;

    private String dataScope;

    private String status;

    private String delFlag;
    
    private int [] ids;

    private String createBy;
    public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private String updateBy;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updateTime;

    private String remark;

    //部门
    private List<SysDept> dept;
    //菜单
    private List<SysMenu> menu;
    //项目
    private List<SysProject> pro;
    
    

	public List<SysDept> getDept() {
		return dept;
	}

	public void setDept(List<SysDept> dept) {
		this.dept = dept;
	}

	public List<SysMenu> getMenu() {
		return menu;
	}

	public void setMenu(List<SysMenu> menu) {
		this.menu = menu;
	}

	public List<SysProject> getPro() {
		return pro;
	}

	public void setPro(List<SysProject> pro) {
		this.pro = pro;
	}

	public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public Integer getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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