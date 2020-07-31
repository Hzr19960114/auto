package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysOperLogMapper;
import com.accp.domain.SysOperLog;
import com.accp.domain.SysOperLogExample;
import com.accp.domain.SysOperLogExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysOperLogService {

	@Autowired
	SysOperLogMapper mapper;
	
	public List<SysOperLog> findAll(SysOperLog sysOperLog){
		SysOperLogExample example =new SysOperLogExample();
		Criteria criteria=example.createCriteria();
		if(sysOperLog.getTitle()!=null && sysOperLog.getTitle()!="") {
			criteria.andTitleLike("%"+sysOperLog.getTitle()+"%");
		}
		if(sysOperLog.getOperName()!=null && sysOperLog.getOperName()!="") {
			criteria.andOperNameLike("%"+sysOperLog.getOperName()+"%");
		}
		if(sysOperLog.getStatus()!=null && sysOperLog.getStatus()!=2) {
			criteria.andStatusEqualTo(sysOperLog.getStatus());
		}
		if(sysOperLog.getOperTime() != null && sysOperLog.getUpdateTime() !=null) {
			criteria.andOperTimeBetween(sysOperLog.getOperTime(), sysOperLog.getUpdateTime());
			
		}
		return mapper.selectByExample(example);
	}
	
	public PageInfo<SysOperLog> find(Integer page,Integer limit,SysOperLog sysOperLog){
		SysOperLogExample example =new SysOperLogExample();
		Criteria criteria=example.createCriteria();
		if(sysOperLog.getTitle()!=null && sysOperLog.getTitle()!="") {
			criteria.andTitleLike("%"+sysOperLog.getTitle()+"%");
		}
		if(sysOperLog.getOperName()!=null && sysOperLog.getOperName()!="") {
			criteria.andOperNameLike("%"+sysOperLog.getOperName()+"%");
		}
		if(sysOperLog.getStatus()!=null && sysOperLog.getStatus()!=2) {
			criteria.andStatusEqualTo(sysOperLog.getStatus());
		}
		if(sysOperLog.getOperTime() != null && sysOperLog.getUpdateTime() !=null) {

			System.out.println(sysOperLog.getOperTime()+"1111");
			criteria.andOperTimeBetween(sysOperLog.getOperTime(), sysOperLog.getUpdateTime());
			
		}
		List<SysOperLog> list=mapper.selectByExample(example);
		Page<SysOperLog> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	}
	
	public int removeList(List<SysOperLog> list){
		for (SysOperLog sysOperLog : list) {
			System.out.println(sysOperLog.getOperIp()+"1111");
			mapper.deleteByPrimaryKey(sysOperLog.getOperId());
		}
		return 0;
	}
	
	public int removeFind() {
		return mapper.deleteByExample(null);
	}
}
