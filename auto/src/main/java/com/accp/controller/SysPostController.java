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

import com.accp.domain.SysPost;
import com.accp.domain.SysRole;
import com.accp.service.SysClientService;
import com.accp.service.SysPostService;
import com.github.pagehelper.PageInfo;

/**
 * 岗位
 * @author CrayonShinchan
 *
 */
@RestController
@RequestMapping("/SysPostController")
public class SysPostController {
	@Autowired 
	 SysPostService service;
	 //分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysPost> findByPage(Integer page,Integer limit
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, login_name, phonenumber, createtimenum1, createtimenum2);
	 }
	 //查找全部
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysPost> finAll(){
		 return service.finAll();
	 }
	 
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysPost user) {
		 return service.create(user);
	 }
	 //修改
	 @PutMapping("/update")
	 public Integer update(com.accp.domain.SysPost user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 System.out.println(id);
		 return service.delete(id);
	 }
}
