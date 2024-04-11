package com.springproject.xml.di.paramSetterComb;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private String employeeGender;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }
    public void getDetailsEmployee(){
        System.out.println("from Employee >>");
        System.out.println(employeeId);
        System.out.println(employeeAge);
        System.out.println(employeeGender);
        System.out.println(employeeName);
    }
}
