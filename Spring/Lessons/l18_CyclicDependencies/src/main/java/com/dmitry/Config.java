package com.dmitry;

import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Import(Config2.class)
@PropertySource("classpath:my.properties")
public class Config {

    // from xml
    @Autowired
    Environment env;
    @Bean
    public Car getToyota(@MyRadio  Radio radio) {
        return new Toyota(radio);
    }
}


