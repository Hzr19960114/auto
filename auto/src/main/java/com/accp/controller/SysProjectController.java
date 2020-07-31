package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.SysProject;
import com.accp.domain.SysRole;
import com.accp.service.SysProjectService;
import com.accp.service.SysRoleService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/SysProjectController")
public class SysProjectController {
	@Autowired 
	 SysProjectService service;
	 //分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysProject> findByPage(Integer page,Integer limit
			 ,String projectName, String projectSign){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, projectName, projectSign);
	 }
	 //查找全部
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysProject> finAll(){
		 return service.finAll();
	 }
	 //批量删除
	 @RequestMapping("/removeList")
	 @ResponseBody
	 public int removeList(@RequestBody List<SysProject> sysDictData) {
		 return service.removeList(sysDictData);
	 }
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysProject user) {
		 return service.create(user);
	 }
	 //修改
	 @PutMapping("/update")
	 public Integer update(com.accp.domain.SysProject user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 System.out.println(id);
		 return service.delete(id);
	 }
}
