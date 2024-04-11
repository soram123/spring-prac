package com.springproject.annotationInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class Swift implements Vehicle{
    @Override
    public void engine(){
        System.out.println("Swift Engine");
    }
}
