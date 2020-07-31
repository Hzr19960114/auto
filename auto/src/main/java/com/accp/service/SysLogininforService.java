package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysLogininforMapper;
import com.accp.dao.SysOperLogMapper;
import com.accp.domain.SysLogininfor;
import com.accp.domain.SysNotice;
import com.accp.domain.SysUserExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 登录日志
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class SysLogininforService {
	@Autowired
	SysLogininforMapper mapper;
	 //分页数据
	 public PageInfo<SysLogininfor> findByPage(Integer currentPage,Integer pageSize
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			Page<SysLogininfor> page=PageHelper.startPage(currentPage, pageSize);
			SysUserExample ex=new SysUserExample();
			mapper.selectByExample(null);
			return page.toPageInfo();
	 }
	 //查找全部
	 public List<com.accp.domain.SysLogininfor> finAll(){
		 return mapper.selectByExample(null);
	 }
	 //查询
	 public List<com.accp.domain.SysLogininfor> findWhere(){//客户端名称  客户端IP  备注
		 
		 return null;
	 }
	 //新增
	 public Integer create(com.accp.domain.SysLogininfor sof) {
		 return mapper.insertSelective(sof);
	 }
	 //修改
	 public Integer update(com.accp.domain.SysLogininfor sof) {
		 return mapper.updateByPrimaryKey(sof);
	 } 
	 //删除
	 public Integer delete(Integer Id) {
		 return mapper.deleteByPrimaryKey(Id);
	 }
	 //导出
}
