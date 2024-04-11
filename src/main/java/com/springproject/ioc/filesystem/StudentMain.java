package com.springproject.ioc.filesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Soram Wanglen\\IdeaProjects\\SpringProject\\src\\main\\resources\\filesystem.xml");

        Student student = context.getBean("student", Student.class);
        student.getStudentDetails();
    }
}