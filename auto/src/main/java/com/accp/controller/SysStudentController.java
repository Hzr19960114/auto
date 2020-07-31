package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysClazz;
import com.accp.domain.SysStudent;
import com.accp.service.SysStudentService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysStudent")
public class SysStudentController {

	@Autowired
	SysStudentService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysStudent> find(Integer page,Integer limit,SysStudent sysStudent){
		return service.find(page, limit,sysStudent);
	}
	
	@RequestMapping("/findClazz")
	@ResponseBody
	public List<SysClazz> findClazz(){
		return service.findClazz();
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public int create(SysStudent student) {
		return service.create(student);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(SysStudent student) {
		return service.update(student);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(String studentNo) {
		return service.remove(studentNo);
	}

}
