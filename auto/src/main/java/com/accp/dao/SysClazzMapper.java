package com.accp.dao;

import com.accp.domain.SysClazz;
import com.accp.domain.SysClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysClazzMapper {
    int countByExample(SysClazzExample example);

    int deleteByExample(SysClazzExample example);

    int deleteByPrimaryKey(Integer clazzId);

    int insert(SysClazz record);

    int insertSelective(SysClazz record);

    List<SysClazz> selectByExample(SysClazzExample example);

    SysClazz selectByPrimaryKey(Integer clazzId);
    
    List<SysClazz> find(Integer parentid);
    
    List<SysClazz> clazzFind(List<Integer> list);

    int updateByExampleSelective(@Param("record") SysClazz record, @Param("example") SysClazzExample example);

    int updateByExample(@Param("record") SysClazz record, @Param("example") SysClazzExample example);

    int updateByPrimaryKeySelective(SysClazz record);

    int updateByPrimaryKey(SysClazz record);
    
    List<SysClazz> selectByParent_id(Integer parent_id);
}