package com.alvi.spring_securiy.controller;

import com.alvi.spring_securiy.model.Users;
import com.alvi.spring_securiy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }
}
