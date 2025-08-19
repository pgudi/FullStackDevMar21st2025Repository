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

    @GetMapping("/employees/pages")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(@RequestParam int pageNumber,
                                                             @RequestParam int pageSize)
    {
        return new ResponseEntity<>(service.getAllEmployee(pageNumber,pageSize), HttpStatus.OK);
    }

    @GetMapping("/employees/sorting")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(@RequestParam String columnName)
    {
        return new ResponseEntity<>(service.getAllEmployee(columnName), HttpStatus.OK);
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

    @GetMapping("/employees/filterbyjobname")
    public ResponseEntity<List<EmployeeDto>> getEmployeesByJob(@RequestParam String jobname)
    {
        return new ResponseEntity<>(service.getEmplyeeByJobName(jobname), HttpStatus.OK);
    }

    @GetMapping("/employees/filterbycityandstate")
    public ResponseEntity<List<EmployeeDto>> getEmployeesByCityAndState(@RequestParam String city,
                                                                        @RequestParam String state)
    {
        return new ResponseEntity<>(service.getEmplyeesByCityNameAndStateName(city, state), HttpStatus.OK);
    }

    @GetMapping("/employees/emailkeyword")
    public ResponseEntity<List<EmployeeDto>> getEmployeesByEmailLike(@RequestParam String email)
    {
        return new ResponseEntity<>(service.getEmployeesByEmailIdKeyword(email), HttpStatus.OK);
    }

    @GetMapping("/employees/filterbyjobnameorcityname")
    public ResponseEntity<List<EmployeeDto>> getEmplyeesBasedOnJobNameOrCityName(@RequestParam String jobName, @RequestParam String cityName)
    {
        return new ResponseEntity<>(service.getEmployeesByJobNameOrCityName(jobName,cityName), HttpStatus.OK);
    }


    @PutMapping("/employees/update")
    public ResponseEntity<Integer> updateEmployees(@RequestParam String stateName, @RequestParam Integer id)
    {
        return new ResponseEntity<>(service.updateEmployeesByStateName(stateName,id), HttpStatus.OK);
    }
}
