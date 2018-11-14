package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.Ferrary;
import com.dmitry.impl.Toyota;
import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Car getCar1(){
        Toyota car = new Toyota();
        car.setRadio(bestFm());
        return car;
    }

    @Bean
    public Car getCar2(){
        Ferrary car = new Ferrary();
        car.setRadio(bestFm());
        return car;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Radio bestFm(){
        return new BestFm();
    }
}
