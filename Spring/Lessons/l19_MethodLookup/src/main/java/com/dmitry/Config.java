package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

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


