package com.coder.springbootdomecollection.service;

public interface ZookeeperService {

    String get(String nodeName);

    String add(String nodeName,String value);

    String update(String nodeName,String value);
}
