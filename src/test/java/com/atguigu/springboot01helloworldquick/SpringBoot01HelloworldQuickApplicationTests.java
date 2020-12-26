package com.atguigu.springboot01helloworldquick;

import com.atguigu.springboot01helloworldquick.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQuickApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }

    public SpringBoot01HelloworldQuickApplicationTests() {

    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
