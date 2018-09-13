package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.SysUser;
import com.coder.springbootdomecollection.model.SysUserSearch;

import java.util.List;

public interface SysUserMapper {

    SysUser selectByPrimaryKey(Integer id);
    List<SysUser> selectByVo(SysUserSearch sysUserSearch);
    SysUser selectByProperty(SysUser sysUser);

    int deleteByPrimaryKey(Integer id);
    int deleteByVo(SysUser sysUser);

    int insert(SysUser sysUser);
    int insertSelective(SysUser sysUser);
    int insertToBatch(List<SysUser> sysUsers);

    int updateByPrimaryKeySelective(SysUser sysUser);
    int updateByPrimaryKey(SysUser sysUser);

}