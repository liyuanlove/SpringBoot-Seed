package com.coder.springbootdomecollection.Queue;

import com.coder.springbootdomecollection.model.DoubleColorBall;
import com.coder.springbootdomecollection.model.Mail;
import com.coder.springbootdomecollection.service.DoubleColorBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class DoubleColorBallQueue {

    private static final String INSERT_DOUBLE_COLOR_BALL = "insertdoublecolorball.queue";
    private static final String UPDATE_DOUBLE_COLOR_BALL = "updatedoublecolorball.queue";
    private static final String RETURN_DOUBLE_COLOR_BALL = "returndoublecolorball.queue";

    @Autowired
    private DoubleColorBallService doubleColorBallService;

    @JmsListener(destination = INSERT_DOUBLE_COLOR_BALL,containerFactory = "queueListenerFactory")
    @SendTo(RETURN_DOUBLE_COLOR_BALL)
    public String insert(ObjectMessage message) {
        DoubleColorBall doubleColorBall = null;
        try {
            doubleColorBall = (DoubleColorBall) message.getObject();
            doubleColorBallService.insert(doubleColorBall);
        } catch (JMSException e) {
            e.printStackTrace();
            return "insert fail";
        }
        return "insert success";
    }

    @JmsListener(destination = INSERT_DOUBLE_COLOR_BALL,containerFactory = "queueListenerFactory")
    @SendTo(RETURN_DOUBLE_COLOR_BALL)
    public String update(ObjectMessage message) {
        DoubleColorBall doubleColorBall = null;
        try {
            doubleColorBall = (DoubleColorBall) message.getObject();
            doubleColorBallService.update(doubleColorBall);
        } catch (JMSException e) {
            e.printStackTrace();
            return "insert fail";
        }
        return "insert success";
    }
}
