package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysUserOnline;
import com.accp.service.SysUserOnlineService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/suo")
public class SysUserOnlineController {

	@Autowired
	SysUserOnlineService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysUserOnline> find(Integer page,Integer limit,SysUserOnline suo){
		return service.find(page,limit,suo);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(String sessionid) {
		int count = service.remove(sessionid);
		if(count>0) {
			return "强退成功!";
		}else {
			return "强退失败!";
		}
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public String removeList(@RequestBody List<SysUserOnline> suo) {
		int count = service.removeList(suo);
		if(count>0) {
			return "强退成功!";
		}else {
			return "强退失败!";
		}
	}
}
