package com.coder.springbootdomecollection;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.coder.springbootdomecollection.mapper")
@EnableTransactionManagement
@ImportResource(value = {"classpath:providers.xml"}) // 使用 providers.xml 配置；
public class SpringbootDomeCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDomeCollectionApplication.class, args);
    }

}
