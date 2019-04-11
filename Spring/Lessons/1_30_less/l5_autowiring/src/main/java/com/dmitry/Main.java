package com.dmitry;

import com.dmitry.interfaces.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.dmitry.Config.class);
        Car bean = context.getBean(Car.class);
        bean.drive();
    }
}
