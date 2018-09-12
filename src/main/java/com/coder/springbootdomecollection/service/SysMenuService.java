package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysMenu;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SysMenuService {

    int deleteByPrimaryKey(Integer id);

    int deleteByProperty(SysMenu sysMenu);

    int insert(SysMenu sysMenu);

    int insertSelective(SysMenu sysMenu);

    int updateByPrimaryKeySelective(SysMenu sysMenu);

    int updateByPrimaryKey(SysMenu sysMenu);

    SysMenu selectByPrimaryKey(Integer id);

    List<SysMenu> selectAll();

    PageInfo<SysMenu> selectAll(int pageIndex, int pageSize);

    int save(SysMenu sysMenu);
}
