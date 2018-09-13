package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DoubleColorBallService {

    int insert(DoubleColorBall doubleColorBall);

    int insertSelective(DoubleColorBall doubleColorBall);

    int insertToBatch(List<DoubleColorBall> doubleColorBalls);

    int updateByPrimaryKey(DoubleColorBall doubleColorBall);

    int updateSelectiveByPrimaryKey(DoubleColorBall doubleColorBall);

    DoubleColorBall selectByPrimaryKey(Integer id);

    DoubleColorBall selectByProperty(DoubleColorBall doubleColorBall);

    List<DoubleColorBall> selectAll(DoubleColorBall doubleColorBallSearch);

    PageInfo<DoubleColorBall> selectPage(int pageIndex, int pageSize, DoubleColorBall doubleColorBallSearch);

    int save(DoubleColorBall doubleColorBall);

}
