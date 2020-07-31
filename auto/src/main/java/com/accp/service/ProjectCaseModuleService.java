package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ProjectCaseModuleMapper;
import com.accp.dao.SysProjectMapper;
import com.accp.domain.ProjectCaseModule;
import com.accp.domain.ProjectCaseModuleExample;
import com.accp.domain.ProjectCaseModuleExample.Criteria;
import com.accp.domain.SysProject;
import com.accp.domain.SysProjectExample;

@Service
@Transactional
public class ProjectCaseModuleService {

	@Autowired
	ProjectCaseModuleMapper mapper;
	
	@Autowired
	SysProjectMapper projectMapper;
	
	
	public List<ProjectCaseModule> findByRoleId(String moduleName,String projectId){
		ProjectCaseModuleExample example=new ProjectCaseModuleExample();
		Criteria criteria=example.createCriteria();
		if(moduleName!=null) {
			if(moduleName!="") {
				criteria.andModuleNameLike("%"+moduleName+"%");
			}
		}
		if(projectId!=null) {
			if(projectId!="") {
				criteria.andProjectIdEqualTo(Integer.parseInt(projectId));
			}
		}
		List<ProjectCaseModule> list = mapper.selectByExample(example);
		ProjectCaseModule m = new ProjectCaseModule();
		m.setModuleId(list.get(0).getParentId());
		each(list,m);
		return m.getChildren();	
	}
	
	private void each(List<ProjectCaseModule> list,ProjectCaseModule projectCaseModule) {
		for(ProjectCaseModule m : list) {
			if(m.getParentId() == projectCaseModule.getModuleId()) {
				ProjectCaseModule childModule = new ProjectCaseModule();
				childModule.setModuleId(m.getModuleId());
				childModule.setModuleName(m.getModuleName());
				childModule.setParentId(m.getParentId());
				childModule.setProjectId(m.getProjectId());
				childModule.setAncestors(m.getAncestors());
				childModule.setOrderNum(m.getOrderNum());
				childModule.setCreateBy(m.getCreateBy());
				childModule.setCreateTime(m.getCreateTime());
				childModule.setUpdateBy(m.getUpdateBy());
				childModule.setUpdateTime(m.getUpdateTime());
				childModule.setRemark(m.getRemark());
				childModule.setProjectName(projectMapper.selectByPrimaryKey(m.getProjectId()).getProjectName());
				projectCaseModule.getChildren().add(childModule);
				this.each(list, childModule);
			}
		}
	}
	
	public List<SysProject> findProject(){
		return projectMapper.selectByExample(null);
	}
	
	public int create(ProjectCaseModule projectCaseModule) {
		projectCaseModule.setCreateTime(new Date());
		projectCaseModule.setUpdateTime(new Date());
		return mapper.insert(projectCaseModule);
	}
	
	public int remove(Integer moduleId) {
		return mapper.deleteByPrimaryKey(moduleId);
	}
	
	public ProjectCaseModule findById(Integer parentId) {
		return mapper.selectByPrimaryKey(parentId);
	}
	
	public int update(ProjectCaseModule projectCaseModule) {
		projectCaseModule.setUpdateTime(new Date());
		return mapper.updateByPrimaryKey(projectCaseModule);
	}
	
	public int projectId(String name) {
		SysProjectExample example=new SysProjectExample();
		example.createCriteria().andProjectNameEqualTo(name);
		return projectMapper.selectByExample(example)!=null?projectMapper.selectByExample(example).get(0).getProjectId():0;
	}
	
}
