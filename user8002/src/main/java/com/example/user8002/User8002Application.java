package com.example.user8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.user8002.mapper")
public class User8002Application {

    public static void main(String[] args) {
        SpringApplication.run(User8002Application.class, args);
    }

}
