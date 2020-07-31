package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysConfigMapper;
import com.accp.domain.SysConfig;
import com.accp.domain.SysConfigExample;
import com.accp.domain.SysJob;
import com.accp.domain.SysConfigExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysConfigService {

	@Autowired
	SysConfigMapper mapper;
	
	public PageInfo<SysConfig> find(Integer pageNum,Integer pageSize,SysConfig sysConfig){
		SysConfigExample example=new SysConfigExample();
		Criteria criteria=example.createCriteria();
		if(sysConfig.getConfigName()!=null) {
			if(sysConfig.getConfigName()!="") {
				criteria.andConfigNameLike("%"+sysConfig.getConfigName()+"%");
			}
		}
		if(sysConfig.getConfigKey()!=null) {
			if(sysConfig.getConfigKey()!="") {
				criteria.andConfigKeyLike("%"+sysConfig.getConfigKey()+"%");
			}
		}
		if(sysConfig.getConfigType()!=null) {
			if(!sysConfig.getConfigType().equals("全部")) {
				criteria.andConfigTypeEqualTo(sysConfig.getConfigType());
			}
		}
		if(sysConfig.getCreateTime()!=null && sysConfig.getUpdateTime()!=null) {
				criteria.andCreateTimeBetween(sysConfig.getCreateTime(), sysConfig.getUpdateTime());
		}
		List<SysConfig> list=mapper.selectByExample(example);
		Page<SysConfig> page=PageHelper.startPage(pageNum, pageSize);
		mapper.selectByExample(example);
		page.setPages(list.size());
		return page.toPageInfo();
	}
	
	public int update(SysConfig sysConfig) {
		return mapper.updateByPrimaryKey(sysConfig);
	}

}
