package com.example.user8002.controller;

import com.example.common.entity.User;
import com.example.common.util.DataResult;
import com.example.user8002.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {
    @Value("${user2}")
    private String user2;
    @Autowired
    private UserMapper userMapper;
    @GetMapping("list")
    public DataResult<List<User>> getUserList(){
        return DataResult.success(user2,userMapper.getAllUser());
    }
}
