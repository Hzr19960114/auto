package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysClazzMapper;
import com.accp.dao.SysDeptMapper;
import com.accp.domain.SysClazz;
import com.accp.domain.SysClazzExample;
import com.accp.domain.SysDept;
import com.accp.domain.SysDeptExample;
/**
 * 班级
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysClazzService {
	@Autowired
	 SysClazzMapper mapper;
	
	//分树杈查找全部
	 public List<com.accp.domain.SysClazz> treeparent_id(Integer parent_id,String clazzName,String status){
		 SysClazzExample example=new SysClazzExample();
		 com.accp.domain.SysClazzExample.Criteria criteria=example.createCriteria();
		 if(clazzName!=null||status!=null) {
			 if(clazzName!=null) {
				 if(clazzName!="") {
						criteria.andClazzNameLike("%"+clazzName+"%");
						System.out.println(clazzName);
					}
			 }
			 if(status!=null) {
				 if(status!="") {
						criteria.andStatusEqualTo(status);
						System.out.println(status);
					}
			 }
			 return mapper.selectByExample(example);
		 }
		 List<com.accp.domain.SysClazz> list = mapper.selectByParent_id(parent_id);
		 return list;
	 }
	//新增
	 public Integer create(com.accp.domain.SysClazz clazz) {
		 clazz.setCreateTime(new Date());
		 return mapper.insertSelective(clazz);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysClazz clazz) {
		 clazz.setUpdateTime(new Date());
		 return mapper.updateByPrimaryKey(clazz);
	 } 
	 //删除 删除子集
	 public Integer delete(Integer clazz) {
		 SysClazzExample ex=new SysClazzExample();
		 ex.createCriteria().andParentIdEqualTo(clazz);
		 List<SysClazz> list = mapper.selectByExample(ex);
		 if(list.size()>0) {
			 for (SysClazz item : list) {
				 mapper.deleteByPrimaryKey(item.getClazzId());
			 }
		 }
		 return mapper.deleteByPrimaryKey(clazz);
	 }
	//查找
	 public List<com.accp.domain.SysClazz> find(){
		return mapper.selectByExample(null); 
	 }
}
