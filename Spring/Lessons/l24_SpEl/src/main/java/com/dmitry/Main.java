package com.dmitry;

import com.dmitry.impl.Ferrary;
import com.dmitry.impl.Toyota;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      //for config
        ApplicationContext context = new AnnotationConfigApplicationContext(com.dmitry.Config.class);

        //for xml
      //ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");


        Toyota bean = context.getBean(Toyota.class);
        bean.drive();


        ((ConfigurableApplicationContext)context).close();
    }
}
