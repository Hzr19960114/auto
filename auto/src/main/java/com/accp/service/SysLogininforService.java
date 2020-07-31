package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.dao.SysLogininforMapper;
import com.accp.domain.SysLogininfor;
import com.accp.domain.SysLogininforExample;
import com.accp.domain.SysLogininforExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysLogininforService {

	@Autowired
	SysLogininforMapper mapper;
	
	public PageInfo<SysLogininfor> find(Integer pageNum,Integer pageSize,String loginName,String ipaddr,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		SysLogininforExample example=new SysLogininforExample();
		Criteria criteria=example.createCriteria();
		if(loginName!=null) {
			if(loginName!="") {
				criteria.andLoginNameLike("%"+loginName+"%");
			}
		}
		if(ipaddr!=null) {
			if(ipaddr!="") {
				criteria.andIpaddrLike("%"+ipaddr+"%");
			}
		}
		if(status!=null) {
			if(!status.equals("全部")) {
				criteria.andStatusEqualTo(status);
			}
		}
		if(createTime!=null && updateTime!=null) {
			criteria.andLoginTimeBetween(createTime, updateTime);
			
		}
		List<SysLogininfor> list=mapper.selectByExample(example);
		Page<SysLogininfor> page=PageHelper.startPage(pageNum, pageSize);
		mapper.selectByExample(example);
		page.setPages(list.size());
		
		return page.toPageInfo();
	}
	
	public int removeList(@RequestBody List<SysLogininfor> list) {
		for (SysLogininfor sysLogininfor : list) {
			mapper.deleteByPrimaryKey(sysLogininfor.getInfoId());
		}
		return 0;
	}
	
	public int removeFind() {
		return mapper.deleteByExample(null);
	}
	
	public List<SysLogininfor> findAll(String loginName,String ipaddr,String status,@DateTimeFormat(pattern="yyyy-MM-dd") Date createTime,@DateTimeFormat(pattern="yyyy-MM-dd") Date updateTime){
		SysLogininforExample example=new SysLogininforExample();
		Criteria criteria=example.createCriteria();
		if(loginName!=null) {
			if(loginName!="") {
				criteria.andLoginNameLike("%"+loginName+"%");
			}
		}
		if(ipaddr!=null) {
			if(ipaddr!="") {
				criteria.andIpaddrLike("%"+ipaddr+"%");
			}
		}
		if(status!=null) {
			if(!status.equals("全部")) {
				criteria.andStatusEqualTo(status);
			}
		}
		if(createTime!=null && updateTime!=null) {
			criteria.andLoginTimeBetween(createTime, updateTime);
			
		}
		return mapper.selectByExample(example);
	}
}
