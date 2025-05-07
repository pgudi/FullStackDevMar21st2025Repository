package com.gentech.stringdemo;
class Student
{
    String firstName;
    String courseName;
    Student(String firstName,String courseName)
    {
        this.firstName=firstName;
        this.courseName=courseName;
    }

    @Override
    public String toString()
    {
        return "First Name is "+firstName+" and Course is "+courseName;
    }
}

public class StringDemo2 {
    public static void main(String[] args) {
        Student obj=new Student("Santosh","Research");
        System.out.println(obj);
    }
}
