package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.DoubleColorBallOrderMapper;
import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.coder.springbootdomecollection.service.DoubleColorBallOrderService;
import com.coder.util.CollectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("doubleColorBallOrderService")
public class DoubleColorBallOrderServiceImpl implements DoubleColorBallOrderService {

    @Autowired
    private DoubleColorBallOrderMapper doubleColorBallOrderMapper;


    @Override
    public DoubleColorBallOrder selectByPrimaryKey(Integer id) {
        return doubleColorBallOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<DoubleColorBallOrder> selectPage(int pageIndex, int pageSize, DoubleColorBallOrder doubleColorBallOrder) {
        PageHelper.startPage(pageIndex,pageSize);
        List<DoubleColorBallOrder> doubleColorBallOrders = doubleColorBallOrderMapper.selectByVo(doubleColorBallOrder);
        return new PageInfo<>(doubleColorBallOrders);
    }

    @Override
    public List<DoubleColorBallOrder> selectAll(DoubleColorBallOrder doubleColorBallOrder) {
        if(doubleColorBallOrder == null){
            doubleColorBallOrder = new DoubleColorBallOrder();
        }
        return doubleColorBallOrderMapper.selectByVo(doubleColorBallOrder);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return doubleColorBallOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.insert(doubleColorBallOrder);
    }

    @Override
    public int insertSelective(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.insertSelective(doubleColorBallOrder);
    }

    @Override
    public int insertToBatch(List<DoubleColorBallOrder> doubleColorBallOrders) {
        if(!CollectionUtils.isNullOrEmptyStrict(doubleColorBallOrders)){
            return doubleColorBallOrderMapper.insertToBatch(doubleColorBallOrders);
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.updateByPrimaryKeySelective(doubleColorBallOrder);
    }

    @Override
    public int updateByPrimaryKey(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.updateByPrimaryKey(doubleColorBallOrder);
    }

    @Override
    public int save(DoubleColorBallOrder doubleColorBallOrder) {
        if(doubleColorBallOrder == null) {
            return 0;
        }
        DoubleColorBallOrder temp = doubleColorBallOrderMapper.selectByPrimaryKey(doubleColorBallOrder.getId());
        if(temp == null){
            return doubleColorBallOrderMapper.insert(doubleColorBallOrder);
        }
        return doubleColorBallOrderMapper.updateByPrimaryKeySelective(doubleColorBallOrder);
    }

    @Override
    public int findCount(DoubleColorBallOrder doubleColorBallOrder) {
        return doubleColorBallOrderMapper.findCount(doubleColorBallOrder);
    }
}
