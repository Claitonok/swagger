package com.example.swagger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// CRIA PARA MIM OS MEUS GET SET DOS MEUS METODOS!!
import lombok.Data;

@Entity//ELE FAZ COM OQUE A CLASSE SEJA ULTILIZADA PARA CRIAR A TABELA NO BANCO DE DADOS
@Data
public class Usuario {

    //#region
    @Id //VAI TRANSFORMAR O ID EM PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.AUTO) //serve para dizer que o id sera auto_increment
    
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    //#endregion
    
}
