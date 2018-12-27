package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysRole;
import com.example.demomybatisgenerator.entity.SysRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysRoleMapper {
    long countByExample(SysRoleCriteria example);

    int deleteByExample(SysRoleCriteria example);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExampleWithRowbounds(SysRoleCriteria example, RowBounds rowBounds);

    List<SysRole> selectByExample(SysRoleCriteria example);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleCriteria example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleCriteria example);
}