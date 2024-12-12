package com.thisispawann.springexample.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
//        Car myCar = context.getBean("myCar", Car.class); // this line and below line are same.
        Car myCar = (Car) context.getBean("myCar"); // casting
        myCar.displayDetails();
    }
}
