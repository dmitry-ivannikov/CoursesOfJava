package com.dmitry;

import com.dmitry.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      //for config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
        context.register(Config.class);
        context.refresh();

//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        context.load("classpath*:config.xml");
//        context.refresh();

        Car bean = context.getBean(Car.class);
        bean.drive();
    }
}
