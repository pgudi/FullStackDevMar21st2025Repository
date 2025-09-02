package com.gentech.dept.aop;

import com.gentech.dept.entity.Department;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;


@Aspect
@Component
public class DepartmentAOP {

    @Before(value = "execution(* com.gentech.dept.controller.DepartmentController.*(..))")
    public void beforeControllerLayer(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Result API HTTP for Method in controller class "+joinPoint.getSignature()+" has started at :"+new Date());
    }

    @After(value = "execution(* com.gentech.dept.controller.DepartmentController.*(..))")
    public void afterControllerLayer(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Result API HTTP for Method in controller class "+joinPoint.getSignature()+" has ended at :"+new Date());
    }

    @Before(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
    public void beforeServiceImplLayer(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Business Logic for Method in SertiveImpl class "+joinPoint.getSignature()+" has started at :"+new Date());
    }

    @After(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
    public void afterServiceImplLayer(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Business Logic for Method in SertiveImpl class "+joinPoint.getSignature()+" has ended at :"+new Date());
    }

    @AfterReturning(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))", returning = "department")
    public void beforeServiceImplAfterReturningLayer(JoinPoint joinPoint, Department department)
    {
        System.out.println("The Execution of Service Layer Method in SertiveImpl class "+joinPoint.getSignature()+" has executed successfully with department Id :"+department.getId());
    }

    @AfterThrowing(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))" , throwing = "exception")
    public void afterServiceImplAferThrowingLayer(JoinPoint joinPoint, Exception exception)
    {
        System.out.println("The Execution of Service Layer Method in SertiveImpl class "+joinPoint.getSignature()+" has provided Exception for the Business rule Faillure at :"+exception.getMessage());
    }
}
