package com.springproject.ioc.filesystem;

public class Statement {
    private int accountId;
    private String accountName;
    public Statement() {
        System.out.println("Default Constructor");
        this.accountId = 1;
        this.accountName = "Hilton";
    }
    public void getStatementDetails(){
        System.out.println("Employee Id and Name :" + accountId + " : " + accountName);
    }
}
