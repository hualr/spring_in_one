package com.example.spring_in_one.ioc.ann;

import com.example.spring_in_one.ioc.xml.animal.Animal;
import com.example.spring_in_one.ioc.xml.animal.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyCat implements FactoryBean<Animal> {
    @Override
    public Animal getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}

