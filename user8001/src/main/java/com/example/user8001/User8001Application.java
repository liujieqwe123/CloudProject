package com.example.user8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@MapperScan("com.example.user8001.mapper")
@EnableDiscoveryClient
public class User8001Application {

    public static void main(String[] args) {
        SpringApplication.run(User8001Application.class, args);
    }

}
