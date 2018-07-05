package com.coder.springbootdomecollection.activemq;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class Queue {

    private static final String TEST_QUEUE = "test.queue";
    private static final String OUT_QUEUE = "out.queue";

    @JmsListener(destination = TEST_QUEUE)
    @SendTo(OUT_QUEUE)
    public String receiveQueue(String text) {
        System.out.println(text);
        return "收到报文:" + text;
    }

}
