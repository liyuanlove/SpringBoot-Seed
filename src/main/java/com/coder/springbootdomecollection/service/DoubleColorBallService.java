package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallSearch;

import java.util.List;

public interface DoubleColorBallService {

    int insert(DoubleColorBall doubleColorBall);

    int insertSelective(DoubleColorBall doubleColorBall);

    int insertToBatch(List<DoubleColorBall> doubleColorBalls);

    int update(DoubleColorBall doubleColorBall);

    int updateSelective(DoubleColorBall doubleColorBall);

    DoubleColorBall selectById(Integer integer);

    List<DoubleColorBall> listPage(DoubleColorBallSearch doubleColorBallSearch);

}
