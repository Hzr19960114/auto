package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysProjectMapper;
import com.accp.dao.SysRoleMapper;
import com.accp.dao.SysRoleProjectMapper;
import com.accp.dao.SysUserMapper;
import com.accp.domain.SysProject;
import com.accp.domain.SysRole;
import com.accp.domain.SysRoleExample;
import com.accp.domain.SysRoleProjectExample;
import com.accp.domain.SysRoleProjectKey;
import com.accp.domain.SysUser;
import com.accp.domain.SysUserExample;
import com.accp.domain.SysUserExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 角色表service
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysRoleService {
	 @Autowired
	 SysRoleMapper mapper;
	 @Autowired
	 SysRoleProjectMapper rpmapper;
	 @Autowired
	 SysProjectMapper spmapper;
	 //分页数据
	 public PageInfo<SysRole> findByPage(Integer currentPage,Integer pageSize
				 ,String roleName, String roleKey
				 ,String status
				 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			Page<SysRole> page=PageHelper.startPage(currentPage, pageSize);
			SysRoleExample example=new SysRoleExample();
			com.accp.domain.SysRoleExample.Criteria criteria=example.createCriteria();
			if(roleName!=null) {
				if(roleName!="") {
					criteria.andRoleNameLike("%"+roleName+"%");
					System.out.println(roleName);
				}
			}
			if(roleKey!=null) {
				if(roleKey!="") {
					criteria.andRoleKeyLike("%"+roleKey+"%");
					System.out.println(roleKey);
				}
			}
			if(status!=null) {
				if(status!="") {
					criteria.andStatusEqualTo(status);
					System.out.println(status);
				}
			}
			//日期
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
			List<SysRole>  srlist = mapper.selectByExample(example);
			for (SysRole item : srlist) {
				SysRoleProjectExample ex=new SysRoleProjectExample();
				ex.createCriteria().andRoleIdEqualTo(item.getRoleId());
				List<SysRoleProjectKey> srpk=rpmapper.selectByExample(ex);
				List<SysProject> sp=new ArrayList<SysProject>();
				for (SysRoleProjectKey item2 : srpk) {
					sp.add(spmapper.selectByPrimaryKey(item2.getProjectId()));
				}
				item.setPro(sp);
			}
			//可操作项目类型
			return page.toPageInfo();
	 }
	 //查找全部
	 public List<com.accp.domain.SysRole> finAll(){
		 return mapper.selectByExample(null);
	 }
	 //条件查询
	 public List<SysRole> wherefind(String roleName, String roleKey
			 ,String status
			 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
		 	SysRoleExample example=new SysRoleExample();
			com.accp.domain.SysRoleExample.Criteria criteria=example.createCriteria();
			if(roleName!=null) {
				if(roleName!="") {
					criteria.andRoleNameLike("%"+roleName+"%");
					System.out.println(roleName);
				}
			}
			if(roleKey!=null) {
				if(roleKey!="") {
					criteria.andRoleKeyLike("%"+roleKey+"%");
					System.out.println(roleKey);
				}
			}
			if(status!=null) {
				if(status!="") {
					criteria.andStatusEqualTo(status);
					System.out.println(status);
				}
			}
		//日期判断
		return mapper.selectByExample(example);
	}
	//新增项目角色表id
	 public Integer createRoleidAndProid(int rid,Integer [] proids) {
		 int append=0;
		 for (Integer integer : proids) {
			 SysRoleProjectKey srpk=new SysRoleProjectKey();
			 srpk.setRoleId(rid);
			 srpk.setProjectId(integer);
			 int jg=  rpmapper.insert(srpk);
			 if(jg>0) {
				 append++;
			 }
		}
		 return append;
	 }
	 //新增
	 public Integer create(com.accp.domain.SysRole role) {
		 role.setCreateTime(new Date());
		 role.setUpdateTime(new Date());
		 int jg = mapper.insertSelective(role);
		 if(jg>0) {
			 int [] a = role.getIds();
			 if(a!=null) {
				 for (int iterable_element : role.getIds()) {
					 SysRoleProjectKey ke=new SysRoleProjectKey();
					 ke.setRoleId(role.getRoleId());
					 ke.setProjectId(iterable_element);
					 rpmapper.insertSelective(ke);
				 }
			 }
		 }
		 return jg;
	 }
	 //修改
	 public Integer update(com.accp.domain.SysRole role) {
		 SysRoleProjectExample ex=new SysRoleProjectExample();
		 ex.createCriteria().andRoleIdEqualTo(role.getRoleId());
		 rpmapper.deleteByExample(ex);
		 
		 int [] a = role.getIds();
		 if(a!=null) {
			 for (int iterable_element : role.getIds()) {
				 SysRoleProjectKey ke=new SysRoleProjectKey();
				 ke.setRoleId(role.getRoleId());
				 ke.setProjectId(iterable_element);
				 rpmapper.insertSelective(ke);
			 }
		 }
		 role.setUpdateTime(new Date());
		 return mapper.updateByPrimaryKey(role);
	 } 
	 //删除
	 public Integer delete(Integer role) {
		 return mapper.deleteByPrimaryKey(role);
	 }
	 //批量删除
	 public int removeList(List<SysRole> sysdictData) {
		for (SysRole dictData : sysdictData) {
			mapper.deleteByPrimaryKey(dictData.getRoleId());
		}
		return 0;
	 }
	 //查询所有项目
	 public List<SysProject> findpro(){
		 return spmapper.selectByExample(null);
	 }
}
