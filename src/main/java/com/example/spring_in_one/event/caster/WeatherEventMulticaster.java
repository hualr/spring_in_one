package com.example.spring_in_one.event.caster;

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
