package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysRoleOffice;
import com.example.demomybatisgenerator.entity.SysRoleOfficeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysRoleOfficeMapper {
    long countByExample(SysRoleOfficeCriteria example);

    int deleteByExample(SysRoleOfficeCriteria example);

    int insert(SysRoleOffice record);

    int insertSelective(SysRoleOffice record);

    List<SysRoleOffice> selectByExampleWithRowbounds(SysRoleOfficeCriteria example, RowBounds rowBounds);

    List<SysRoleOffice> selectByExample(SysRoleOfficeCriteria example);

    int updateByExampleSelective(@Param("record") SysRoleOffice record, @Param("example") SysRoleOfficeCriteria example);

    int updateByExample(@Param("record") SysRoleOffice record, @Param("example") SysRoleOfficeCriteria example);
}