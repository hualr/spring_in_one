package com.example.spring_in_one.event.listener;

import com.example.spring_in_one.event.event.WeatherEvent;

public interface WeatherListener {

    void onWeatherEvent(WeatherEvent event);

}
