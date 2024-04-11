package com.springproject.xml.di.paramSetterComb;

public class Organization {
    private int orgId;
    private String orgName;
    private Employee employee;

    public Organization(int orgId, String orgName, Employee employee) {
        this.orgId = orgId;
        this.orgName = orgName;
        this.employee = employee;
    }

    public void getOrganizationDetails(){
        System.out.println("from Organization");
        System.out.println(orgId+" "+orgName);
        employee.getDetailsEmployee();
    }
}
