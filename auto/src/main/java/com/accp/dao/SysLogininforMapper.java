package com.accp.dao;

import com.accp.domain.SysLogininfor;
import com.accp.domain.SysLogininforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogininforMapper {
    int countByExample(SysLogininforExample example);

    int deleteByExample(SysLogininforExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(SysLogininfor record);

    int insertSelective(SysLogininfor record);

    List<SysLogininfor> selectByExample(SysLogininforExample example);

    SysLogininfor selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") SysLogininfor record, @Param("example") SysLogininforExample example);

    int updateByExample(@Param("record") SysLogininfor record, @Param("example") SysLogininforExample example);

    int updateByPrimaryKeySelective(SysLogininfor record);

    int updateByPrimaryKey(SysLogininfor record);
}