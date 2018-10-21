package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dmitry")//6
public class Config {

/*// from xml
    @Bean
    public Car getToyota(Radio radio) {
        Toyota toyota = new Toyota(radio);
        toyota.setOwnerName("D..I.");
        return toyota;
    }

    @Bean
    public Radio getRadio(){
        return new BestFm();
    }*/
}
