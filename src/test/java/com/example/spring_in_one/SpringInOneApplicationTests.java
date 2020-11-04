package com.example.spring_in_one;

import com.example.spring_in_one.ioc.ann.MyBeanImport;
import com.example.spring_in_one.ioc.xml.HelloService;
import com.example.spring_in_one.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
//@ContextConfiguration(locations = "classpath:ioc/demo.xml")
@Import(MyBeanImport.class)
class SpringInOneApplicationTests {


    @Autowired
    private HelloService helloService;

    @Autowired
    private CustomerService customerService;
    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        customerService.setCustomerInfo("1","黎明","光明");
    }

    @Test
    public void test2() {
        customerService.setCustomerInfo("1","傍晚","黑暗");
    }

}
