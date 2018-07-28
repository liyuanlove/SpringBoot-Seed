package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.SysUserMapper;
import com.coder.springbootdomecollection.model.SysPermission;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysUser;
import com.coder.springbootdomecollection.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void selectByPrimaryKey(){
        SysUser sysUser = sysUserService.selectByPrimaryKey(1);
        List<SysRole> roles = sysUser.getRoleList();
        for(SysRole role : roles){
            System.out.println(role.getRname() + ":");
            List<SysPermission> sysPermissions = role.getSysPermissionList();
            for(SysPermission sysPermission : sysPermissions){
                System.out.println(sysPermission.getName());
            }
        }
    }
}