package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysPostMapper;
import com.accp.domain.SysPost;
import com.accp.domain.SysPostExample;
import com.accp.domain.SysPostExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysPostService {

	@Autowired
	SysPostMapper mapper;
	
	public PageInfo<SysPost> find(Integer page,Integer limit,SysPost syspost){
		Page<SysPost> page1 =PageHelper.startPage(page, limit);
		SysPostExample example = new SysPostExample();
		Criteria criteria = example.createCriteria();
		if(syspost.getPostCode()!=null && syspost.getPostCode()!="") {
			criteria.andPostCodeLike("%"+syspost.getPostCode()+"%");
		}else if(syspost.getPostName()!=null && syspost.getPostName()!="") {
			criteria.andPostNameLike("%"+syspost.getPostName()+"%");
		}else if(syspost.getStatus()!=null && syspost.getStatus()!="") {
			criteria.andStatusLike("%"+syspost.getStatus()+"%");
		}
		List<SysPost> list = mapper.selectByExample(example);
		mapper.selectByExample(example);
		page1.setPages(list.size());
		return page1.toPageInfo();
	}
	
	public int create(SysPost syspost) {
		syspost.setCreateTime(new Date());
		return mapper.insert(syspost);
	}
	
	public int update(SysPost syspost) {
		syspost.setUpdateTime(new Date());
		return mapper.updateByPrimaryKey(syspost);
	}
	
	public int remove(Integer postId) {
		return mapper.deleteByPrimaryKey(postId);
	}
	
	public List<SysPost> findAll(SysPost syspost){
		SysPostExample example = new SysPostExample();
		Criteria criteria = example.createCriteria();
		if(syspost.getPostCode()!=null && syspost.getPostCode()!="") {
			criteria.andPostCodeLike("%"+syspost.getPostCode()+"%");
		}else if(syspost.getPostName()!=null && syspost.getPostName()!="") {
			criteria.andPostNameLike("%"+syspost.getPostName()+"%");
		}else if(syspost.getStatus()!=null && syspost.getStatus()!="") {
			criteria.andStatusLike("%"+syspost.getStatus()+"%");
		}
		return mapper.selectByExample(example);
	}
	
	public int removeAll(List<SysPost> syspost) {
		for (SysPost sysPost2 : syspost) {
			mapper.deleteByPrimaryKey(sysPost2.getPostId());
		}
		return 0000;
	}
}
