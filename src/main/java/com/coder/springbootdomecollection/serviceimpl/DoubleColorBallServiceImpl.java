package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.DoubleColorBallMapper;
import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallSearch;
import com.coder.springbootdomecollection.service.DoubleColorBallService;
import com.coder.util.CollectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        if(!CollectionUtils.isNullOrEmptyStrict(doubleColorBalls)){
            return doubleColorBallMapper.insertToBatch(doubleColorBalls);
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKey(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.updateByPrimaryKey(doubleColorBall);
    }

    @Override
    public int updateSelectiveByPrimaryKey(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.updateSelectiveByPrimaryKey(doubleColorBall);
    }

    @Override
    public DoubleColorBall selectByPrimaryKey(Integer id) {
        return doubleColorBallMapper.selectByPrimaryKey(id);
    }

    @Override
    public DoubleColorBall selectByProperty(DoubleColorBall doubleColorBall) {
        return doubleColorBallMapper.selectByProperty(doubleColorBall);
    }

    @Override
    public List<DoubleColorBall> selectAll(DoubleColorBallSearch doubleColorBallSearch) {
        return doubleColorBallMapper.selectByVo(doubleColorBallSearch);
    }

    @Override
    public PageInfo<DoubleColorBall> selectPage(int pageIndex, int pageSize, DoubleColorBallSearch doubleColorBallSearch) {
        PageHelper.startPage(pageIndex,pageSize);
        List<DoubleColorBall> doubleColorBalls = doubleColorBallMapper.selectByVo(doubleColorBallSearch);
        return new PageInfo<>(doubleColorBalls);
    }

    @Override
    public int save(DoubleColorBall doubleColorBall) {
        if(doubleColorBall == null){
            return 0;
        }
        DoubleColorBall temp = doubleColorBallMapper.selectByPrimaryKey(doubleColorBall.getId());
        if(temp == null){
            return insert(doubleColorBall);
        }
        return updateSelectiveByPrimaryKey(doubleColorBall);
    }
}
