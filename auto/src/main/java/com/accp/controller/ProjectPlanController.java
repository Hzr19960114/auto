package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.ProjectPlan;
import com.accp.service.ProjectPlanService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/ppc")
public class ProjectPlanController {

	@Autowired
	ProjectPlanService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<ProjectPlan> find(Integer page,Integer limit,ProjectPlan pp){
		return service.find(page,limit,pp);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(ProjectPlan pp) {
		int count = service.create(pp);
		if(count>0) {
			return "新增成功!";
		}else {
			return "新增失败!";
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(ProjectPlan pp) {
		int count = service.update(pp);
		if(count>0) {
			return "修改成功!";
		}else {
			return "修改失败!";
		}
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer planId) {
		int count = service.remove(planId);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public String removeList(@RequestBody List<ProjectPlan> pp) {
		int count = service.removeList(pp);
		if(count>0) {
			return "删除成功!";
		}else {
			return "删除失败!";
		}
	}
}
