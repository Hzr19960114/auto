package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysDeptMapper;
import com.accp.dao.SysProjectMapper;
import com.accp.dao.SysUserMapper;
import com.accp.domain.SysDept;
import com.accp.domain.SysProject;
import com.accp.domain.SysProjectExample;
import com.accp.domain.SysRole;
import com.accp.domain.SysUser;
import com.accp.domain.SysUserExample;
import com.accp.domain.SysUserExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 项目管理 service
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysProjectService {
	 @Autowired
	 SysProjectMapper mapper;
 	 @Autowired
	 SysDeptMapper sysdept;
	 //分页数据
	 public PageInfo<SysProject> findByPage(Integer currentPage,Integer pageSize
			 							 ,String projectName, String projectSign){
		 	SysProjectExample example=new SysProjectExample();
			com.accp.domain.SysProjectExample.Criteria criteria=example.createCriteria();
			if(projectName!=null) {
				if(projectName!="") {
					criteria.andProjectNameLike("%"+projectName+"%");
					System.out.println(projectName);
				}
			}
			if(projectSign!=null) {
				if(projectSign!="") {
					criteria.andProjectSignLike("%"+projectSign+"%");
					System.out.println(projectSign);
				}
			}
			Page<SysProject> page=PageHelper.startPage(currentPage, pageSize);
			List<SysProject> list = mapper.selectByExample(example);
			for (SysProject sysUser : list) {
				if(sysUser.getDeptId()!=null) {
					SysDept dept = sysdept.selectByPrimaryKey(sysUser.getDeptId());
					if(dept!=null) {
						sysUser.setDeptName(dept.getDeptName());
					}
				}
			}
			return page.toPageInfo();
	 }
	 //批量删除
	 public int removeList(List<SysProject> sysdictData) {
		for (SysProject dictData : sysdictData) {
			mapper.deleteByPrimaryKey(dictData.getProjectId());
		}
		return 0;
	 }

	 //条件项目查询
	 public List<com.accp.domain.SysProject> findWhere(String projectName, String projectSign){//项目名称 项目表示
		 	SysProjectExample example=new SysProjectExample();
			com.accp.domain.SysProjectExample.Criteria criteria=example.createCriteria();
			if(projectName!=null) {
				if(projectName!="") {
					criteria.andProjectNameLike("%"+projectName+"%");
					System.out.println(projectName);
				}
			}
			if(projectSign!=null) {
				if(projectSign!="") {
					criteria.andProjectSignLike("%"+projectSign+"%");
					System.out.println(projectSign);
				}
			}
		 return mapper.selectByExample(example);
	 }
	 
	 //项目查找全部
	 public List<com.accp.domain.SysProject> finAll(){
		 return mapper.selectByExample(null);
	 }
	 //项目新增
	 public Integer create(com.accp.domain.SysProject pro) {
		 return mapper.insertSelective(pro);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysProject pro) {
		 return mapper.updateByPrimaryKey(pro);
	 } 
	 //删除
	 public Integer delete(Integer pro) {
		 return mapper.deleteByPrimaryKey(pro);
	 }
	 //导出
}
