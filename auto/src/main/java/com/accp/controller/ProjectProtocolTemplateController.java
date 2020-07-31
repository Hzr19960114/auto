package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.ProjectProtocolTemplate;
import com.accp.service.ProjectProtocolTemplateService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/ppt")
public class ProjectProtocolTemplateController {

	@Autowired
	ProjectProtocolTemplateService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<ProjectProtocolTemplate> find(Integer page,Integer limit,ProjectProtocolTemplate ppt){
		return service.find(page,limit,ppt);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(ProjectProtocolTemplate ppt) {
		int count = service.create(ppt);
		if(count>0) {
			return "新增成功!";
		}else {
			return "新增失败!";
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(ProjectProtocolTemplate ppt) {
		int count = service.update(ppt);
		if(count>0) {
			return "修改成功!";
		}else {
			return "修改失败!";
		}
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer templateId) {
		int count = service.remove(templateId);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public String removeList(@RequestBody List<ProjectProtocolTemplate> ppt) {
		int count = service.removeList(ppt);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
}
