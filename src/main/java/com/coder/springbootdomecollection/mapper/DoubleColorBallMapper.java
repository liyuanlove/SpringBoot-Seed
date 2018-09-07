package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.DoubleColorBallKey;

public interface DoubleColorBallMapper {
    int deleteByPrimaryKey(DoubleColorBallKey key);

    int insert(DoubleColorBallKey record);

    int insertSelective(DoubleColorBallKey record);
}