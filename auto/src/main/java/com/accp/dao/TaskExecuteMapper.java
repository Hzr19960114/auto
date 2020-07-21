package com.accp.dao;

import com.accp.domain.TaskExecute;
import com.accp.domain.TaskExecuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskExecuteMapper {
    int countByExample(TaskExecuteExample example);

    int deleteByExample(TaskExecuteExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskExecute record);

    int insertSelective(TaskExecute record);

    List<TaskExecute> selectByExample(TaskExecuteExample example);

    TaskExecute selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TaskExecute record, @Param("example") TaskExecuteExample example);

    int updateByExample(@Param("record") TaskExecute record, @Param("example") TaskExecuteExample example);

    int updateByPrimaryKeySelective(TaskExecute record);

    int updateByPrimaryKey(TaskExecute record);
}