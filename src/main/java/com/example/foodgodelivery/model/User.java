package com.example.foodgodelivery.model;


public class User {


    private String idUser;
    private String username;
    private String password;
    private String role;



    public User(
            String idUser,
            String username,
            String password,
            String role
    ){

        this.idUser=idUser;
        this.username=username;
        this.password=password;
        this.role=role;

    }



    public String getIdUser(){
        return idUser;
    }


    public String getUsername(){
        return username;
    }


    public String getPassword(){
        return password;
    }


    public String getRole(){
        return role;
    }


}