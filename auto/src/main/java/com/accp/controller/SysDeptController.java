package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysDept;
import com.accp.service.SysDeptService;

@Controller
@RequestMapping("/dept")
public class SysDeptController {

	@Autowired
	SysDeptService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public List<SysDept> find(){
		return service.find(0);
	}
}
