package com.gentech.relationship.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentName;
    private String studentEmail;
    private String studentLocation;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "students_courses",
            joinColumns = {@JoinColumn(name = "student_student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_course_id")})
    Set<Courses> courses=new HashSet<>();

    public Students(){

    }

    public Students(String studentName, String studentEmail, String studentLocation) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentLocation = studentLocation;
    }

    public Students(Integer id, String studentName, String studentEmail, String studentLocation, Set<Courses> courses) {
        this.id = id;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentLocation = studentLocation;
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    public Set<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Set<Courses> courses) {
        this.courses = courses;
    }
}
