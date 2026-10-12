package com.example.cargo.controller;

import com.example.cargo.common.Result;
import com.example.cargo.entity.User;
import com.example.cargo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户管理 Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Result<List<User>> list() {
        List<User> list = userService.list();
        return Result.success(list);
    }

    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Integer id) {
        User user = userService.getById(id);
        return Result.success(user);
    }

    @PostMapping
    public Result<Void> add(@RequestBody User user) {
        userService.add(user);
        return Result.success();
    }

    @PutMapping
    public Result<Void> update(@RequestBody User user) {
        userService.update(user);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id) {
        userService.delete(id);
        return Result.success();
    }
}
