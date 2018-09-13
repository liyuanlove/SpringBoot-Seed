package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysRoleSearch;
import com.coder.springbootdomecollection.model.SysUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SysRoleService {

    int deleteByPrimaryKey(Integer rid);

    int deleteByVo(SysRole sysRole);

    int insert(SysRole sysRole);

    int insertSelective(SysRole sysRole);

    int insertToBatch(List<SysRole> sysRoles);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int updateByPrimaryKey(SysRole sysRole);

    int save(SysRole sysRole);

    SysRole selectByPrimaryKey(Integer rid);

    List<SysRole> selectAll(SysRoleSearch sysRoleSearch);

    PageInfo<SysRole> selectPage(int pageIndex, int pageSize, SysRoleSearch sysRoleSearch);

    SysRole selectByProperty(SysRole sysRole);

}
