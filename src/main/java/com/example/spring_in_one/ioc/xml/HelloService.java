package com.example.spring_in_one.ioc.xml;

import com.example.spring_in_one.ioc.xml.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//对于xml配置而言,这个注解是不需要存在的.该注解取代了xml
@Component
public class HelloService {
    private Student student;
    @Autowired
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String hello() {
        return animal.getName();
    }
}
