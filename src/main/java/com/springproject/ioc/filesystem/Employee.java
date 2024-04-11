package com.springproject.ioc.filesystem;

public class Employee {
    //instance variables 2
    //default constructor
    //create instance method and print the values
    private int employeeId;
    private String employeeName;
    public Employee() {
        System.out.println("Default Constructor");
        this.employeeId = 1;
        this.employeeName = "Varad";
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Id and Name :" + employeeId + " : " + employeeName);
    }

}
