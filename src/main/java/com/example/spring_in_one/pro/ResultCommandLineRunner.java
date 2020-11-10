package com.example.spring_in_one.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware {
    private Environment env;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(env.getProperty("a"));
        System.out.println(env.getProperty("b"));
    }
    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }


}
