package com.qy.mapper;

import com.qy.entity.QmCmDef;
import com.qy.entity.QmCmDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QmCmDefMapper {
    long countByExample(QmCmDefExample example);

    int deleteByExample(QmCmDefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QmCmDef record);

    int insertSelective(QmCmDef record);

    List<QmCmDef> selectByExample(QmCmDefExample example);

    QmCmDef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QmCmDef record, @Param("example") QmCmDefExample example);

    int updateByExample(@Param("record") QmCmDef record, @Param("example") QmCmDefExample example);

    int updateByPrimaryKeySelective(QmCmDef record);

    int updateByPrimaryKey(QmCmDef record);
}