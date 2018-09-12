package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.SysMenu;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> list();
}