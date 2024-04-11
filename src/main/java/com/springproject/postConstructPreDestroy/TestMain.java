package com.springproject.postConstructPreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springproject.postConstructPreDestroy");
        Employee emp = context.getBean("employee",Employee.class);
        context.close();
    }
}
