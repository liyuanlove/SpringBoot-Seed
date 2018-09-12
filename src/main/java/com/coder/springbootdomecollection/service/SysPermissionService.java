package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysPermission;
import com.coder.springbootdomecollection.model.SysPermissionSearch;
import com.github.pagehelper.PageInfo;

public interface SysPermissionService {

    SysPermission selectByPrimaryKey(Integer id);

    PageInfo<SysPermission> selectByVo(int pageIndex, int pageSize, SysPermissionSearch permissionSearch);

    SysPermission selectByProperty(SysPermission sysPermission);

    int deleteByPrimaryKey(Integer id);

    int deleteByProperty(SysPermission sysPermission);

    int insert(SysPermission sysPermission);

    int insertSelective(SysPermission sysPermission);

    int updateByPrimaryKeySelective(SysPermission sysPermission);

    int updateByPrimaryKey(SysPermission sysPermission);

    int save(SysPermission sysPermission);

}
