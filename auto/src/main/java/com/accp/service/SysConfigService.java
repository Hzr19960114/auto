package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysConfigMapper;
import com.accp.dao.SysPostMapper;
import com.accp.domain.SysConfig;
import com.accp.domain.SysLogininfor;
import com.accp.domain.SysUserExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 参数管理
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysConfigService {
	 @Autowired
	 SysConfigMapper mapper;
	 //分页数据
	 public PageInfo<SysConfig> findByPage(Integer currentPage,Integer pageSize
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			Page<SysConfig> page=PageHelper.startPage(currentPage, pageSize);
			SysUserExample ex=new SysUserExample();
			mapper.selectByExample(null);
			return page.toPageInfo();
	 }
	 //查找全部
	 public List<com.accp.domain.SysConfig> finAll(){
		 return mapper.selectByExample(null);
	 }
	 //查询
	 public List<com.accp.domain.SysConfig> findWhere(){//客户端名称  客户端IP  备注
		 
		 return null;
	 }
	 //新增
	 public Integer create(com.accp.domain.SysConfig con) {
		 return mapper.insertSelective(con);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysConfig con) {
		 return mapper.updateByPrimaryKey(con);
	 } 
	 //删除
	 public Integer delete(Integer configId) {
		 return mapper.deleteByPrimaryKey(configId);
	 }
	 //导出
}
