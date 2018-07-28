package com.coder.springbootdomecollection.repository;

import com.coder.springbootdomecollection.model.SysUser;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SysUserRepository extends MongoRepository<SysUser,String> {

    SysUser findById(Integer id);

    List<SysUser> findByName(String name);
}
