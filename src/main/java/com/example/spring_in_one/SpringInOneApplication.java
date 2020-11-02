package com.example.spring_in_one;

import com.example.spring_in_one.initializer.SecondInitializer;
import com.example.spring_in_one.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInOneApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringInOneApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SpringInOneApplication.class);
        springApplication.addListeners(new SecondListener());
        springApplication.run(args);

    }

}
