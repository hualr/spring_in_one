package com.example.spring_in_one.event.caster;

import com.example.spring_in_one.event.event.WeatherEvent;
import com.example.spring_in_one.event.listener.WeatherListener;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {

    @Autowired
    private List<WeatherListener> listenerList;

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    @Override
    public void addListener(WeatherListener weatherListener) {
        listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }

    public abstract void doStart();

    public abstract void doEnd();

}
