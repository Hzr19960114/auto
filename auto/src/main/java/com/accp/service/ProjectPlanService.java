package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ProjectPlanMapper;
import com.accp.domain.ProjectPlan;
import com.accp.domain.ProjectPlanExample;
import com.accp.domain.ProjectPlanExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ProjectPlanService {

	@Autowired
	ProjectPlanMapper mapper;
	
	public PageInfo<ProjectPlan> find(Integer page,Integer limit,ProjectPlan pp){
		ProjectPlanExample example =new ProjectPlanExample();
		Criteria criteria=example.createCriteria();
		if(pp.getProjectId() !=null && pp.getProjectId()!=0) {
			criteria.andProjectIdEqualTo(pp.getProjectId());
		}
		if(pp.getPlanName()!=null && pp.getPlanName()!="") {
			criteria.andPlanNameLike("%"+pp.getPlanName()+"%");
		}
		List<ProjectPlan> list=mapper.selectByExample(example);
		Page<ProjectPlan> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	} 
	
	public int removeList(List<ProjectPlan> list){
		for (ProjectPlan pp : list) {
			mapper.deleteByPrimaryKey(pp.getPlanId());
		}
		return 0;
	}
	
	public int remove(Integer planId) {
		return mapper.deleteByPrimaryKey(planId);
	}
	
	public int create(ProjectPlan pp) {
		pp.setCreateTime(new Date());
		pp.setCreateBy("admin");
		return mapper.insert(pp);
	}
	
	public int update(ProjectPlan pp) {
		pp.setUpdateTime(new Date());
		pp.setUpdateBy("admin");
		return mapper.updateByPrimaryKey(pp);
	}
}
