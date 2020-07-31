package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysDept;
import com.accp.service.SysDeptService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门
 * @author CrayonShinchan
 *
 */
@RestController
@RequestMapping("/SysDeptController")
public class SysDeptController {
	@Autowired 
	 SysDeptService service;
	 /*//分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysDept> findByPage(Integer page,Integer limit
			 							 ,String login_name, String phonenumber
			 							 ,String createtimenum1,String createtimenum2){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, login_name, phonenumber, createtimenum1, createtimenum2);
	 }*/
	 //查找
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysDept> treeparent_id(String deptName,String status){
		 return service.treeparent_id(0,deptName,status);
	 }
	 @GetMapping("/find")
	 @ResponseBody
	 public List<com.accp.domain.SysDept> find(){
		 return service.find();
	 }
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysDept user) {
		 return service.create(user);
	 }
	 //修改
	 @PostMapping("/update")
	 public Integer update(com.accp.domain.SysDept user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 return service.delete(id);
	 }

	 //部门选项卡
	 @GetMapping("/findselect")
	 @ResponseBody
	 public List<SysDept> findselect(){
		 return service.findselect();
	 }
}
