package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.SysConfig;
import com.accp.domain.SysRole;
import com.accp.service.SysConfigService;
import com.accp.service.SysProjectService;
import com.github.pagehelper.PageInfo;

/**
 * 参数管理
 * @author CrayonShinchan
 *
 */
@RestController
@RequestMapping("/SysConfigController")
public class SysConfigController {
	 @Autowired
	 SysConfigService service;
	 //分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysConfig> findByPage(Integer page,Integer limit
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, login_name, phonenumber, createtimenum1, createtimenum2);
	 }
	 //查找全部
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysConfig> finAll(){
		 return service.finAll();
	 }
	 
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysConfig user) {
		 return service.create(user);
	 }
	 //修改
	 @PutMapping("/update")
	 public Integer update(com.accp.domain.SysConfig user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 System.out.println(id);
		 return service.delete(id);
	 }
}
