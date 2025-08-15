package com.gentech.employee.mapper;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee)
    {
        EmployeeDto employeeDto=new EmployeeDto(
             employee.getId(),
                employee.getEname(),
                employee.getEmailId(),
                employee.getJobName(),
                employee.getSalary(),
                employee.getCityName(),
                employee.getStateName(),
                employee.getCreatedAt(),
                employee.getUpdatedAt()
        );
        return employeeDto;
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto)
    {
        Employee employee=new Employee(
                employeeDto.getId(),
                employeeDto.getEname(),
                employeeDto.getEmailId(),
                employeeDto.getJobName(),
                employeeDto.getSalary(),
                employeeDto.getCityName(),
                employeeDto.getStateName(),
                employeeDto.getCreatedAt(),
                employeeDto.getUpdatedAt()
        );
        return employee;
    }
}
