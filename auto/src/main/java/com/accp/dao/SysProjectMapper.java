package com.accp.dao;

import com.accp.domain.SysProject;
import com.accp.domain.SysProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProjectMapper {
    int countByExample(SysProjectExample example);

    int deleteByExample(SysProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(SysProject record);

    int insertSelective(SysProject record);

    List<SysProject> selectByExample(SysProjectExample example);

    SysProject selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") SysProject record, @Param("example") SysProjectExample example);

    int updateByExample(@Param("record") SysProject record, @Param("example") SysProjectExample example);

    int updateByPrimaryKeySelective(SysProject record);

    int updateByPrimaryKey(SysProject record);
}