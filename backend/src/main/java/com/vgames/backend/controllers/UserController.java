package com.vgames.backend.controllers;

import com.vgames.backend.models.User;
import com.vgames.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/user/login", consumes = "application/json", produces = "application/json")
    public void loginUser(@RequestBody User user){
        userService.createUser(user);
    }
}
