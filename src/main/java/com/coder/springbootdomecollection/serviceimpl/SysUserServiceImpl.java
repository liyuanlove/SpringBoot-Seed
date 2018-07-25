package com.coder.springbootdomecollection.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.coder.springbootdomecollection.mapper.SysUserMapper;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysUser;
import com.coder.springbootdomecollection.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser selectByPrimaryKey(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
