package com.accp.dao;

import com.accp.domain.ProjectCaseModule;
import com.accp.domain.ProjectCaseModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCaseModuleMapper {
    int countByExample(ProjectCaseModuleExample example);

    int deleteByExample(ProjectCaseModuleExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(ProjectCaseModule record);

    int insertSelective(ProjectCaseModule record);

    List<ProjectCaseModule> selectByExample(ProjectCaseModuleExample example);

    ProjectCaseModule selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") ProjectCaseModule record, @Param("example") ProjectCaseModuleExample example);

    int updateByExample(@Param("record") ProjectCaseModule record, @Param("example") ProjectCaseModuleExample example);

    int updateByPrimaryKeySelective(ProjectCaseModule record);

    int updateByPrimaryKey(ProjectCaseModule record);
}