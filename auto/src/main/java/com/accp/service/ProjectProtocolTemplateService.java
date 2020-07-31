package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ProjectProtocolTemplateMapper;
import com.accp.domain.ProjectProtocolTemplate;
import com.accp.domain.ProjectProtocolTemplateExample;
import com.accp.domain.ProjectProtocolTemplateExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ProjectProtocolTemplateService {

	@Autowired
	ProjectProtocolTemplateMapper mapper;
	
	public PageInfo<ProjectProtocolTemplate> find(Integer page,Integer limit,ProjectProtocolTemplate ppt){
		ProjectProtocolTemplateExample example =new ProjectProtocolTemplateExample();
		Criteria criteria=example.createCriteria();
		if(ppt.getTemplateName()!=null && ppt.getTemplateName()!="") {
			criteria.andTemplateNameLike("%"+ppt.getTemplateName()+"%");
		}
		if(ppt.getProjectId()!=null && ppt.getProjectId()!=0) {
			criteria.andProjectIdEqualTo(ppt.getProjectId());
		}
		List<ProjectProtocolTemplate> list=mapper.selectByExample(example);
		Page<ProjectProtocolTemplate> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	} 
	
	public int removeList(List<ProjectProtocolTemplate> list){
		for (ProjectProtocolTemplate ppt : list) {
			mapper.deleteByPrimaryKey(ppt.getTemplateId());
		}
		return 0;
	}
	
	public int remove(Integer templateId) {
		return mapper.deleteByPrimaryKey(templateId);
	}
	
	public int create(ProjectProtocolTemplate ppt) {
		ppt.setCreateTime(new Date());
		ppt.setCreateBy("admin");
		return mapper.insert(ppt);
	}
	
	public int update(ProjectProtocolTemplate ppt) {
		ppt.setUpdateTime(new Date());
		ppt.setUpdateBy("admin");
		return mapper.updateByPrimaryKey(ppt);
	}
}
