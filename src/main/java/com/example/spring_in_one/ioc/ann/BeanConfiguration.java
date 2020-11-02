package com.example.spring_in_one.ioc.ann;

import com.example.spring_in_one.ioc.xml.animal.Animal;
import com.example.spring_in_one.ioc.xml.animal.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration/* implements SuperConfiguration*/{
    @Bean("dog")
    Animal getDog() {
        return new Dog();
    }

}

