package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysOffice;
import com.example.demomybatisgenerator.entity.SysOfficeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysOfficeMapper {
    long countByExample(SysOfficeCriteria example);

    int deleteByExample(SysOfficeCriteria example);

    int insert(SysOffice record);

    int insertSelective(SysOffice record);

    List<SysOffice> selectByExampleWithRowbounds(SysOfficeCriteria example, RowBounds rowBounds);

    List<SysOffice> selectByExample(SysOfficeCriteria example);

    int updateByExampleSelective(@Param("record") SysOffice record, @Param("example") SysOfficeCriteria example);

    int updateByExample(@Param("record") SysOffice record, @Param("example") SysOfficeCriteria example);
}