package com.coder.springbootdomecollection.activemq;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Configuration

public class Topic {
    private static final String TEST_TOPIC = "test.topic";

    @JmsListener(destination = TEST_TOPIC,containerFactory = "topicListenerFactory")
    public void receiveTopic(String text) {
        String message = Thread.currentThread().getName() + "收到订阅消息:" + text;
        System.out.println(message);
    }

}
