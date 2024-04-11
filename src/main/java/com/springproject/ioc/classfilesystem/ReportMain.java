package com.springproject.ioc.classfilesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReportMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classfilesystem.xml");

        Report report = context.getBean("report", Report.class);
        report.getReportDetails();
    }
}
