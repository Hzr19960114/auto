package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysUserOnlineMapper;
import com.accp.domain.SysUserOnlineExample.Criteria;
import com.accp.domain.SysUserOnline;
import com.accp.domain.SysUserOnlineExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysUserOnlineService {

	@Autowired
	SysUserOnlineMapper mapper;
	
	public PageInfo<SysUserOnline> find(Integer page,Integer limit,SysUserOnline suo){
		SysUserOnlineExample example =new SysUserOnlineExample();
		Criteria criteria=example.createCriteria();
		if(suo.getIpaddr()!=null && suo.getIpaddr()!="") {
			criteria.andIpaddrLike("%"+suo.getIpaddr()+"%");
		}
		if(suo.getLoginName()!=null && suo.getLoginName()!="") {
			criteria.andLoginNameLike("%"+suo.getLoginName()+"%");
		}
		List<SysUserOnline> list=mapper.selectByExample(example);
		Page<SysUserOnline> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	} 
	
	public int removeList(List<SysUserOnline> list){
		for (SysUserOnline suo : list) {
			mapper.deleteByPrimaryKey(suo.getSessionid());
		}
		return 0;
	}
	
	public int remove(String sessionid) {
		SysUserOnlineExample example = new SysUserOnlineExample();
		example.createCriteria().andSessionidEqualTo(sessionid);
		return mapper.deleteByExample(example);
	}
}
