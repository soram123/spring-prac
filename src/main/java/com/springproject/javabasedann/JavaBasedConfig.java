package com.springproject.javabasedann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaBasedConfig {
    @Bean(name = "date")
    public Date getDate(){
        Date date = new Date();
        return date;
    }

}
