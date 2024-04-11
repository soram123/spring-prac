package com.springproject.postConstructPreDestroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Employee {
    @PostConstruct //after create a bean
    public void initMethod(){
        System.out.println("Initialize the context");
    }

    @PreDestroy  //before destroying the bean
    public void destroyMethod(){
        System.out.println("Destroy the bean");
    }

}
