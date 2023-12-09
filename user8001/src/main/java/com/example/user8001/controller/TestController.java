package com.example.user8001.controller;

import com.example.user8001.service.ServiceA;
import com.example.user8001.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ServiceA serviceA;
    @Autowired
    private ServiceB serviceB;

    @GetMapping("/doA")
    public void doA(){
        serviceA.doC();
    }

    @GetMapping("/doB")
    public void doB(){
        serviceB.doB();
    }
}
