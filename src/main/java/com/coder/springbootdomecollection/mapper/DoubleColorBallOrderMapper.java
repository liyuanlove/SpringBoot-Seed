package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.DoubleColorBallOrder;

import java.util.List;

public interface DoubleColorBallOrderMapper {

    DoubleColorBallOrder selectByPrimaryKey(Integer id);

    List<DoubleColorBallOrder> selectByVo(DoubleColorBallOrder doubleColorBallOrder);

    int deleteByPrimaryKey(Integer id);

    int insert(DoubleColorBallOrder record);

    int insertSelective(DoubleColorBallOrder record);

    int updateByPrimaryKeySelective(DoubleColorBallOrder record);

    int updateByPrimaryKey(DoubleColorBallOrder record);
}