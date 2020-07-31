package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysDeptMapper;
import com.accp.domain.SysDept;

import java.util.ArrayList;
import java.util.Date;

import com.accp.domain.SysDeptExample;

/**
 * 部门表service
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysDeptService {
	 	 @Autowired
		 SysDeptMapper sysdept;
		
		//分树杈查找全部
		 public List<com.accp.domain.SysDept> treeparent_id(Integer parent_id,String deptName,String status){
			 SysDeptExample example=new SysDeptExample();
			 com.accp.domain.SysDeptExample.Criteria criteria=example.createCriteria();
			 if(deptName!=null||status!=null) {
				 if(deptName!=null) {
					 if(deptName!="") {
							criteria.andDeptNameLike("%"+deptName+"%");
							System.out.println(deptName);
						}
				 }
				 if(status!=null) {
					 if(status!="") {
							criteria.andStatusEqualTo(status);
							System.out.println(status);
						}
				 }
				 return sysdept.selectByExample(example);
			 }
			 List<com.accp.domain.SysDept> list = sysdept.selectByParent_id(parent_id);
			 this.dg(list);
			 return list;
		 }
		 public List<SysDept> dg(List<SysDept> list){
			 for (SysDept sysDept : list) {
				 sysDept.setTitle(sysDept.getDeptName());
				 if(sysDept.getChildren().size()>0) {
					 this.dg(sysDept.getChildren());
				 }
			}
			 return list;
		 }
		 //查找
		 public List<com.accp.domain.SysDept> find(){
			return sysdept.selectByExample(null); 
		 }
		 //条件查询
		 public List<com.accp.domain.SysDept> findWhere(String deptname,String status){//部门名称、部门状态
			 
			 return null;
		 }
		 //部门新增
		 public Integer create(com.accp.domain.SysDept dept) {
			 dept.setCreateTime(new Date());
			 return sysdept.insertSelective(dept);
		 }
		 //部门修改
		 public Integer update(com.accp.domain.SysDept dept) {
			 dept.setUpdateTime(new Date());
			 return sysdept.updateByPrimaryKey(dept);
		 } 
		 //部门删除 删除子集部门
		 public Integer delete(Integer dept) {
			 SysDeptExample ex=new SysDeptExample();
			 ex.createCriteria().andParentIdEqualTo(dept);
			 List<SysDept> list = sysdept.selectByExample(ex);
			 if(list.size()>0) {
				 for (SysDept item : list) {
					 sysdept.deleteByPrimaryKey(item.getDeptId());
				 }
			 }
			 return sysdept.deleteByPrimaryKey(dept);
		 }
		 //部门选项卡
		 public List<SysDept> findselect(){
			 List<SysDept>  list = sysdept.selectByExample(null);
			 List<SysDept>  rset =new ArrayList<SysDept>();
			 for (SysDept item : list) {
				SysDeptExample ex=new SysDeptExample();
				ex.createCriteria().andParentIdEqualTo(item.getDeptId());
				if(sysdept.selectByExample(ex).size()==0) {
					rset.add(item);
				}
			}
			 return rset;
		 }
}
