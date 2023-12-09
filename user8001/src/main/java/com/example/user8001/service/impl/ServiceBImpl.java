package com.example.user8001.service.impl;

import com.example.user8001.service.ServiceA;
import com.example.user8001.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements ServiceB {
    @Autowired
    private ServiceA serviceA;
    @Override
//    @Async("taskExecutor")
    public void doB() {
        serviceA.doA();
        System.out.println("ServiceB do B.");
    }

    @Override
    public void doD() {
        System.out.println("ServiceB do D.");
    }
}
