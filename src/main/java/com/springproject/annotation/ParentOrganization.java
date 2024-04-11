package com.springproject.annotation;

import org.springframework.stereotype.Service;

@Service("parentOrganization")
public class ParentOrganization {
    private int parentOrgId = 1;
    private String parentOrgName = "IBM";

    public void setParentOrgId(int parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }
    public void getDetailsParentOrg(){
        System.out.println(parentOrgId);
        System.out.println(parentOrgName);
    }
}
