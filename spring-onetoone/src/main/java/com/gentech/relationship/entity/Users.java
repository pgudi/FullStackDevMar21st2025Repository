package com.gentech.relationship.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "job_name")
    private String jobName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public Users(){

    }
    public Users(Integer id, String userName, String jobName, UserProfile userProfile) {
        this.id = id;
        this.userName = userName;
        this.jobName = jobName;
        this.userProfile = userProfile;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
