package com.vgames.backend.controllers;

import com.vgames.backend.controllers.responses.UserResponse;
import com.vgames.backend.models.User;
import com.vgames.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/user/sign-up", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserResponse> createUser(@RequestBody User user){
        UserResponse response;
        if(userService.createUser(user)){
            response = userService.createUserResponse(true);
            return new ResponseEntity<UserResponse>(response, HttpStatus.CREATED);
        }
        response = userService.createUserResponse(false);
        return new ResponseEntity<UserResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /*@PostMapping(value = "/user/login", consumes = "application/josn", produces = "application/json")
    public User loginUser(@RequestBody User user){
        userService.loginUser();
    }*/
}
