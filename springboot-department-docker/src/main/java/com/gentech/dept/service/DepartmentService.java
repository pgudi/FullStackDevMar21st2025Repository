package com.gentech.dept.service;

import com.gentech.dept.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department createDepartment(Department department) throws Exception;
    List<Department> getAllDepartments();
    Department getDepartment(Long id);
    Department modifyDepartment(Long id, Department department);
    void deleteDepartment(Long id);
}
