package com.example.spring_in_one.controller;

import com.example.spring_in_one.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private TestService testService;


    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return testService.test();
    }


}

