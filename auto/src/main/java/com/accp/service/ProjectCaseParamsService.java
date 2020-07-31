package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.domain.ProjectCaseParamsExample.Criteria;

import com.accp.dao.ProjectCaseParamsMapper;
import com.accp.domain.ProjectCaseParams;
import com.accp.domain.ProjectCaseParamsExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ProjectCaseParamsService {

	@Autowired
	ProjectCaseParamsMapper mapper;
	
	public PageInfo<ProjectCaseParams> find(Integer page,Integer limit,ProjectCaseParams pcp){
		ProjectCaseParamsExample example =new ProjectCaseParamsExample();
		Criteria criteria=example.createCriteria();
		if(pcp.getProjectId() !=null && pcp.getProjectId()!=0) {
			criteria.andProjectIdEqualTo(pcp.getProjectId());
		}
		if(pcp.getParamsName()!=null && pcp.getParamsName()!="") {
			criteria.andParamsNameLike("%"+pcp.getParamsName()+"%");
		}
		if(pcp.getParamsValue()!=null && pcp.getParamsValue()!="") {
			criteria.andParamsValueLike("%"+pcp.getParamsValue()+"%");
		}
		List<ProjectCaseParams> list=mapper.selectByExample(example);
		Page<ProjectCaseParams> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	} 
	
	public int removeList(List<ProjectCaseParams> list){
		for (ProjectCaseParams pcp : list) {
			System.out.println(pcp.getParamsId()+"111");
			mapper.deleteByPrimaryKey(pcp.getParamsId());
		}
		return 0;
	}
	
	public int remove(Integer paramsId) {
		return mapper.deleteByPrimaryKey(paramsId);
	}
	
	public int create(ProjectCaseParams sps) {
		sps.setCreateTime(new Date());
		sps.setCreateBy("admin");
		return mapper.insert(sps);
	}
	
	public int update(ProjectCaseParams sps) {
		sps.setUpdateTime(new Date());
		sps.setUpdateBy("admin");
		return mapper.updateByPrimaryKey(sps);
	}
	
}
