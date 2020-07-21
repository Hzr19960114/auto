package com.accp.dao;

import com.accp.domain.QaVersion;
import com.accp.domain.QaVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaVersionMapper {
    int countByExample(QaVersionExample example);

    int deleteByExample(QaVersionExample example);

    int deleteByPrimaryKey(Integer versionId);

    int insert(QaVersion record);

    int insertSelective(QaVersion record);

    List<QaVersion> selectByExample(QaVersionExample example);

    QaVersion selectByPrimaryKey(Integer versionId);

    int updateByExampleSelective(@Param("record") QaVersion record, @Param("example") QaVersionExample example);

    int updateByExample(@Param("record") QaVersion record, @Param("example") QaVersionExample example);

    int updateByPrimaryKeySelective(QaVersion record);

    int updateByPrimaryKey(QaVersion record);
}