package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@PropertySource("classpath:my.properties")
public class Toyota implements Car {
   // @Autowired
    Radio radio;

    public Toyota(Radio radio) {
        this.radio = radio;
    }



    public void drive() {
        radio.listenMusic();
        System.out.println("driving by" );
    }
}
