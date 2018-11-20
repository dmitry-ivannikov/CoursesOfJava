package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Ferrary implements Car {
    @Autowired
    public Radio radio;


    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving ferrary" );

    }
}
