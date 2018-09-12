package com.coder.springbootdomecollection.mapper;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysRoleSearch;

import java.util.List;

public interface SysRoleMapper {

    int deleteByPrimaryKey(Integer rid);

    int deleteByProperty(SysRole sysRole);

    int insert(SysRole sysRole);

    int insertSelective(SysRole sysRole);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int updateByPrimaryKey(SysRole sysRole);

    SysRole selectByPrimaryKey(Integer rid);

    List<SysRole> selectByVo(SysRoleSearch sysRoleSearch);

    SysRole selectByProperty(SysRole sysRole);

}