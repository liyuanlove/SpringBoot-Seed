package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysUser;
import com.coder.springbootdomecollection.model.SysUserSearch;
import com.github.pagehelper.PageInfo;

public interface SysUserService {

    SysUser selectByPrimaryKey(Integer id);
    PageInfo<SysUser> selectByVo(int pageIndex, int pageSize, SysUserSearch sysUserSearch);
    SysUser selectByProperty(SysUser sysUser);

    int deleteByPrimaryKey(Integer id);
    int deleteByVo(SysUser sysUser);

    int insert(SysUser record);
    int insertSelective(SysUser record);

    int updateByPrimaryKeySelective(SysUser record);
    int updateByPrimaryKey(SysUser record);

    int save(SysUser sysUser);
}
