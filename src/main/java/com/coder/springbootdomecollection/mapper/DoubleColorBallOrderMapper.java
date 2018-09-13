package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.coder.springbootdomecollection.model.SysMenu;

import java.util.List;

public interface DoubleColorBallOrderMapper {

    DoubleColorBallOrder selectByPrimaryKey(Integer id);

    List<DoubleColorBallOrder> selectByVo(DoubleColorBallOrder doubleColorBallOrder);

    int deleteByPrimaryKey(Integer id);

    int insert(DoubleColorBallOrder record);

    int insertSelective(DoubleColorBallOrder record);

    int insertToBatch(List<DoubleColorBallOrder> doubleColorBallOrders);

    int updateByPrimaryKeySelective(DoubleColorBallOrder record);

    int updateByPrimaryKey(DoubleColorBallOrder record);
}