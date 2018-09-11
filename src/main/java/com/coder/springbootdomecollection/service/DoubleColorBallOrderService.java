package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.coder.springbootdomecollection.model.DoubleColorBallSearch;

import java.util.List;

public interface DoubleColorBallOrderService {

    int insert(DoubleColorBallOrder doubleColorBallOrder);

    int update(DoubleColorBallOrder doubleColorBallOrder);

    int save(DoubleColorBallOrder doubleColorBallOrder);

}
