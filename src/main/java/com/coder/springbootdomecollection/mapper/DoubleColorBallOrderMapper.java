package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.DoubleColorBallOrder;

public interface DoubleColorBallOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoubleColorBallOrder record);

    int insertSelective(DoubleColorBallOrder record);

    DoubleColorBallOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DoubleColorBallOrder record);

    int updateByPrimaryKey(DoubleColorBallOrder record);
}