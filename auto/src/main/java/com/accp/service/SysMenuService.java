package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.SysMenuExample.Criteria;
import com.accp.dao.SysMenuMapper;
import com.accp.domain.SysMenu;
import com.accp.domain.SysMenuExample;

@Service
@Transactional
public class SysMenuService {

	@Autowired
	SysMenuMapper mapper;
	
	public List<SysMenu> findById(Integer parentId,String menuName,Integer visible) {
		System.out.println(menuName+"q1");
		System.out.println(visible+"w2");
		SysMenuExample example =new SysMenuExample();
		Criteria criteria=example.createCriteria();
		if(menuName!=null || visible !=null) {
			if(menuName !=null && menuName !="" ) {
				criteria.andMenuNameLike(menuName);
			}if(visible !=null && visible !=2) {
				criteria.andVisibleEqualTo(visible.toString());
			}
			return mapper.selectByExample(example);
		}
		return mapper.find(parentId);
	}
	
	public List<SysMenu> find(SysMenu sm) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andMenuNameEqualTo(sm.getMenuName());
		return mapper.selectByExample(example);
	}
	
	public int create(SysMenu sysmenu) {
		return mapper.insert(sysmenu);
	}
	
	public List<SysMenu> findByType(){
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andMenuTypeNotEqualTo("F");
		List<SysMenu> list =mapper.selectByExample(example);
		return list;
	}
	
	public int remove(Integer menuId) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andParentIdEqualTo(menuId);
		if(mapper.selectByExample(example).size()>0) {
			return -1;
		}else {
			return mapper.deleteByPrimaryKey(menuId);
		}
	}
}
