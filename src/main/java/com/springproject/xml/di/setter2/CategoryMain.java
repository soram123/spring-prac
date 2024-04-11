package com.springproject.xml.di.setter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CategoryMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");
        Category category = context.getBean("category",Category.class);
        category.getDetailsCategory();
    }
}
