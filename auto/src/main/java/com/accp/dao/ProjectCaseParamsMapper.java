package com.accp.dao;

import com.accp.domain.ProjectCaseParams;
import com.accp.domain.ProjectCaseParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCaseParamsMapper {
    int countByExample(ProjectCaseParamsExample example);

    int deleteByExample(ProjectCaseParamsExample example);

    int deleteByPrimaryKey(Integer paramsId);

    int insert(ProjectCaseParams record);

    int insertSelective(ProjectCaseParams record);

    List<ProjectCaseParams> selectByExample(ProjectCaseParamsExample example);

    ProjectCaseParams selectByPrimaryKey(Integer paramsId);

    int updateByExampleSelective(@Param("record") ProjectCaseParams record, @Param("example") ProjectCaseParamsExample example);

    int updateByExample(@Param("record") ProjectCaseParams record, @Param("example") ProjectCaseParamsExample example);

    int updateByPrimaryKeySelective(ProjectCaseParams record);

    int updateByPrimaryKey(ProjectCaseParams record);
}