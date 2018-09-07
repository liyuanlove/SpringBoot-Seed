package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.DoubleColorBallSearch;

import java.util.List;

public interface DoubleColorBallService {

    void insert(DoubleColorBall doubleColorBall);

    void insertSelective(DoubleColorBall doubleColorBall);

    void update(DoubleColorBall doubleColorBall);

    void updateSelective(DoubleColorBall doubleColorBall);

    DoubleColorBall selectById(Integer integer);

    List<DoubleColorBall> listPage(DoubleColorBallSearch doubleColorBallSearch);

}
