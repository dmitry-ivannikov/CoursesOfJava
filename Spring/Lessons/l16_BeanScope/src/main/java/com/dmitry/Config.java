package com.dmitry;

import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;

@Configuration
//@ComponentScan(basePackages = "com.dmitry")//6

//@ImportResource("classpath:config2.xml")
@Import(Config2.class)
public class Config {

    // from xml
    @Bean
    public Car getToyota(@MyRadio  Radio radio) {
        return new Toyota(new ArrayList<String>(), radio);
    }
}


