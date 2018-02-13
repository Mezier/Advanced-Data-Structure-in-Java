package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*@Controller
@EnableAutoConfiguration*/
public class SampleDemo {
    @Value("${com.x}")
    private String x;
    @Value("${com.y}")
    private String y;
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return x+"Hello World!"+y;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleDemo.class,args);
    }

}
