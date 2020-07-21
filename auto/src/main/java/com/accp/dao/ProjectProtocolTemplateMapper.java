package com.accp.dao;

import com.accp.domain.ProjectProtocolTemplate;
import com.accp.domain.ProjectProtocolTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectProtocolTemplateMapper {
    int countByExample(ProjectProtocolTemplateExample example);

    int deleteByExample(ProjectProtocolTemplateExample example);

    int deleteByPrimaryKey(Integer templateId);

    int insert(ProjectProtocolTemplate record);

    int insertSelective(ProjectProtocolTemplate record);

    List<ProjectProtocolTemplate> selectByExample(ProjectProtocolTemplateExample example);

    ProjectProtocolTemplate selectByPrimaryKey(Integer templateId);

    int updateByExampleSelective(@Param("record") ProjectProtocolTemplate record, @Param("example") ProjectProtocolTemplateExample example);

    int updateByExample(@Param("record") ProjectProtocolTemplate record, @Param("example") ProjectProtocolTemplateExample example);

    int updateByPrimaryKeySelective(ProjectProtocolTemplate record);

    int updateByPrimaryKey(ProjectProtocolTemplate record);
}