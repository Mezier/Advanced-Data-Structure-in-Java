package com.controller;

import com.entity.VariableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariableControl {
    @Autowired
    VariableBean vb;
    @RequestMapping("/test")
    public String test(){
        return vb.getX()+vb.getY();
    }
}
