package com.example.ops.feign;

import com.example.common.entity.User;
import com.example.common.util.DataResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "user-service",path = "/user")
public interface UserService {
    @GetMapping("list")
    public DataResult<List<User>> getUserList();
}
