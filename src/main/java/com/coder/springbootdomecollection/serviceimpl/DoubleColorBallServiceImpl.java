package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.DoubleColorBallMapper;
import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallSearch;
import com.coder.springbootdomecollection.service.DoubleColorBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("doubleColorBallService")
public class DoubleColorBallServiceImpl implements DoubleColorBallService {

    @Autowired
    private DoubleColorBallMapper doubleColorBallMapper;

    @Override
    public int insert(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.insert(doubleColorBall);
    }

    @Override
    public int insertSelective(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.insertSelective(doubleColorBall);
    }

    @Override
    public int update(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.update(doubleColorBall);
    }

    @Override
    public int updateSelective(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.updateSelective(doubleColorBall);
    }

    @Override
    public DoubleColorBall selectById(Integer integer) {
        return doubleColorBallMapper.selectById(integer);
    }

    @Override
    public List<DoubleColorBall> listPage(DoubleColorBallSearch doubleColorBallSearch) {
        return doubleColorBallMapper.listPage(doubleColorBallSearch);
    }
}
