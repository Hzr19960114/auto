package com.accp.dao;

import com.accp.domain.ProjectModuleStudent;
import com.accp.domain.ProjectModuleStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectModuleStudentMapper {
    int countByExample(ProjectModuleStudentExample example);

    int deleteByExample(ProjectModuleStudentExample example);

    int insert(ProjectModuleStudent record);

    int insertSelective(ProjectModuleStudent record);

    List<ProjectModuleStudent> selectByExample(ProjectModuleStudentExample example);

    int updateByExampleSelective(@Param("record") ProjectModuleStudent record, @Param("example") ProjectModuleStudentExample example);

    int updateByExample(@Param("record") ProjectModuleStudent record, @Param("example") ProjectModuleStudentExample example);
}