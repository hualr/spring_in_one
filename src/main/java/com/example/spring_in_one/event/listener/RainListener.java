package com.example.spring_in_one.event.listener;

import com.example.spring_in_one.event.event.RainEvent;
import com.example.spring_in_one.event.event.WeatherEvent;
import org.springframework.stereotype.Component;

@Component
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
