package com.accp.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysJobLogMapper;
import com.accp.domain.SysJobLog;
import com.accp.domain.SysJobLogExample;
import com.accp.domain.SysJobLogExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysJobLogService {

	@Autowired
	SysJobLogMapper mapper;
	
	public List<SysJobLog> findAll(String jobName,String methodName,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		SysJobLogExample example =new SysJobLogExample();
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
		if(createTime!=null && updateTime!=null) {
			criteria.andCreateTimeBetween(createTime, updateTime);
			
		}
		return mapper.selectByExample(example);
	}
	
	public PageInfo<SysJobLog> find(Integer page,Integer limit,String jobName,String methodName,String status,Date createTime,Date updateTime){
		SysJobLogExample example =new SysJobLogExample();
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
		if(createTime!=null && updateTime!=null) {
			criteria.andCreateTimeBetween(createTime, updateTime);
			
		}
		List<SysJobLog> list=mapper.selectByExample(example);
		Page<SysJobLog> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	}
	
	public int removeList(List<SysJobLog> list){
		for (SysJobLog sysJobLog : list) {
			mapper.deleteByPrimaryKey(sysJobLog.getJobLogId());
		}
		return 0;
	}
	
	public int remove(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
	public int removeFind() {
		return mapper.deleteByExample(null);
	}
}
