package com.accp.dao;

import com.accp.domain.QrtzLocksExample;
import com.accp.domain.QrtzLocksKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzLocksMapper {
    int countByExample(QrtzLocksExample example);

    int deleteByExample(QrtzLocksExample example);

    int deleteByPrimaryKey(QrtzLocksKey key);

    int insert(QrtzLocksKey record);

    int insertSelective(QrtzLocksKey record);

    List<QrtzLocksKey> selectByExample(QrtzLocksExample example);

    int updateByExampleSelective(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);

    int updateByExample(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);
}