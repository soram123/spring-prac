package com.springproject.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springproject.annotation");

        Organization org = (Organization) context.getBean("organization");
        org.getOrgDetails();

        Employee employee = (Employee) context.getBean("employee");
        employee.getEmployeeDetails();

        ParentOrganization parentOrg = (ParentOrganization) context.getBean("parentOrganization");
        parentOrg.getDetailsParentOrg();
    }
}
