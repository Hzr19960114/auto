package com.accp.dao;

import com.accp.domain.TaskScheduling;
import com.accp.domain.TaskSchedulingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskSchedulingMapper {
    int countByExample(TaskSchedulingExample example);

    int deleteByExample(TaskSchedulingExample example);

    int deleteByPrimaryKey(Integer schedulingId);

    int insert(TaskScheduling record);

    int insertSelective(TaskScheduling record);

    List<TaskScheduling> selectByExample(TaskSchedulingExample example);

    TaskScheduling selectByPrimaryKey(Integer schedulingId);

    int updateByExampleSelective(@Param("record") TaskScheduling record, @Param("example") TaskSchedulingExample example);

    int updateByExample(@Param("record") TaskScheduling record, @Param("example") TaskSchedulingExample example);

    int updateByPrimaryKeySelective(TaskScheduling record);

    int updateByPrimaryKey(TaskScheduling record);
}