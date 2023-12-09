package com.example.ops.controller;

import com.example.common.entity.User;
import com.example.common.util.DataResult;
import com.example.ops.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("getUserList")
    public DataResult<List<User>> getUserList(){
        return userService.getUserList();
    }
}
