package com.accp.dao;

import com.accp.domain.SysUserPostExample;
import com.accp.domain.SysUserPostKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserPostMapper {
    int countByExample(SysUserPostExample example);

    int deleteByExample(SysUserPostExample example);

    int deleteByPrimaryKey(SysUserPostKey key);

    int insert(SysUserPostKey record);

    int insertSelective(SysUserPostKey record);

    List<SysUserPostKey> selectByExample(SysUserPostExample example);

    int updateByExampleSelective(@Param("record") SysUserPostKey record, @Param("example") SysUserPostExample example);

    int updateByExample(@Param("record") SysUserPostKey record, @Param("example") SysUserPostExample example);
}