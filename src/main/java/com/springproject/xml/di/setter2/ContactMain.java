package com.springproject.xml.di.setter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");
        Contact contact = context.getBean("contact",Contact.class);
        contact.getContactDetails();
    }

}
