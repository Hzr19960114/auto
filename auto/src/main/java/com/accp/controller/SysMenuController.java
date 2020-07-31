package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysMenu;
import com.accp.service.SysMenuService;

@Controller
@RequestMapping("/menu")
public class SysMenuController {

	@Autowired
	SysMenuService service;
	
	@RequestMapping("/findById")
	@ResponseBody
	public List<SysMenu> findById(String menuName,Integer visible){
		return service.findById(0,menuName,visible);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(SysMenu sysmenu) {
		int count = service.create(sysmenu);
		if(count>0) {
			return "新增成功!";
		}
		return "新增失败！";
	}
	
	@RequestMapping("/findByType")
	@ResponseBody
	public List<SysMenu> findByType(){
		return service.findByType();
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer menuId) {
		int count = service.remove(menuId);
		if(count>0) {
			return "删除成功！";
		}else {
			return "存在子级不能删除!";
		}
	}
}
