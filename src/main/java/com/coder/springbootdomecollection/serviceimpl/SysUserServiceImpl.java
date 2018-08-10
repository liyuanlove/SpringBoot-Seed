package com.coder.springbootdomecollection.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.coder.springbootdomecollection.mapper.SysUserMapper;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysUser;
import com.coder.springbootdomecollection.repository.SysUserRepository;
import com.coder.springbootdomecollection.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserRepository sysUserRepository;


    @Override
    public SysUser selectByPrimaryKey(Integer id) {
        SysUser sysUser = sysUserRepository.findById(id);
        if(sysUser == null){
            sysUser = sysUserMapper.selectByPrimaryKey(id);
            if(sysUser != null){
                sysUserRepository.save(sysUser);
            }
        }
        return  sysUser;
    }

    @Override
    public SysUser selectByUserName(String userName) {
        SysUser sysUser = sysUserRepository.findByName(userName);
        if(sysUser == null){
            sysUser = sysUserMapper.selectByUserName(userName);
            if(sysUser != null){
                sysUserRepository.save(sysUser);
            }
        }
        return sysUser;
    }
}
