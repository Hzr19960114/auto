package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysDeptMapper;
import com.accp.dao.SysUserMapper;
import com.accp.domain.SysDept;
import com.accp.domain.SysUser;
import com.accp.domain.SysUserExample;
import com.accp.domain.SysUserExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 用户表service
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysUserService {
	 @Autowired
	 SysUserMapper sysuser;
 	 @Autowired
	 SysDeptMapper sysdept;
	 //分页数据
	 /*public PageInfo<SysUser> findByPage(Integer currentPage,Integer pageSize
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			Page<SysUser> page=PageHelper.startPage(currentPage, pageSize);
			SysUserExample ex=new SysUserExample();
			sysuser.selectByExample(null);
			return page.toPageInfo();
	 }*/
	 public PageInfo<SysUser> findByPage(Integer currentPage,Integer pageSize
			 					,String login_name, String phonenumber
			 					,String status
			 					,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
		 	SysUserExample example=new SysUserExample();
			Criteria criteria=example.createCriteria();
			if(login_name!=null) {
				if(login_name!="") {
					criteria.andLoginNameLike("%"+login_name+"%");
					System.out.println(login_name);
				}
			}
			if(phonenumber!=null) {
				if(phonenumber!="") {
					criteria.andPhonenumberLike("%"+phonenumber+"%");
					System.out.println(phonenumber);
				}
			}
			if(status!=null) {
				if(status!="") {
					criteria.andStatusEqualTo(status);
					System.out.println(status);
				}
			}
			//日期判断
			if(createtimenum1!=null&&createtimenum2!=null) {
				if(createtimenum1!=""&&createtimenum2!="") {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					try {
					criteria.andCreateTimeBetween(sdf.parse(createtimenum1), sdf.parse(createtimenum2));
					System.out.println(createtimenum1+createtimenum2);
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			}
			Page<SysUser> pageInfo=PageHelper.startPage(currentPage, pageSize);
			List<SysUser> list = sysuser.selectByExample(example);
			for (SysUser sysUser : list) {
				if(sysUser.getDeptId()!=null) {
					SysDept dept = sysdept.selectByPrimaryKey(sysUser.getDeptId());
					if(dept!=null) {
						sysUser.setDeptName(dept.getDeptName());
					}
				}
			}
			return pageInfo.toPageInfo();
		}
	 
	 //批量删除
	 public int removeList(List<SysUser> sysdictData) {
		for (SysUser dictData : sysdictData) {
			sysuser.deleteByPrimaryKey(dictData.getUserId());
		}
		return 0;
	 }
	 //查找全部
	 public List<com.accp.domain.SysUser> finAll(){
		 
		 return sysuser.selectByExample(null);
	 }
	 //条件查询
	 public List<SysUser> wherefind(String login_name, String phonenumber
										,String status
										,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
		SysUserExample example=new SysUserExample();
		Criteria criteria=example.createCriteria();
		if(login_name!=null) {
		if(login_name!="") {
			criteria.andLoginNameLike("%"+login_name+"%");
			System.out.println(login_name);
		}
		}
		if(phonenumber!=null) {
		if(phonenumber!="") {
			criteria.andPhonenumberLike("%"+phonenumber+"%");
			System.out.println(phonenumber);
		}
		}
		if(status!=null) {
		if(status!="") {
			criteria.andStatusEqualTo(status);
			System.out.println(status);
		}
		}
		//日期判断
		return sysuser.selectByExample(example);
	}
	 //新增
	 public Integer create(com.accp.domain.SysUser user) {
		 user.setCreateTime(new Date());
		 return sysuser.insertSelective(user);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysUser user) {
		 System.out.println(user.getUserId());
		 user.setUpdateTime(new Date());
		 return sysuser.updateByPrimaryKey(user);
	 } 
	 //删除
	 public Integer delete(Integer user) {
		 return sysuser.deleteByPrimaryKey(user);
	 }
	 //导入
	 //导出
}
