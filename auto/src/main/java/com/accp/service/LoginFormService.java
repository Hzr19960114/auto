package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysUserMapper;
import com.accp.domain.SysUser;
import com.accp.domain.SysUserExample;
/**
 * 登录
 * @author CrayonShinchan
 *
 */
@Service
@Transactional
public class LoginFormService {
	@Autowired
	SysUserMapper mapper;
	
	public SysUser findByUserName(String loginName) {
		SysUserExample example=new SysUserExample();
		example.createCriteria().andLoginNameEqualTo(loginName);
		List<SysUser> list=mapper.selectByExample(example);
		return list!=null&&list.size()>0?list.get(0):null;
	}
}
