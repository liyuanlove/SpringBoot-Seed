package com.coder.springbootdomecollection.activemq;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
@Configuration
public class Queue {

    private static final String TEST_QUEUE = "test.queue";
    private static final String OUT_QUEUE = "out.queue";

    @JmsListener(destination = TEST_QUEUE,containerFactory = "queueListenerFactory")
    @SendTo(OUT_QUEUE)
    public String receiveQueue(String text) {
        String message = Thread.currentThread().getName() + "收到队列消息:" + text;
        System.out.println(message);
        return message;
    }

}
