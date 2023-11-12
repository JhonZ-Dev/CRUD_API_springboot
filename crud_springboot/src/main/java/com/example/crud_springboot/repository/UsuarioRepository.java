package com.example.crud_springboot.repository;

import com.example.crud_springboot.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UserModel, Long> {
}
