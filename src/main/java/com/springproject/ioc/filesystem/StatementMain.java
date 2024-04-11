package com.springproject.ioc.filesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StatementMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Soram Wanglen\\IdeaProjects\\SpringProject\\src\\main\\resources\\filesystem.xml");

        Statement statement = context.getBean("statement", Statement.class);
        statement.getStatementDetails();
    }
}
