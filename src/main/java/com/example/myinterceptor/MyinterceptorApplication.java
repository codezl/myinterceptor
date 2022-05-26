package com.example.myinterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class MyinterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyinterceptorApplication.class, args);
    }

}
