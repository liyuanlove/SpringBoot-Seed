package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysRoleSearch;
import com.github.pagehelper.PageInfo;

public interface SysRoleService {

    int deleteByPrimaryKey(Integer rid);

    int deleteByVo(SysRole sysRole);

    int insert(SysRole sysRole);

    int insertSelective(SysRole sysRole);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int updateByPrimaryKey(SysRole sysRole);

    int save(SysRole sysRole);

    SysRole selectByPrimaryKey(Integer rid);

    PageInfo<SysRole> selectByVo(int pageIndex, int pageSize, SysRoleSearch sysRoleSearch);

    SysRole selectByProperty(SysRole sysRole);

}
