package com.example.spring_in_one.event.caster;

import org.springframework.stereotype.Component;
//使其可以被自动注入
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {

    @Override
    public void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    public void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
