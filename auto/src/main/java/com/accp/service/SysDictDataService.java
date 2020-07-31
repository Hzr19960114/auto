package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysDictDataMapper;
import com.accp.domain.SysDictData;
import com.accp.domain.SysDictDataExample;
import com.accp.domain.SysDictDataExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysDictDataService {

	@Autowired
	SysDictDataMapper mapper;
	
	public PageInfo<SysDictData> find(Integer page,Integer limit,String dictType,String dictLabel,String status){
		SysDictDataExample example=new SysDictDataExample();
		Criteria criteria=example.createCriteria();
		if(dictLabel!=null) {
			if(dictLabel!="") {
				criteria.andDictLabelLike("%"+dictLabel+"%");
			}
		}
		if(dictType!=null) {
			if(dictType!="") {
				criteria.andDictTypeLike("%"+dictType+"%");
			}
		}
		if(status!=null) {
			if(!status.equals("全部")) {
				criteria.andStatusEqualTo(status);
			}
		}
		List<SysDictData> list=mapper.selectByExample(example);
		Page<SysDictData> pageInfo=PageHelper.startPage(page, limit);
		mapper.selectByExample(example);
		pageInfo.setPages(list.size());
		return pageInfo.toPageInfo();
	}
	
	public int remove(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
	public int removeList(List<SysDictData> sysdictData) {
		for (SysDictData dictData : sysdictData) {
			mapper.deleteByPrimaryKey(dictData.getDictCode());
		}
		return 0;
	}
	
	public List<SysDictData> findAll(String dictLabel,String dictType,String status){
		SysDictDataExample example=new SysDictDataExample();
		Criteria criteria=example.createCriteria();
		if(dictLabel!=null) {
			if(dictLabel!="") {
				criteria.andDictLabelLike("%"+dictLabel+"%");
			}
		}
		if(dictType!=null) {
			if(dictType!="") {
				criteria.andDictTypeLike("%"+dictType+"%");
			}
		}
		if(status!=null) {
			if(!status.equals("全部")) {
				criteria.andStatusEqualTo(status);
			}
		}
		return mapper.selectByExample(example);
	}
	
	public int create(SysDictData sysDictData) {
		sysDictData.setCreateTime(new Date());
		return mapper.insert(sysDictData);
	}
	
	public int update(SysDictData sysDictData) {
		sysDictData.setUpdateTime(new Date());
		return mapper.updateByPrimaryKey(sysDictData);
	}
}
