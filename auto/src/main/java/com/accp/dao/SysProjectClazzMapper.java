package com.accp.dao;

import com.accp.domain.SysProjectClazz;
import com.accp.domain.SysProjectClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProjectClazzMapper {
    int countByExample(SysProjectClazzExample example);

    int deleteByExample(SysProjectClazzExample example);

    int insert(SysProjectClazz record);

    int insertSelective(SysProjectClazz record);

    List<SysProjectClazz> selectByExample(SysProjectClazzExample example);

    int updateByExampleSelective(@Param("record") SysProjectClazz record, @Param("example") SysProjectClazzExample example);

    int updateByExample(@Param("record") SysProjectClazz record, @Param("example") SysProjectClazzExample example);
}