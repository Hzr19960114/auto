package com.accp.dao;

import com.accp.domain.ProjectCaseSteps;
import com.accp.domain.ProjectCaseStepsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCaseStepsMapper {
    int countByExample(ProjectCaseStepsExample example);

    int deleteByExample(ProjectCaseStepsExample example);

    int deleteByPrimaryKey(Integer stepId);

    int insert(ProjectCaseSteps record);

    int insertSelective(ProjectCaseSteps record);

    List<ProjectCaseSteps> selectByExample(ProjectCaseStepsExample example);

    ProjectCaseSteps selectByPrimaryKey(Integer stepId);

    int updateByExampleSelective(@Param("record") ProjectCaseSteps record, @Param("example") ProjectCaseStepsExample example);

    int updateByExample(@Param("record") ProjectCaseSteps record, @Param("example") ProjectCaseStepsExample example);

    int updateByPrimaryKeySelective(ProjectCaseSteps record);

    int updateByPrimaryKey(ProjectCaseSteps record);
}