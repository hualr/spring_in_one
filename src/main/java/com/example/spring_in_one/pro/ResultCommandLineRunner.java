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
        //这个属性是直接从文件中任意生成的
        System.out.println(env.getProperty("c"));
        //从默认properties文件中加载
        System.out.println(env.getProperty("d"));
    }
    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }


}
