package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysConfig;
import com.accp.service.SysConfigService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysConfig")
public class SysConfigController {

	@Autowired
	SysConfigService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysConfig> find(Integer page,Integer limit,SysConfig sysConfig){
		return service.find(page, limit,sysConfig);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(SysConfig sysConfig) {
		return service.update(sysConfig);
	}

}
