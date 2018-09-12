package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.SysPermission;
import com.coder.springbootdomecollection.model.SysPermissionSearch;

import java.util.List;

public interface SysPermissionMapper {

    SysPermission selectByPrimaryKey(Integer id);

    List<SysPermission> selectByVo(SysPermissionSearch permissionSearch);

    SysPermission selectByProperty(SysPermission sysPermission);

    int deleteByPrimaryKey(Integer id);

    int deleteByProperty(SysPermission sysPermission);

    int insert(SysPermission sysPermission);

    int insertSelective(SysPermission sysPermission);

    int updateByPrimaryKeySelective(SysPermission sysPermission);

    int updateByPrimaryKey(SysPermission sysPermission);
}