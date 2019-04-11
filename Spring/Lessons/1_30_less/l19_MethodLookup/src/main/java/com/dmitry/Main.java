package com.dmitry;

import com.dmitry.impl.Toyota;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      //for config
        //ApplicationContext context = new AnnotationConfigApplicationContext(com.dmitry.Config.class);

        //for xml
      ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");


        Toyota bean = context.getBean(Toyota.class);
        bean.drive();

        System.out.println("ints");
        System.out.println(bean.getRadio()== bean.getRadio());
        //System.out.println(bean.getRadio() == bean2.getRadio());
        bean.drive();
    }
}
