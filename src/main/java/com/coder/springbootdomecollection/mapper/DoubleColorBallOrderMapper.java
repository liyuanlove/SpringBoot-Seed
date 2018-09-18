package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.coder.springbootdomecollection.model.SysMenu;
import com.coder.springbootdomecollection.model.SysUser;

import java.util.List;

public interface DoubleColorBallOrderMapper {

    DoubleColorBallOrder selectByPrimaryKey(Integer id);

    List<DoubleColorBallOrder> selectByVo(DoubleColorBallOrder doubleColorBallOrder);

    int deleteByPrimaryKey(Integer id);

    int insert(DoubleColorBallOrder doubleColorBallOrder);

    int insertSelective(DoubleColorBallOrder doubleColorBallOrder);

    int insertToBatch(List<DoubleColorBallOrder> doubleColorBallOrders);

    int updateByPrimaryKeySelective(DoubleColorBallOrder doubleColorBallOrder);

    int updateByPrimaryKey(DoubleColorBallOrder doubleColorBallOrder);

    int findCount(DoubleColorBallOrder doubleColorBallOrder);
}