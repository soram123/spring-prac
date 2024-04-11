package com.springproject.annotationInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.springproject.annotationInjection");
        context.refresh();

        User user = context.getBean("user", User.class);
        user.print();

        context.close();
    }
}
