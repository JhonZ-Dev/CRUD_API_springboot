package com.example.crud_springboot.controller;

import com.example.crud_springboot.model.UserModel;
import com.example.crud_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*Definir peticiones http*/
    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }
    @PostMapping
    public UserModel saveUser(@RequestBody UserModel userModel){

        return this.userService.saveUser(userModel);
    }

}
