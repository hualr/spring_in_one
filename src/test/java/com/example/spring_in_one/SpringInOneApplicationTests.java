package com.example.spring_in_one;

import com.example.spring_in_one.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringInOneApplicationTests {

    @Autowired
    private WeatherRunListener weatherRunListener;
    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

}
