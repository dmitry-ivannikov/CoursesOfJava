package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.dmitry")//6
public class Config {
/*    @Bean
    public Car getToyota() {
        return new Toyota(getRadio());
    }*/

//or
    @Bean
    public Car getToyota(Radio radio) {
        return new Toyota(radio);
    }

    @Bean
    public Radio getRadio(){
        return new BestFm();
    }
}
