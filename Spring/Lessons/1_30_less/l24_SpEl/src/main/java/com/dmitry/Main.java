package com.dmitry;

import com.dmitry.impl.Ferrary;
import com.dmitry.impl.Toyota;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
      //for config
       // ApplicationContext context = new AnnotationConfigApplicationContext(com.dmitry.Config.class);

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
