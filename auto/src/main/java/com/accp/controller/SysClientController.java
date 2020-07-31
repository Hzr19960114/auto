package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.SysClient;
import com.accp.domain.SysRole;
import com.accp.domain.SysUser;
import com.accp.service.SysClientService;
import com.accp.service.SysProjectService;
import com.github.pagehelper.PageInfo;
/**
 * 客户端
 * @author CrayonShinchan
 *
 */
@RestController
@RequestMapping("/SysClientController")
public class SysClientController {
	@Autowired 
	 SysClientService service;
	 //分页数据
	 @GetMapping("/findByPage")
	 @ResponseBody
	 public PageInfo<SysClient> findByPage(Integer page,Integer limit
			 							 ,String clientName, String clientIp
			 							 ,String remark){//登录名称、手机号码、用户状态、创建时间 【开始-结束】
			return service.findByPage(page, limit, clientName, clientIp, remark);
	 }
	 //查找全部
	 @GetMapping("/findAll")
	 @ResponseBody
	 public List<com.accp.domain.SysClient> finAll(){
		 return service.finAll();
	 }
	 //批量删除
	 @RequestMapping("/removeList")
	 @ResponseBody
	 public int removeLizst(@RequestBody List<SysClient> SysClient) {
		 return service.removeList(SysClient);
	 }
	 //新增
	 @PostMapping("/create")
	 public Integer create(com.accp.domain.SysClient user) {
		 return service.create(user);
	 }
	 //修改
	 @PostMapping("/update")
	 public Integer update(com.accp.domain.SysClient user) {
		 return service.update(user);
	 }
	 //删除
	 @DeleteMapping("/delete/{id}")
	 public Integer delete(@PathVariable("id")Integer id) {
		 System.out.println(id);
		 return service.delete(id);
	 }
}
