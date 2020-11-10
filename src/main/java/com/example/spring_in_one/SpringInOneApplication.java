package com.example.spring_in_one;

import com.example.spring_in_one.initializer.SecondInitializer;
import com.example.spring_in_one.listener.SecondListener;
import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInOneApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(SpringInOneApplication.class);
        //使用默认属性尝试
        Properties properties=new Properties();
        properties.setProperty("a","aa");
        properties.setProperty("b","bb");
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);

    }

}
