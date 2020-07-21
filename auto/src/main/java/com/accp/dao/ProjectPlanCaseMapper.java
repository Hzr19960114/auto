package com.accp.dao;

import com.accp.domain.ProjectPlanCase;
import com.accp.domain.ProjectPlanCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectPlanCaseMapper {
    int countByExample(ProjectPlanCaseExample example);

    int deleteByExample(ProjectPlanCaseExample example);

    int deleteByPrimaryKey(Integer planCaseId);

    int insert(ProjectPlanCase record);

    int insertSelective(ProjectPlanCase record);

    List<ProjectPlanCase> selectByExample(ProjectPlanCaseExample example);

    ProjectPlanCase selectByPrimaryKey(Integer planCaseId);

    int updateByExampleSelective(@Param("record") ProjectPlanCase record, @Param("example") ProjectPlanCaseExample example);

    int updateByExample(@Param("record") ProjectPlanCase record, @Param("example") ProjectPlanCaseExample example);

    int updateByPrimaryKeySelective(ProjectPlanCase record);

    int updateByPrimaryKey(ProjectPlanCase record);
}