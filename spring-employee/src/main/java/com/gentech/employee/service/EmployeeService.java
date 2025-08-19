package com.gentech.employee.service;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployee(Integer id);

    List<EmployeeDto> getAllEmployee();

    List<EmployeeDto> getAllEmployee(int pageNumber, int pageSize);

    List<EmployeeDto> getAllEmployee(String columnName);

    EmployeeDto updateEmployee(Integer id, EmployeeDto employeeDto);

    void deleteEmployee(Integer employeeId);

    List<EmployeeDto> getEmplyeeByJobName(String name);

    List<EmployeeDto> getEmplyeesByCityNameAndStateName(String city,String state);

    List<EmployeeDto> getEmployeesByEmailIdKeyword(String emailKeyword);

    List<EmployeeDto> getEmployeesByJobNameOrCityName( String jobName, String cityName);

    int updateEmployeesByStateName( String stateName, Integer id);
}
