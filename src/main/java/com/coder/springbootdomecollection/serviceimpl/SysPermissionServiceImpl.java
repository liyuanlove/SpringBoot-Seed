package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.SysPermissionMapper;
import com.coder.springbootdomecollection.model.SysPermission;
import com.coder.springbootdomecollection.model.SysPermissionSearch;
import com.coder.springbootdomecollection.service.SysPermissionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysPermissionService")
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public SysPermission selectByPrimaryKey(Integer id) {
        return sysPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<SysPermission> selectByVo(int pageIndex, int pageSize, SysPermissionSearch sysPermissionSearch) {
        PageHelper.startPage(pageIndex,pageSize);
        List<SysPermission> sysPermissions = sysPermissionMapper.selectByVo(sysPermissionSearch);
        return new PageInfo<>(sysPermissions);
    }

    @Override
    public SysPermission selectByProperty(SysPermission sysPermission) {
        return sysPermissionMapper.selectByProperty(sysPermission);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByProperty(SysPermission sysPermission) {
        return sysPermissionMapper.deleteByProperty(sysPermission);
    }

    @Override
    public int insert(SysPermission sysPermission) {
        return sysPermissionMapper.insert(sysPermission);
    }

    @Override
    public int insertSelective(SysPermission sysPermission) {
        return sysPermissionMapper.insert(sysPermission);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPermission sysPermission) {
        return sysPermissionMapper.updateByPrimaryKeySelective(sysPermission);
    }

    @Override
    public int updateByPrimaryKey(SysPermission sysPermission) {
        return sysPermissionMapper.updateByPrimaryKey(sysPermission);
    }

    @Override
    public int save(SysPermission sysPermission) {
        SysPermission temp = sysPermissionMapper.selectByPrimaryKey(sysPermission.getId());
        if(temp == null){
            return insert(sysPermission);
        }
        return updateByPrimaryKeySelective(sysPermission);
    }
}