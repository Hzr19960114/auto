package com.accp.dao;

import com.accp.domain.SysClientProjectExample;
import com.accp.domain.SysClientProjectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysClientProjectMapper {
    int countByExample(SysClientProjectExample example);

    int deleteByExample(SysClientProjectExample example);

    int deleteByPrimaryKey(SysClientProjectKey key);

    int insert(SysClientProjectKey record);

    int insertSelective(SysClientProjectKey record);

    List<SysClientProjectKey> selectByExample(SysClientProjectExample example);

    int updateByExampleSelective(@Param("record") SysClientProjectKey record, @Param("example") SysClientProjectExample example);

    int updateByExample(@Param("record") SysClientProjectKey record, @Param("example") SysClientProjectExample example);
}