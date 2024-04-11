package com.springproject.annotationInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
@Component
public class User {
    @Autowired
    Vehicle swift;


    public void print(){
        swift.engine();

    }
}
