package com.self;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootMain extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMain.class,args);
    }

    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootMain.class);
    }

}
