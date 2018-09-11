package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.DoubleColorBallMapper;
import com.coder.springbootdomecollection.mapper.DoubleColorBallOrderMapper;
import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.coder.springbootdomecollection.model.DoubleColorBallSearch;
import com.coder.springbootdomecollection.service.DoubleColorBallOrderService;
import com.coder.springbootdomecollection.service.DoubleColorBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("doubleColorBallOrderService")
public class DoubleColorBallOrderServiceImpl implements DoubleColorBallOrderService {

    @Autowired
    private DoubleColorBallOrderMapper doubleColorBallOrderMapper;

    @Override
    public int insert(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.insert(doubleColorBallOrder);
    }

    @Override
    public int update(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.updateByPrimaryKey(doubleColorBallOrder);
    }

    @Override
    public int save(DoubleColorBallOrder doubleColorBallOrder) {
        if(doubleColorBallOrderMapper.selectByPrimaryKey(doubleColorBallOrder.getId()) == null){
            return this.insert(doubleColorBallOrder);
        }else{
            return this.update(doubleColorBallOrder);
        }
    }
}
