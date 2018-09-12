package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.SysMenu;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByProperty(SysMenu sysMenu);

    int insert(SysMenu sysMenu);

    int insertSelective(SysMenu sysMenu);

    int updateByPrimaryKeySelective(SysMenu sysMenu);

    int updateByPrimaryKey(SysMenu sysMenu);

    SysMenu selectByPrimaryKey(Integer id);

    List<SysMenu> selectAll();
}