package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysClient;
import com.accp.service.SysClientService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/client")
public class SysClientController {

	@Autowired
	SysClientService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysClient> find(Integer page,Integer limit,SysClient sc){
		return service.find(page,limit,sc);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(SysClient sc) {
		int count = service.create(sc);
		if(count>0) {
			return "新增成功!";
		}else {
			return "新增失败!";
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(SysClient sc) {
		int count = service.update(sc);
		if(count>0) {
			return "修改成功!";
		}else {
			return "修改失败!";
		}
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer clientId) {
		int count = service.remove(clientId);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public String removeList(@RequestBody List<SysClient> sc) {
		int count = service.removeList(sc);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
}
