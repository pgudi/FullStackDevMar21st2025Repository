package com.gentech.student.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "email_id")
    private String emailId;

    @CreationTimestamp
    @Column(name = "created_date")
    private Date createdDate;

    @UpdateTimestamp
    @Column(name = "modified_date")
    private Date modifiedDate;

    public Student(){

    }

    public Student(String firstName, String courseName, String emailId, Date createdDate, Date modifiedDate) {
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Student(String firstName, String courseName, String emailId) {
        this.firstName = firstName;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public Student(Integer studentId, String firstName, String courseName, String emailId, Date createdDate, Date modifiedDate) {
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
