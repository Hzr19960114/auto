package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysClientMapper;
import com.accp.dao.SysProjectMapper;
import com.accp.domain.SysClient;
import com.accp.domain.SysClientExample;
import com.accp.domain.SysConfig;
import com.accp.domain.SysUser;
import com.accp.domain.SysUserExample;
import com.accp.domain.SysUserExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 客户端管理service
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysClientService {
	 @Autowired
	 SysClientMapper mapper;
	 //分页数据
	 public PageInfo<SysClient> findByPage(Integer currentPage,Integer pageSize
									 		,String clientName, String clientIp
									 		,String remark){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			Page<SysClient> page=PageHelper.startPage(currentPage, pageSize);
			SysClientExample example=new SysClientExample();
			com.accp.domain.SysClientExample.Criteria criteria=example.createCriteria();
			if(clientName!=null) {
				if(clientName!="") {
					criteria.andClientNameLike("%"+clientName+"%");
					System.out.println(clientName);
				}
			}
			if(clientIp!=null) {
				if(clientIp!="") {
					criteria.andClientIpLike("%"+clientIp+"%");
					System.out.println(clientIp);
				}
			}
			if(remark!=null) {
				if(remark!="") {
					criteria.andRemarkLike("%"+remark+"%");
					System.out.println(remark);
				}
			}
			mapper.selectByExample(example);
			return page.toPageInfo();
	 }
	 //批量删除
	 public int removeList(List<SysClient> sysdictData) {
		for (SysClient dictData : sysdictData) {
			mapper.deleteByPrimaryKey(dictData.getClientId());
		}
		return 0;
	 }
	 //条件查找全部
	 public List<SysClient> wherefind(Integer currentPage,Integer pageSize
		 		,String clientName, String clientIp
		 		,String remark){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
		SysClientExample example=new SysClientExample();
		com.accp.domain.SysClientExample.Criteria criteria=example.createCriteria();
		if(clientName!=null) {
			if(clientName!="") {
				criteria.andClientNameLike("%"+clientName+"%");
				System.out.println(clientName);
			}
		}
		if(clientIp!=null) {
			if(clientIp!="") {
				criteria.andClientIpLike("%"+clientIp+"%");
				System.out.println(clientIp);
			}
		}
		if(remark!=null) {
			if(remark!="") {
				criteria.andRemarkLike(remark);
				System.out.println(remark);
			}
		}
		
		return mapper.selectByExample(example);
		}
	 //查询

	 public List<com.accp.domain.SysClient> finAll(){
		 return mapper.selectByExample(null);
	 }
	 //新增
	 public Integer create(com.accp.domain.SysClient client) {
		 return mapper.insertSelective(client);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysClient client) {
		 return mapper.updateByPrimaryKey(client);
	 } 
	 //删除
	 public Integer delete(Integer clientid) {
		 return mapper.deleteByPrimaryKey(clientid);
	 }
	 //导出
}
