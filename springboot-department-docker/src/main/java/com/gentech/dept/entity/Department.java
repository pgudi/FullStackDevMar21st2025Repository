package com.gentech.dept.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "department_location")
    private String location;

    public Department(){

    }
    public Department(String departmentName, String location) {
        this.departmentName = departmentName;
        this.location = location;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
