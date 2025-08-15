package com.gentech.employee.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Integer id;
    private String ename;
    private String emailId;
    private String jobName;
    private double salary;
    private String cityName;
    private String stateName;
    private Date createdAt;
    private Date updatedAt;
}
