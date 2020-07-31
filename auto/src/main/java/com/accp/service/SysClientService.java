package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysClientMapper;
import com.accp.domain.SysClient;
import com.accp.domain.SysClientExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.accp.domain.SysClientExample.Criteria;

@Service
@Transactional
public class SysClientService {

	@Autowired
	SysClientMapper mapper;
	
	public PageInfo<SysClient> find(Integer page,Integer limit,SysClient sc){
		SysClientExample example =new SysClientExample();
		Criteria criteria=example.createCriteria();
		if(sc.getClientName()!=null && sc.getClientName()!="") {
			criteria.andClientNameLike("%"+sc.getClientName()+"%");
		}
		if(sc.getClientIp()!=null && sc.getClientIp()!="") {
			criteria.andClientIpLike("%"+sc.getClientIp()+"%");
		}
		if(sc.getRemark()!=null && sc.getRemark()!="") {
			criteria.andRemarkLike("%"+sc.getRemark()+"%");
		}
		List<SysClient> list=mapper.selectByExample(example);
		Page<SysClient> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	} 
	
	public int removeList(List<SysClient> list){
		for (SysClient sc : list) {
			mapper.deleteByPrimaryKey(sc.getClientId());
		}
		return 0;
	}
	
	public int remove(Integer clientId) {
		return mapper.deleteByPrimaryKey(clientId);
	}
	
	public int create(SysClient sc) {
		return mapper.insert(sc);
	}
	
	public int update(SysClient sc) {
		return mapper.updateByPrimaryKey(sc);
	}

}
