package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysUserRole;
import com.example.demomybatisgenerator.entity.SysUserRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysUserRoleMapper {
    long countByExample(SysUserRoleCriteria example);

    int deleteByExample(SysUserRoleCriteria example);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExampleWithRowbounds(SysUserRoleCriteria example, RowBounds rowBounds);

    List<SysUserRole> selectByExample(SysUserRoleCriteria example);

    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleCriteria example);

    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleCriteria example);
}