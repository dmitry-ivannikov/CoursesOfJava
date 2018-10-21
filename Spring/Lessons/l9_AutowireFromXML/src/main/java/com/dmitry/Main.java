package com.dmitry;

import com.dmitry.interfaces.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // ApplicationContext context = new AnnotationConfigApplicationContext(com.Config.class);
        Car bean = context.getBean(Car.class);
        bean.drive();
    }
}
