package com.example.spring_in_one.event.listener;

import com.example.spring_in_one.event.event.SnowEvent;
import com.example.spring_in_one.event.event.WeatherEvent;

public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
