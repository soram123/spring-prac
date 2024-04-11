package com.springproject.aop.main;

import com.springproject.aop.dao.PassengerDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PassengerManager {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.springproject.aop");
        context.refresh();
        PassengerDao passengerDao = context.getBean("passengerDaoImpl", PassengerDao.class);

        System.out.println(passengerDao.getPassenger(1));
        context.close();
    }
}
