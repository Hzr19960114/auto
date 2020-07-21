package com.accp.dao;

import com.accp.domain.TaskCaseLog;
import com.accp.domain.TaskCaseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCaseLogMapper {
    int countByExample(TaskCaseLogExample example);

    int deleteByExample(TaskCaseLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(TaskCaseLog record);

    int insertSelective(TaskCaseLog record);

    List<TaskCaseLog> selectByExample(TaskCaseLogExample example);

    TaskCaseLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") TaskCaseLog record, @Param("example") TaskCaseLogExample example);

    int updateByExample(@Param("record") TaskCaseLog record, @Param("example") TaskCaseLogExample example);

    int updateByPrimaryKeySelective(TaskCaseLog record);

    int updateByPrimaryKey(TaskCaseLog record);
}