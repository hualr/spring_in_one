package com.example.spring_in_one.ioc.xml.animal;

public class AnimalFactory {
    //static!!
    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

}
