package com.example.crud_springboot.controller;

import com.example.crud_springboot.model.UserModel;
import com.example.crud_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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
    /*Traer el usuario por id*/
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Integer id){
        return this.userService.getById(id);
    }
    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request,@PathVariable("id") Integer id){
        return this.userService.updateById(request,id);

    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        boolean ok=this.userService.deleteUser(id);
        if(ok){
            return "User con id" + id +"Eliminado";

        }else {
            return "User con id" + id +"No eliminado";
        }
    }


}
