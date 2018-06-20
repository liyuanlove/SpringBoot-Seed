package com.coder.springbootdomecollection;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author WJL
 */
@Configuration
public class FaJsonConfig extends WebMvcConfigurationSupport {

    public FaJsonConfig() {
        System.out.println("FaJsonConfig容器启动初始化。。。");
    }

    /*
@Override
protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
super.configureMessageConverters(converters);
FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
FastJsonConfig fastJsonConfig = new FastJsonConfig();
fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
fastConverter.setFastJsonConfig(fastJsonConfig);
converters.add(fastConverter);
}
*/

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        //1. 需要定义一个converter转换消息的对象
        FastJsonHttpMessageConverter fasHttpMessageConverter = new FastJsonHttpMessageConverter();

        //2. 添加fastjson的配置信息，比如:是否需要格式化返回的json的数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

        //3. 在converter中添加配置信息
        fasHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fasHttpMessageConverter;
        return new HttpMessageConverters(converter);
    }
}
