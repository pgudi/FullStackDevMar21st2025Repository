package com.gentech.springboot_securitydemo1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_myusers")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_roles")
    private String roles; // "ADMIN","USER"

    public MyUser(){

    }

    public MyUser(String userName, String password, String roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public MyUser(Long id, String userName, String password, String roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
