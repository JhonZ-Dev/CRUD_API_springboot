package com.example.crud_springboot.service;

import com.example.crud_springboot.model.UserModel;
import com.example.crud_springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    /*Inyecciones de depencias con AutoWire*/
    @Autowired
    public UsuarioRepository usuarioRepository;


    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) usuarioRepository.findAll();
    }
    /*Guardar un usuario*/
    public UserModel saveUser(UserModel userModel){
        return usuarioRepository.save(userModel);
    }
    public Optional<UserModel> getById(Integer id){

        return usuarioRepository.findById(id);
    }
}
