package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.User;

import java.util.List;

public interface UserMapper {

    List<User> list();

    int add(User user);

    int update(User user);

    User selectUserById(int id);

    int delete(int id);
}