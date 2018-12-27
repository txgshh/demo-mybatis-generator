package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysMenu;
import com.example.demomybatisgenerator.entity.SysMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysMenuMapper {
    long countByExample(SysMenuCriteria example);

    int deleteByExample(SysMenuCriteria example);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExampleWithRowbounds(SysMenuCriteria example, RowBounds rowBounds);

    List<SysMenu> selectByExample(SysMenuCriteria example);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuCriteria example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuCriteria example);
}