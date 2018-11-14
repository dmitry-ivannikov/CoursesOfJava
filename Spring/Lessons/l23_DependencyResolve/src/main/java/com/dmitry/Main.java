package com.dmitry;

import com.dmitry.impl.Ferrary;
import com.dmitry.impl.Toyota;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      //for config
        ApplicationContext context = new AnnotationConfigApplicationContext(com.dmitry.AppConfig.class);

        //for xml
      //ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");


        Toyota bean = context.getBean(Toyota.class);
        //bean.drive();
        Ferrary bean2 = context.getBean(Ferrary.class);
        //bean2.drive();
        System.out.println(bean.radio == bean2.radio);
        ((ConfigurableApplicationContext)context).close();
    }
}
