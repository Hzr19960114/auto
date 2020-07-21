package com.accp.dao;

import com.accp.domain.TaskCaseExecute;
import com.accp.domain.TaskCaseExecuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCaseExecuteMapper {
    int countByExample(TaskCaseExecuteExample example);

    int deleteByExample(TaskCaseExecuteExample example);

    int deleteByPrimaryKey(Integer taskCaseId);

    int insert(TaskCaseExecute record);

    int insertSelective(TaskCaseExecute record);

    List<TaskCaseExecute> selectByExample(TaskCaseExecuteExample example);

    TaskCaseExecute selectByPrimaryKey(Integer taskCaseId);

    int updateByExampleSelective(@Param("record") TaskCaseExecute record, @Param("example") TaskCaseExecuteExample example);

    int updateByExample(@Param("record") TaskCaseExecute record, @Param("example") TaskCaseExecuteExample example);

    int updateByPrimaryKeySelective(TaskCaseExecute record);

    int updateByPrimaryKey(TaskCaseExecute record);
}