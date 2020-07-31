package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysClazzMapper;
import com.accp.dao.SysStudentMapper;
import com.accp.domain.SysClazz;
import com.accp.domain.SysClazzExample;
import com.accp.domain.SysStudent;
import com.accp.domain.SysStudentExample;
import com.accp.domain.SysStudentExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysStudentService {

	@Autowired
	SysStudentMapper mapper;
	
	@Autowired
	SysClazzMapper clazzMapper;
	
	public PageInfo<SysStudent> find(Integer pageNum,Integer pageSize,SysStudent sysStudent){
		SysStudentExample example=new SysStudentExample();
		Criteria criteria=example.createCriteria();
		if(sysStudent.getStudentNo()!=null) {
			if(sysStudent.getStudentNo()!="") {
				criteria.andStudentNoLike("%"+sysStudent.getStudentNo()+"%");
			}
		}
		if(sysStudent.getStudentName()!=null) {
			if(sysStudent.getStudentName()!="") {
				criteria.andStudentNameLike("%"+sysStudent.getStudentName()+"%");
			}
		}
		if(sysStudent.getClazzId()!=null) {
				criteria.andClazzIdEqualTo(sysStudent.getClazzId());
		}
		List<SysStudent> list=mapper.selectByExample(example);
		Page<SysStudent> page=PageHelper.startPage(pageNum, pageSize);
		mapper.selectByExample(example);
		page.setPages(list.size());
		return page.toPageInfo();
	}
	
	public List<SysClazz> findClazz(){
		SysClazzExample example=new SysClazzExample();
		example.createCriteria().andParentIdEqualTo(0);
		List<SysClazz> list=clazzMapper.selectByExample(example);
		List<Integer> listId=new ArrayList<Integer>();
		listId.add(0);
		for (SysClazz sysClazz : list) {
			listId.add(sysClazz.getClazzId());
		}
		return clazzMapper.clazzFind(listId);
	}
	

	public int create(SysStudent student) {
		student.setDelFlag("0");
		return mapper.insert(student);
	}
	
	public int update(SysStudent student) {
		mapper.deleteByPrimaryKey(student.getDelFlag());
		student.setDelFlag("0");
		mapper.insert(student);
		return 0;
	}
	
	public int remove(String studentNo) {
		return mapper.deleteByPrimaryKey(studentNo);
	}
	
}
