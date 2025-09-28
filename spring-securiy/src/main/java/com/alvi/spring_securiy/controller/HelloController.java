package com.alvi.spring_securiy.controller;

import com.alvi.spring_securiy.model.Users;
import com.alvi.spring_securiy.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("")
    public String greet(){
        return "welcome";
    }
    @GetMapping("/users")
    public List<Users> getUsers() {
      return userRepo.findAll();
    }
}
