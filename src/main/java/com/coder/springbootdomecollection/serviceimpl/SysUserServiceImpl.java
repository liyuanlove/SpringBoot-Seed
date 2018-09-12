package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.SysUserMapper;
import com.coder.springbootdomecollection.model.SysUser;
import com.coder.springbootdomecollection.model.SysUserSearch;
import com.coder.springbootdomecollection.repository.SysUserRepository;
import com.coder.springbootdomecollection.service.SysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("sysUserService")
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
        return sysUser;
    }

    @Override
    public List<SysUser> selectAll(SysUserSearch sysUserSearch) {
        return sysUserMapper.selectByVo(sysUserSearch);
    }

    @Override
    public PageInfo<SysUser> selectPage(int pageIndex, int pageSize, SysUserSearch sysUserSearch) {
        PageHelper.startPage(pageIndex, pageSize);
        List<SysUser> sysUsers = sysUserMapper.selectByVo(sysUserSearch);
        return new PageInfo(sysUsers);
    }

    @Override
    public SysUser selectByProperty(SysUser sysUser) {
        return sysUserMapper.selectByProperty(sysUser);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        sysUserRepository.deleteById(String.valueOf(id));
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByVo(SysUser sysUser) {
        sysUserRepository.delete(sysUser);
        return sysUserMapper.deleteByVo(sysUser);
    }

    @Override
    public int insert(SysUser sysUser) {
        sysUserRepository.save(sysUser);
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int insertSelective(SysUser sysUser) {
        sysUserRepository.save(sysUser);
        return sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser sysUser) {
        sysUserRepository.save(sysUser);
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int updateByPrimaryKey(SysUser sysUser) {
        sysUserRepository.save(sysUser);
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    /**
     * 该方法默认按照主键去查，
     * 如果查得到则更新
     * 如果查不到则插入
     * 如果有其它业务需求，请自行编写业务代码
     * @param sysUser
     * @return
     */
    @Override
    public int save(SysUser sysUser) {
        SysUser temp = sysUserMapper.selectByPrimaryKey(sysUser.getId());
        if(temp == null){
            return insert(sysUser);
        }
        return updateByPrimaryKeySelective(sysUser);
    }
}
