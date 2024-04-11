package com.springproject.mail.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mailconfiguration.xml");
        MailConfiguration mail = context.getBean("mail",MailConfiguration.class);
        mail.getEmailConfiguration();
    }
}
