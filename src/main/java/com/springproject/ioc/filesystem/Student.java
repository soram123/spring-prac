package com.springproject.ioc.filesystem;

public class Student {
    private int studentId;
    private String studentName;
    public Student() {
        System.out.println("Default Constructor");
        this.studentId = 1;
        this.studentName = "Alex";
    }

    public void getStudentDetails(){
        System.out.println("Student Id and Name :" + studentId + " : " + studentName);
    }

}
