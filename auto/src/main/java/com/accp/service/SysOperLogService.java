package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysNoticeMapper;
import com.accp.dao.SysOperLogMapper;
import com.accp.domain.SysOperLog;
import com.accp.domain.SysUserExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 日志管理
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysOperLogService {
	@Autowired
	SysOperLogMapper mapper;
	 //分页数据
	 public PageInfo<SysOperLog> findByPage(Integer currentPage,Integer pageSize
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			Page<SysOperLog> page=PageHelper.startPage(currentPage, pageSize);
			SysUserExample ex=new SysUserExample();
			mapper.selectByExample(null);
			return page.toPageInfo();
	 }
	 //查找全部
	 public List<com.accp.domain.SysOperLog> finAll(){
		 return mapper.selectByExample(null);
	 }
	 //查询
	 public List<com.accp.domain.SysOperLog> findWhere(){//客户端名称  客户端IP  备注
		 
		 return null;
	 }
	 //新增
	 public Integer create(com.accp.domain.SysOperLog sol) {
		 return mapper.insertSelective(sol);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysOperLog sol) {
		 return mapper.updateByPrimaryKey(sol);
	 } 
	 //删除
	 public Integer delete(Integer Id) {
		 return mapper.deleteByPrimaryKey(Id);
	 }
	 //导出
}
