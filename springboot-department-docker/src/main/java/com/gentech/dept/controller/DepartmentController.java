package com.gentech.dept.controller;

import com.gentech.dept.entity.Department;
import com.gentech.dept.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/department")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) throws Exception {
        Department savedDepartment=departmentService.createDepartment(department);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> displayAllDepartments()
    {
        return new ResponseEntity<>(departmentService.getAllDepartments(),HttpStatus.OK);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id)
    {
        return new ResponseEntity<>(departmentService.getDepartment(id), HttpStatus.OK);
    }

    @PutMapping("/department/edit/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable Long id,
                                                      @RequestBody Department department)
    {
        return new ResponseEntity<>(departmentService.modifyDepartment(id,department), HttpStatus.OK);
    }

    @DeleteMapping("/department/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id)
    {
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>("The Department with id "+id+" has deleted successfully", HttpStatus.OK);
    }
}
