package com.atguigu.springboot01helloworldquick.config;

import com.atguigu.springboot01helloworldquick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    //将方法的返回值返回到容器中
    //容器中这个组件的名称默认id就是方法名
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
