package com.gentech.dept.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_no")
    private Integer id;

    @Column(name = "department_name")
    private String dname;

    @Column(name = "department_location")
    private String loc;

    public Department(){

    }
    public Department(Integer id, String dname, String loc) {
        this.id = id;
        this.dname = dname;
        this.loc = loc;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Integer getId() {
        return id;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }
}
