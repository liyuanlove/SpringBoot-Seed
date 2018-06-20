package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    PageInfo<User> list(int pageNum, int pageSize);

    int add(User user);

    int update(User user);

    User selectByPrimaryKey(int id);

    int delete(int id);
}
