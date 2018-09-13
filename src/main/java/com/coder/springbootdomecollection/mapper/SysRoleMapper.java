package com.coder.springbootdomecollection.mapper;
import com.coder.springbootdomecollection.model.SysRole;

import java.util.List;

public interface SysRoleMapper {

    int deleteByPrimaryKey(Integer rid);

    int deleteByProperty(SysRole sysRole);

    int insert(SysRole sysRole);

    int insertSelective(SysRole sysRole);

    int insertToBatch(List<SysRole> sysRoles);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int updateByPrimaryKey(SysRole sysRole);

    SysRole selectByPrimaryKey(Integer rid);

    List<SysRole> selectByVo(SysRole sysRole);

    SysRole selectByProperty(SysRole sysRole);

}