package com.springproject.xml.di.parameterizeConstructor;

public class Student {
    private int studentId;
    private String studentName;
    private Marks mark;

    public Student(int studentId, String studentName, Marks mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }
    public void getDetailsStudent(){
        System.out.println("from student >>");
        System.out.println(studentId);
        System.out.println(studentName);
        mark.getContructorMarks();
    }
}
