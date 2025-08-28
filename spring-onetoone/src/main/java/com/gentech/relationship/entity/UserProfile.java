package com.gentech.relationship.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_userprofile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_profile_id")
    private Integer id;

    @Column(name = "user_profile_email")
    private String emailId;
    @Column(name = "user_profile_phoneno")
    private String phoneNo;
    @Column(name = "user_profile_salary")
    private Double salary;
    @Column(name = "user_profile_location")
    private String location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Users users;

    public UserProfile(){

    }

    public UserProfile(Integer id, String emailId, String phoneNo, Double salary, String location, Users users) {
        this.id = id;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.location = location;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
