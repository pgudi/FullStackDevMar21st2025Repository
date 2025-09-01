package com.gentech.student.dto;

import java.util.Date;

public class StudentDto {
    private Integer studentId;
    private String firstName;
    private String courseName;
    private String emailId;
    private Date createdDate;
    private Date modifiedDate;

    public StudentDto(){

    }

    public StudentDto(String firstName, String courseName, String emailId, Date createdDate, Date modifiedDate) {
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public StudentDto(String firstName, String courseName, String emailId) {
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public StudentDto(Integer studentId, String firstName, String courseName, String emailId, Date createdDate, Date modifiedDate) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
