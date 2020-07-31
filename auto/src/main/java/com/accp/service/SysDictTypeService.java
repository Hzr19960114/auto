package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysDictDataMapper;
import com.accp.dao.SysDictTypeMapper;
import com.accp.domain.SysDictDataExample;
import com.accp.domain.SysDictType;
import com.accp.domain.SysDictTypeExample;
import com.accp.domain.SysDictTypeExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysDictTypeService {

	@Autowired
	SysDictTypeMapper mapper;
	
	@Autowired
	SysDictDataMapper dataMapper;
	
	public List<SysDictType> find(){
		return mapper.selectByExample(null);
	}
	
	public PageInfo<SysDictType> find(Integer pageNum,Integer pageSize,String dictName,String dictType,String status,String createTime,String updateTime){
		SysDictTypeExample example=new SysDictTypeExample();
		Criteria criteria=example.createCriteria();
		if(dictName!=null) {
			if(dictName!="") {
				criteria.andDictNameLike("%"+dictName+"%");
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
		if(createTime!=null && updateTime!=null) {
			if(createTime!=""&&updateTime!="") {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				Date createTime1=new Date();
				Date updateTime1=new Date();
				try {
					createTime1 = sdf.parse(createTime);
					updateTime1 =sdf.parse(updateTime);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				criteria.andCreateTimeBetween(createTime1, updateTime1);
			}
		}
		List<SysDictType> list=mapper.selectByExample(example);
		Page<SysDictType> page=PageHelper.startPage(pageNum, pageSize);
		mapper.selectByExample(example);
		page.setPages(list.size());
		return page.toPageInfo();
	}
	
	public int remove(Integer id) {
		SysDictType sysDictType=mapper.selectByPrimaryKey(id);
		SysDictDataExample example =new SysDictDataExample();
		example.createCriteria().andDictTypeEqualTo(sysDictType.getDictType());
		dataMapper.deleteByExample(example);
		return mapper.deleteByPrimaryKey(id);
	}
	
	public int removeList(List<SysDictType> sysDictType) {
		for (SysDictType dict : sysDictType) {
			SysDictDataExample example =new SysDictDataExample();
			example.createCriteria().andDictTypeEqualTo(dict.getDictType());
			dataMapper.deleteByExample(example);
			mapper.deleteByPrimaryKey(dict.getDictId());
		}
		return 0;
	}
	
	public List<SysDictType> findAll(String dictName,String dictType,String status,String createTime,String updateTime){
		SysDictTypeExample example=new SysDictTypeExample();
		Criteria criteria=example.createCriteria();
		if(dictName!=null) {
			if(dictName!="") {
				criteria.andDictNameLike("%"+dictName+"%");
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
		if(createTime!=null && updateTime!=null) {
			if(createTime!=""&&updateTime!="") {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				Date createTime1=null;
				Date updateTime1=null;
				try {
					createTime1 = sdf.parse(createTime);
					updateTime1 =sdf.parse(updateTime);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				criteria.andCreateTimeBetween(createTime1, updateTime1);
			}
		}
		return mapper.selectByExample(example);
	}
	
	public int create(SysDictType sysDictType) {
		sysDictType.setCreateTime(new Date());
		return mapper.insert(sysDictType);
	}
	
	public int update(SysDictType sysDictType) {
		sysDictType.setUpdateTime(new Date());
		return mapper.updateByPrimaryKey(sysDictType);
	}
}
