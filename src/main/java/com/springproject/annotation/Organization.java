package com.springproject.annotation;

import org.springframework.stereotype.Component;

@Component("organization")
public class Organization {
    private String OrgName="Wipro";
    private String ceoName="Azim";
    private int established = 2002;

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public void setEstablished(int established) {
        this.established = established;
    }
    public void getOrgDetails(){
        System.out.println(OrgName);
        System.out.println(ceoName);
    }
}
