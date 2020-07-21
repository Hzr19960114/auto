package com.accp.dao;

import com.accp.domain.ProjectTemplateParams;
import com.accp.domain.ProjectTemplateParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectTemplateParamsMapper {
    int countByExample(ProjectTemplateParamsExample example);

    int deleteByExample(ProjectTemplateParamsExample example);

    int deleteByPrimaryKey(Integer paramsId);

    int insert(ProjectTemplateParams record);

    int insertSelective(ProjectTemplateParams record);

    List<ProjectTemplateParams> selectByExample(ProjectTemplateParamsExample example);

    ProjectTemplateParams selectByPrimaryKey(Integer paramsId);

    int updateByExampleSelective(@Param("record") ProjectTemplateParams record, @Param("example") ProjectTemplateParamsExample example);

    int updateByExample(@Param("record") ProjectTemplateParams record, @Param("example") ProjectTemplateParamsExample example);

    int updateByPrimaryKeySelective(ProjectTemplateParams record);

    int updateByPrimaryKey(ProjectTemplateParams record);
}