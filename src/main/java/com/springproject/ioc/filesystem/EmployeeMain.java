package com.springproject.ioc.filesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Soram Wanglen\\IdeaProjects\\SpringProject\\src\\main\\resources\\filesystem.xml");

        Employee employee = context.getBean("employee", Employee.class);
        employee.getEmployeeDetails();
    }
}
