package com.springproject.annotation;

import org.springframework.stereotype.Repository;

@Repository("employee")
public class Employee {
    private int empId=10;
    private String empName="Martin";
    public Employee(){
        System.out.println("Employee constructor");
    }
    public void getEmployeeDetails(){
        System.out.println(empId);
        System.out.println(empName);
    }
}
