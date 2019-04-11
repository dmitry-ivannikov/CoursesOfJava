package com.dmitry.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(com.dmitry.aop2.MyConf.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:aspconf.xml");
        MyRepo bean = context.getBean(MyRepo.class);
//        bean.getInfo();
        System.out.println("______________");
        bean.withParams("Sam");
    }
}
