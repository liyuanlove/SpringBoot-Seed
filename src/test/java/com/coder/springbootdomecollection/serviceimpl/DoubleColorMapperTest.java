package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.DoubleColorBallMapper;
import com.coder.springbootdomecollection.mapper.DoubleColorBallOrderMapper;
import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.DoubleColorBallOrder;
import com.coder.springbootdomecollection.service.DoubleColorBallOrderService;
import com.coder.springbootdomecollection.service.DoubleColorBallService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoubleColorMapperTest {

    @Autowired
    private DoubleColorBallService doubleColorBallService;

    @Autowired
    private DoubleColorBallOrderService doubleColorBallOrderService;

    @Test
    public void order(){

        List<DoubleColorBall> balls = doubleColorBallService.selectAll(null);
        for(DoubleColorBall ball : balls){
            int[] nums = new int[6];
            nums[0] = ball.getRedball1();
            nums[1] = ball.getRedball2();
            nums[2] = ball.getRedball3();
            nums[3] = ball.getRedball4();
            nums[4] = ball.getRedball5();
            nums[5] = ball.getRedball6();
            Arrays.sort(nums);
            DoubleColorBallOrder doubleColorBallOrder = new DoubleColorBallOrder();
            doubleColorBallOrder.setId(ball.getId());
            doubleColorBallOrder.setRedball1(nums[0]);
            doubleColorBallOrder.setRedball2(nums[1]);
            doubleColorBallOrder.setRedball3(nums[2]);
            doubleColorBallOrder.setRedball4(nums[3]);
            doubleColorBallOrder.setRedball5(nums[4]);
            doubleColorBallOrder.setRedball6(nums[5]);
            doubleColorBallOrder.setBlueball(ball.getBlueball());
            doubleColorBallOrderService.save(doubleColorBallOrder);
        }
    }


}
