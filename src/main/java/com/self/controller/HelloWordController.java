package com.self.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
public class HelloWordController {

    @RequestMapping("/hello/getInof")
    @ResponseBody
    public String getInfo(){
        System.out.println("222");
        return "11111";
    }

}