package com.springproject.annotationInjection;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
@Component
public class Fronx implements Vehicle{
    @Override
    public void engine(){
        System.out.println("Fronx Engine");
    }
}
