package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(Config2.class)
@PropertySource("classpath:my.properties")
public class Config {



    @Bean
    public Car getCar(){return new Toyota() {
        @Override
        public Radio getRadio() {
            return new BestFm();
        }
        };
    }



}


