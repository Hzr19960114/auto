package com.accp.dao;

import com.accp.domain.SysJob;
import com.accp.domain.SysJobExample;
import com.accp.domain.SysJobKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJobMapper {
    int countByExample(SysJobExample example);

    int deleteByExample(SysJobExample example);

    int deleteByPrimaryKey(SysJobKey key);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    List<SysJob> selectByExample(SysJobExample example);

    SysJob selectByPrimaryKey(SysJobKey key);

    int updateByExampleSelective(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByExample(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}