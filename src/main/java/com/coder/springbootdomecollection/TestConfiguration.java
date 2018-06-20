package com.coder.springbootdomecollection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    private Logger logger = LoggerFactory.getLogger(TestConfiguration.class);

    public TestConfiguration() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }
}
