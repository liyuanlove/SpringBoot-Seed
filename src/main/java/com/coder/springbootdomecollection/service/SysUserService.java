package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysUser;

import java.util.List;

public interface SysUserService {

    SysUser selectByPrimaryKey(Integer id);
    SysUser selectByUserName(String userName);

}
