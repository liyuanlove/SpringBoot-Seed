package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.DoubleColorBallMapper;
import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallSearch;
import com.coder.springbootdomecollection.model.User;
import com.coder.springbootdomecollection.service.DoubleColorBallService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
    public int insertToBatch(List<DoubleColorBall> doubleColorBalls) {
        if(null != doubleColorBalls && doubleColorBalls.size() > 0){
            return doubleColorBallMapper.insertToBatch(doubleColorBalls);
        }
        return 0;

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
    public PageInfo<DoubleColorBall> listPage(int pageNum,int pageSize,DoubleColorBallSearch doubleColorBallSearch) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<DoubleColorBall> balls = doubleColorBallMapper.listPage(doubleColorBallSearch);
        PageInfo result = new PageInfo(balls);
        return result;
    }
}
