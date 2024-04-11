package com.springproject.annotationInjection;

import org.springframework.stereotype.Component;

@Component
public class Brezza implements  Vehicle {
@Override
    public void engine(){
    System.out.println("Brezza Engine");
}
}
