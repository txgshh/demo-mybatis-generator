package com.example.demomybatisgenerator.dao;

import com.example.demomybatisgenerator.entity.SysUser;
import com.example.demomybatisgenerator.entity.SysUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysUserMapper {
    long countByExample(SysUserCriteria example);

    int deleteByExample(SysUserCriteria example);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExampleWithRowbounds(SysUserCriteria example, RowBounds rowBounds);

    List<SysUser> selectByExample(SysUserCriteria example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserCriteria example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserCriteria example);
}