package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysRoleMenu;
import com.example.demomybatisgenerator.entity.SysRoleMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysRoleMenuMapper {
    long countByExample(SysRoleMenuCriteria example);

    int deleteByExample(SysRoleMenuCriteria example);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    List<SysRoleMenu> selectByExampleWithRowbounds(SysRoleMenuCriteria example, RowBounds rowBounds);

    List<SysRoleMenu> selectByExample(SysRoleMenuCriteria example);

    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuCriteria example);

    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuCriteria example);
}