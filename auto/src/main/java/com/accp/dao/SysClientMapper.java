package com.accp.dao;

import com.accp.domain.SysClient;
import com.accp.domain.SysClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysClientMapper {
    int countByExample(SysClientExample example);

    int deleteByExample(SysClientExample example);

    int deleteByPrimaryKey(Integer clientId);

    int insert(SysClient record);

    int insertSelective(SysClient record);

    List<SysClient> selectByExample(SysClientExample example);

    SysClient selectByPrimaryKey(Integer clientId);

    int updateByExampleSelective(@Param("record") SysClient record, @Param("example") SysClientExample example);

    int updateByExample(@Param("record") SysClient record, @Param("example") SysClientExample example);

    int updateByPrimaryKeySelective(SysClient record);

    int updateByPrimaryKey(SysClient record);
}