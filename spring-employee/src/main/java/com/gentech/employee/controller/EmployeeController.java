package com.gentech.employee.controller;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(service.createEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> getSpecificEmployee(@PathVariable("id") Integer employeeId)
    {
        return new ResponseEntity<>(service.getEmployee(employeeId), HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees()
    {
        return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.OK);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable Integer id,
                                                      @RequestBody EmployeeDto employeeDto)
    {
       return new ResponseEntity<>(service.updateEmployee(id,employeeDto), HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer id)
    {
        service.deleteEmployee(id);
        return  new ResponseEntity<>("The Employee with id "+id+" has deleted successfullly!!",HttpStatus.OK);
    }
}
