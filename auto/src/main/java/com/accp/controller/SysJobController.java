package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysJob;
import com.accp.service.SysJobService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysJob")
public class SysJobController {

	@Autowired
	SysJobService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysJob> find(Integer page,Integer limit,String jobName,String methodName,String status){
		return service.find(page, limit,jobName,methodName,status);
	}
}
