package com.accp.dao;

import com.accp.domain.SysStudent;
import com.accp.domain.SysStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStudentMapper {
    int countByExample(SysStudentExample example);

    int deleteByExample(SysStudentExample example);

    int deleteByPrimaryKey(String studentNo);

    int insert(SysStudent record);

    int insertSelective(SysStudent record);

    List<SysStudent> selectByExample(SysStudentExample example);

    SysStudent selectByPrimaryKey(String studentNo);

    int updateByExampleSelective(@Param("record") SysStudent record, @Param("example") SysStudentExample example);

    int updateByExample(@Param("record") SysStudent record, @Param("example") SysStudentExample example);

    int updateByPrimaryKeySelective(SysStudent record);

    int updateByPrimaryKey(SysStudent record);
}