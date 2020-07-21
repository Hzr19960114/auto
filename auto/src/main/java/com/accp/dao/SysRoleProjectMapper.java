package com.accp.dao;

import com.accp.domain.SysRoleProjectExample;
import com.accp.domain.SysRoleProjectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleProjectMapper {
    int countByExample(SysRoleProjectExample example);

    int deleteByExample(SysRoleProjectExample example);

    int deleteByPrimaryKey(SysRoleProjectKey key);

    int insert(SysRoleProjectKey record);

    int insertSelective(SysRoleProjectKey record);

    List<SysRoleProjectKey> selectByExample(SysRoleProjectExample example);

    int updateByExampleSelective(@Param("record") SysRoleProjectKey record, @Param("example") SysRoleProjectExample example);

    int updateByExample(@Param("record") SysRoleProjectKey record, @Param("example") SysRoleProjectExample example);
}