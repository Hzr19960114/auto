package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.service.SysClazzService;
import com.accp.service.SysDeptService;

@RestController
@RequestMapping("/SysClazzController")
public class SysClazzController {
	 @Autowired 
	 SysClazzService service;	
	 //查找
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysClazz> treeparent_id(String clazzName,String status){
		 return service.treeparent_id(0,clazzName,status);
	 }
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysClazz user) {
		 return service.create(user);
	 }
	 //修改
	 @PostMapping("/update")
	 public Integer update(com.accp.domain.SysClazz user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 return service.delete(id);
	 }
	 @GetMapping("/find")
	 @ResponseBody
	 public List<com.accp.domain.SysClazz> find(){
		 return service.find();
	 }
}
