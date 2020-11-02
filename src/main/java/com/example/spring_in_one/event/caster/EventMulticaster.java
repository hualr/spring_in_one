package com.example.spring_in_one.event.caster;

import com.example.spring_in_one.event.event.WeatherEvent;
import com.example.spring_in_one.event.listener.WeatherListener;

public interface EventMulticaster {

    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener weatherListener);

    void removeListener(WeatherListener weatherListener);

}
