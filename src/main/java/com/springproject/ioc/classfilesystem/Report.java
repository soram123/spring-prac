package com.springproject.ioc.classfilesystem;

public class Report {
    private int reportId;
    private String reportName;
    public Report() {
        System.out.println("Default Constructor");
        this.reportId = 1;
        this.reportName = "Soram";
    }
    public void getReportDetails(){
        System.out.println("Report Id and Name :" + reportId + " : " + reportName);
    }
}
