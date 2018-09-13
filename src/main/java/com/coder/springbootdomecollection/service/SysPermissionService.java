package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysPermission;
import com.coder.springbootdomecollection.model.SysPermissionSearch;
import com.coder.springbootdomecollection.model.SysRole;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SysPermissionService {

    SysPermission selectByPrimaryKey(Integer id);

    PageInfo<SysPermission> selectPage(int pageIndex, int pageSize, SysPermissionSearch sysPermissionSearch);

    List<SysPermission> selectAll(SysPermissionSearch sysPermissionSearch);

    SysPermission selectByProperty(SysPermission sysPermission);

    int deleteByPrimaryKey(Integer id);

    int deleteByProperty(SysPermission sysPermission);

    int insert(SysPermission sysPermission);

    int insertSelective(SysPermission sysPermission);

    int insertToBatch(List<SysPermission> sysPermissions);

    int updateByPrimaryKeySelective(SysPermission sysPermission);

    int updateByPrimaryKey(SysPermission sysPermission);

    int save(SysPermission sysPermission);

}
