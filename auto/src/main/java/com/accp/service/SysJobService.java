package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysJobMapper;
import com.accp.domain.SysJob;
import com.accp.domain.SysJobExample;
import com.accp.domain.SysJobExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysJobService {
	
	@Autowired
	SysJobMapper mapper;
	
	public PageInfo<SysJob> find(Integer page,Integer limit,String jobName,String methodName,String status){
		SysJobExample example=new SysJobExample();
		Criteria criteria=example.createCriteria();
		if(jobName!=null) {
			if(jobName!="") {
				criteria.andJobNameLike("%"+jobName+"%");
			}
		}
		if(methodName!=null) {
			if(methodName!="") {
				criteria.andMethodNameLike("%"+methodName+"%");
			}
		}
		if(status!=null) {
			if(!status.equals("全部")) {
				criteria.andStatusEqualTo(status);
			}
		}
		List<SysJob> list=mapper.selectByExample(example);
		Page<SysJob> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	}
	
}
