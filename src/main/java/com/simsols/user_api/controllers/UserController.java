package com.simsols.user_api.controllers;

import com.simsols.user_api.models.UserModel;
import com.simsols.user_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getUser(){
        return userService.allUsers();
    }

}
