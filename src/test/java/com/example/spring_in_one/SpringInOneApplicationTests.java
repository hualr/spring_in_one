package com.example.spring_in_one;

import com.example.spring_in_one.ioc.xml.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
//@ContextConfiguration(locations = "classpath:ioc/demo.xml")
class SpringInOneApplicationTests {


    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        System.out.println(helloService.hello());
    }

}
