package com.accp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 登录
 * @author CrayonShinchan
 *
 */
import org.springframework.web.bind.annotation.SessionAttributes;

import com.accp.domain.SysUser;
import com.accp.exception.ResponeException;
import com.accp.service.LoginFormService;
@RestController
@RequestMapping("/LoginForm")
public class LoginForm {
	@Autowired
	LoginFormService service;
	@PostMapping("/loginFind")
	public ResponeException<com.accp.domain.SysUser> loginform(String loginname,String password,HttpSession session){
		SysUser user=new SysUser();
		user.setLoginName(loginname);
		user.setPassword(password);
		SysUser sta=service.findByUserName(user.getLoginName());
		if(sta==null) {
			return new ResponeException<SysUser>("10001", "用户名不存在",null);
		}
		if(!sta.getPassword().equals(user.getPassword())) {
			return new ResponeException<SysUser>("10002", "密码不正确", null);
		}
		session.setAttribute("user", sta);
		return new ResponeException<SysUser>("10000", "登录成功", sta);
	}
}
