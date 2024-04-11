package com.springproject.xml.di.paramSetterComb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrganizationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("paramSetterCombo.xml");
        Organization organization = context.getBean("organization",Organization.class);
        organization.getOrganizationDetails();
    }
}
