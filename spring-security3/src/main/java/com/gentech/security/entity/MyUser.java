package com.gentech.security.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_users")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;
    private String password;
    private String roles; // ADMIN,USER

    public MyUser(){

    }

    public MyUser(String userName, String password, String roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public MyUser(Integer id, String userName, String pasword, String roles) {
        this.id = id;
        this.userName = userName;
        this.password = pasword;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
