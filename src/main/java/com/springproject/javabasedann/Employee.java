package com.springproject.javabasedann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Employee {
    @Autowired
    private Date date;

    public void print(){
        System.out.println("Date: "+ date);
    }

}
