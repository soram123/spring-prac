package com.springproject.annotation.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springproject.annotation.properties");
        MailConfiguration configuration = context.getBean("mailConfiguration", MailConfiguration.class);
        configuration.getEmailConfiguration();
    }
}
