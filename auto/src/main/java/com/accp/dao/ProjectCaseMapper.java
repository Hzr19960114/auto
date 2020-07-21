package com.accp.dao;

import com.accp.domain.ProjectCase;
import com.accp.domain.ProjectCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCaseMapper {
    int countByExample(ProjectCaseExample example);

    int deleteByExample(ProjectCaseExample example);

    int deleteByPrimaryKey(Integer caseId);

    int insert(ProjectCase record);

    int insertSelective(ProjectCase record);

    List<ProjectCase> selectByExample(ProjectCaseExample example);

    ProjectCase selectByPrimaryKey(Integer caseId);

    int updateByExampleSelective(@Param("record") ProjectCase record, @Param("example") ProjectCaseExample example);

    int updateByExample(@Param("record") ProjectCase record, @Param("example") ProjectCaseExample example);

    int updateByPrimaryKeySelective(ProjectCase record);

    int updateByPrimaryKey(ProjectCase record);
}