package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.SysPermission;

import java.util.List;

public interface SysPermissionMapper {

    SysPermission selectByPrimaryKey(Integer id);

    List<SysPermission> selectByVo(SysPermission sysPermission);

    SysPermission selectByProperty(SysPermission sysPermission);

    int deleteByPrimaryKey(Integer id);

    int deleteByProperty(SysPermission sysPermission);

    int insert(SysPermission sysPermission);

    int insertSelective(SysPermission sysPermission);

    int insertToBatch(List<SysPermission> sysPermissions);

    int updateByPrimaryKeySelective(SysPermission sysPermission);

    int updateByPrimaryKey(SysPermission sysPermission);
}