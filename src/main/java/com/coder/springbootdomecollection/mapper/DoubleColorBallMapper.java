package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.DoubleColorBall;

public interface DoubleColorBallMapper {
    int deleteByPrimaryKey(DoubleColorBall key);

    int insert(DoubleColorBall record);

    int insertSelective(DoubleColorBall record);
}