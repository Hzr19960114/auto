package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.ProjectCaseParams;
import com.accp.service.ProjectCaseParamsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/pcp")
public class ProjectCaseParamsController {

	@Autowired
	ProjectCaseParamsService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<ProjectCaseParams> find(Integer page,Integer limit,ProjectCaseParams pcp){
		return service.find(page,limit,pcp);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(ProjectCaseParams sps) {
		int count = service.create(sps);
		if(count>0) {
			return "新增成功!";
		}else {
			return "新增失败!";
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(ProjectCaseParams sps) {
		int count = service.update(sps);
		if(count>0) {
			return "修改成功!";
		}else {
			return "修改失败!";
		}
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer paramsId) {
		int count = service.remove(paramsId);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public String removeList(@RequestBody List<ProjectCaseParams> pcp) {
		int count = service.removeList(pcp);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
}
