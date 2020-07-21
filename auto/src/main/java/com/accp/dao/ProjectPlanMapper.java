package com.accp.dao;

import com.accp.domain.ProjectPlan;
import com.accp.domain.ProjectPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectPlanMapper {
    int countByExample(ProjectPlanExample example);

    int deleteByExample(ProjectPlanExample example);

    int deleteByPrimaryKey(Integer planId);

    int insert(ProjectPlan record);

    int insertSelective(ProjectPlan record);

    List<ProjectPlan> selectByExample(ProjectPlanExample example);

    ProjectPlan selectByPrimaryKey(Integer planId);

    int updateByExampleSelective(@Param("record") ProjectPlan record, @Param("example") ProjectPlanExample example);

    int updateByExample(@Param("record") ProjectPlan record, @Param("example") ProjectPlanExample example);

    int updateByPrimaryKeySelective(ProjectPlan record);

    int updateByPrimaryKey(ProjectPlan record);
}