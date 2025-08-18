package com.gentech.employee.repository;

import com.gentech.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends  JpaRepository<Employee, Integer> {
    List<Employee> findByJobName(String name);

    List<Employee> findByCityNameAndStateName(String cityname, String statename);

    // select * from employee where emailId like 'vini%';
    List<Employee> findByEmailIdContaining(String keyword);

    //jpql methods
    @Query("FROM Employee Where jobName=:jobName OR cityName=:cityName")
    List<Employee> getEmployeesByJobNameOrCityName(@Param("jobName") String jobName, @Param("cityName") String cityName);
}

