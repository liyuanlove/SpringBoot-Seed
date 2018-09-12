package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DoubleColorBallOrderService {

    DoubleColorBallOrder selectByPrimaryKey(Integer id);

    PageInfo<DoubleColorBallOrder> selectPage(int pageIndex, int pageSize, DoubleColorBallOrder doubleColorBallOrder);

    List<DoubleColorBallOrder> selectAll(DoubleColorBallOrder doubleColorBallOrder);

    int deleteByPrimaryKey(Integer id);

    int insert(DoubleColorBallOrder doubleColorBallOrder);

    int insertSelective(DoubleColorBallOrder doubleColorBallOrder);

    int updateByPrimaryKeySelective(DoubleColorBallOrder doubleColorBallOrder);

    int updateByPrimaryKey(DoubleColorBallOrder doubleColorBallOrder);

    int save(DoubleColorBallOrder doubleColorBallOrder);

}
