package com.gentech.serializationdemo;

import java.io.Serializable;

public class Employee implements Serializable {

    public void showFirstName(String name)
    {
        System.out.println("First Name of Employee:"+name);
    }

    public void showCityName(String cityname)
    {
        System.out.println("city Name of Employee:"+cityname);
    }

    public void showJobName(String jobname)
    {
        System.out.println("Job of Employee :"+jobname);
    }

    public void showSalary(int salary)
    {
        System.out.println("Salary of Employee :"+salary);
    }
}
