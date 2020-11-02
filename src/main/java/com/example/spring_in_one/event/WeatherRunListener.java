package com.example.spring_in_one.event;

import com.example.spring_in_one.event.caster.WeatherEventMulticaster;
import com.example.spring_in_one.event.event.RainEvent;
import com.example.spring_in_one.event.event.SnowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherRunListener {

    @Autowired
    private WeatherEventMulticaster eventMulticaster;

    public void snow() {
        eventMulticaster.multicastEvent(new SnowEvent());
    }

    public void rain() {
        eventMulticaster.multicastEvent(new RainEvent());
    }

}
