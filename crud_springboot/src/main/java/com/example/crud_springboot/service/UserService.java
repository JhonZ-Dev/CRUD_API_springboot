package com.example.crud_springboot.service;

import com.example.crud_springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    /*Inyecciones de depencias con AutoWire*/
    @Autowired
    public UsuarioRepository usuarioRepository;
}
