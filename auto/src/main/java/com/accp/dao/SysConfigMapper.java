package com.accp.dao;

import com.accp.domain.SysConfig;
import com.accp.domain.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    int countByExample(SysConfigExample example);

    int deleteByExample(SysConfigExample example);

    int deleteByPrimaryKey(Integer configId);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigExample example);

    SysConfig selectByPrimaryKey(Integer configId);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}