package com;

import com.entity.VariableBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({VariableBean.class})
public class VariableAppl {
    public static void main(String[] args) {
        SpringApplication.run(VariableAppl.class,args);
    }
}
