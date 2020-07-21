package com.accp.dao;

import com.accp.domain.ProjectCaseDebug;
import com.accp.domain.ProjectCaseDebugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCaseDebugMapper {
    int countByExample(ProjectCaseDebugExample example);

    int deleteByExample(ProjectCaseDebugExample example);

    int deleteByPrimaryKey(Integer debugId);

    int insert(ProjectCaseDebug record);

    int insertSelective(ProjectCaseDebug record);

    List<ProjectCaseDebug> selectByExample(ProjectCaseDebugExample example);

    ProjectCaseDebug selectByPrimaryKey(Integer debugId);

    int updateByExampleSelective(@Param("record") ProjectCaseDebug record, @Param("example") ProjectCaseDebugExample example);

    int updateByExample(@Param("record") ProjectCaseDebug record, @Param("example") ProjectCaseDebugExample example);

    int updateByPrimaryKeySelective(ProjectCaseDebug record);

    int updateByPrimaryKey(ProjectCaseDebug record);
}