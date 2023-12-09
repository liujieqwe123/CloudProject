package com.example.user8001.service.impl;

import com.example.user8001.service.ServiceA;
import com.example.user8001.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceAImpl implements ServiceA {
    @Autowired
//    @Lazy
    private ServiceB serviceB;
    @Override
    public void doA() {
        serviceB.doD();
        System.out.println("ServiceA do A.");
    }

    @Override
    @Async("taskExecutor")
    public void doC() {
        serviceB.doB();
        System.out.println("ServiceA do C.");
    }
}
