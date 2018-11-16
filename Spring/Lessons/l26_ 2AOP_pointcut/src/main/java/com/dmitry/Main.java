package com.dmitry;

import com.dmitry.impl.Toyota;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      //for config
       // ApplicationContext context = new AnnotationConfigApplicationContext(com.Config.class);

        //for xml
      ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");

        Toyota bean = context.getBean(Toyota.class);
        bean.drive();

//        ExpressionParser parser = new SpelExpressionParser();
//        Expression exp = parser.parseExpression("'hello wld'");
//        String message = (String) exp.getValue();
//        System.out.println(message);


        //((ConfigurableApplicationContext)context).close();
    }
}
