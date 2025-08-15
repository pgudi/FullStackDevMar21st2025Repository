package com.gentech.dept.service;

import com.gentech.dept.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department createDeaprtment(Department department);

    List<Department> getAllDepartments();

    Department getDepartment(Integer id);

    Department updateDepartment(Integer id, Department department);

    void deleteDepartment(Integer id);
}