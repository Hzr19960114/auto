package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysDeptMapper;
import com.accp.domain.SysDept;

@Service
@Transactional
public class SysDeptService {

	@Autowired
	SysDeptMapper mapper;
	
	public List<SysDept> find(Integer parentId){
		return mapper.find(parentId);
	}
}
