package com.example.spring_in_one.event;

import com.example.spring_in_one.event.caster.WeatherEventMulticaster;
import com.example.spring_in_one.event.event.RainEvent;
import com.example.spring_in_one.event.event.SnowEvent;
import com.example.spring_in_one.event.listener.RainListener;
import com.example.spring_in_one.event.listener.SnowListener;

public class Test {

    public static void main(String[] args) {
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
        eventMulticaster.removeListener(rainListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
    }

}
