package com.accp.dao;

import com.accp.domain.SysRoleDeptExample;
import com.accp.domain.SysRoleDeptKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDeptMapper {
    int countByExample(SysRoleDeptExample example);

    int deleteByExample(SysRoleDeptExample example);

    int deleteByPrimaryKey(SysRoleDeptKey key);

    int insert(SysRoleDeptKey record);

    int insertSelective(SysRoleDeptKey record);

    List<SysRoleDeptKey> selectByExample(SysRoleDeptExample example);

    int updateByExampleSelective(@Param("record") SysRoleDeptKey record, @Param("example") SysRoleDeptExample example);

    int updateByExample(@Param("record") SysRoleDeptKey record, @Param("example") SysRoleDeptExample example);
}