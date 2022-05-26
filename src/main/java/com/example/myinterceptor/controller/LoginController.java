package com.example.myinterceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @RequestMapping("employeeLogin")
    public Object login() {

        return "0";
    }

    @RequestMapping("employeeLogin2")
    public Object login2() {

        return "1";
    }
}
