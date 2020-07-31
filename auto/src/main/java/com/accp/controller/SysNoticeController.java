package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.SysNotice;
import com.accp.service.SysNoticeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/sysNotice")
public class SysNoticeController {

	@Autowired
	SysNoticeService service;
	
	@RequestMapping("/find")
	@ResponseBody
	public PageInfo<SysNotice> find(Integer page,Integer limit,SysNotice notice){
		return service.find(page, limit,notice);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public int create(SysNotice sysNotice) {
		return service.create(sysNotice);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(SysNotice sysNotice) {
		return service.update(sysNotice);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public int remove(Integer noticeId) {
		return service.remove(noticeId);
	}
	
	@RequestMapping("/removeList")
	@ResponseBody
	public int removeList(@RequestBody List<SysNotice> list) {
		return service.removeList(list);
	}
}
