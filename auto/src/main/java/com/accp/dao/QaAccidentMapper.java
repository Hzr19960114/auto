package com.accp.dao;

import com.accp.domain.QaAccident;
import com.accp.domain.QaAccidentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaAccidentMapper {
    int countByExample(QaAccidentExample example);

    int deleteByExample(QaAccidentExample example);

    int deleteByPrimaryKey(Integer accidentId);

    int insert(QaAccident record);

    int insertSelective(QaAccident record);

    List<QaAccident> selectByExample(QaAccidentExample example);

    QaAccident selectByPrimaryKey(Integer accidentId);

    int updateByExampleSelective(@Param("record") QaAccident record, @Param("example") QaAccidentExample example);

    int updateByExample(@Param("record") QaAccident record, @Param("example") QaAccidentExample example);

    int updateByPrimaryKeySelective(QaAccident record);

    int updateByPrimaryKey(QaAccident record);
}