package com.coder.springbootdomecollection.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.coder.springbootdomecollection.mapper.UserMapper;
import com.coder.springbootdomecollection.model.User;
import com.coder.springbootdomecollection.repository.UserRepository;
import com.coder.springbootdomecollection.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;


    @Override
    public PageInfo<User> list(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.list();
        PageInfo result = new PageInfo(users);
        return result;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int add(User user){
        return userMapper.add(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public User selectByPrimaryKey(int id) {
        return userMapper.selectUserById(id);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public User findUserInMongoDB(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
