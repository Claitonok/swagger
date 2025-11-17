package com.example.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swagger.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{

}


