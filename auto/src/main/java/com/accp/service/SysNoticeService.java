package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SysNoticeMapper;
import com.accp.domain.SysNotice;
import com.accp.domain.SysNoticeExample;
import com.accp.domain.SysNoticeExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SysNoticeService {

	@Autowired
	SysNoticeMapper mapper;
	
	public PageInfo<SysNotice> find(Integer pageNum,Integer pageSize,SysNotice sysNotice){
		SysNoticeExample example=new SysNoticeExample();
		Criteria criteria=example.createCriteria();
		if(sysNotice.getNoticeTitle()!=null) {
			if(sysNotice.getNoticeTitle()!="") {
				criteria.andNoticeTitleLike("%"+sysNotice.getNoticeTitle()+"%");
			}
		}
		
		if(sysNotice.getCreateBy()!=null) {
			if(sysNotice.getCreateBy()!="") {
				criteria.andCreateByLike("%"+sysNotice.getCreateBy()+"%");
			}
		}
		
		if(sysNotice.getNoticeType()!=null) {
			if(!sysNotice.getNoticeType().equals("全部")) {
				criteria.andNoticeTypeEqualTo(sysNotice.getNoticeType());
			}
		}
		List<SysNotice> list=mapper.selectByExample(example);
		Page<SysNotice> page=PageHelper.startPage(pageNum, pageSize);
		mapper.selectByExample(example);
		page.setPages(list.size());
		return page.toPageInfo();
	}
	
	public int create(SysNotice sysNotice) {
		sysNotice.setCreateBy("admin");
		sysNotice.setCreateTime(new Date());
		return mapper.insert(sysNotice);
	}
	
	public int update(SysNotice sysNotice) {
		sysNotice.setUpdateTime(new Date());
		return mapper.updateByPrimaryKey(sysNotice);
	}
	
	public int remove(Integer noticeId) {
		return mapper.deleteByPrimaryKey(noticeId);
	}
	
	public int removeList(List<SysNotice> sysNotice) {
		for (SysNotice sysNotice2 : sysNotice) {
			mapper.deleteByPrimaryKey(sysNotice2.getNoticeId());
		}
		return 0;
	}
}
