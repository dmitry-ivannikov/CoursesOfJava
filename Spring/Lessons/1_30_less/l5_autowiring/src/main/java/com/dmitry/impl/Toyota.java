package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {

    @Autowired
    Radio radio;
    public Toyota(){}

    public void drive() {
        radio.listenMusic();
        System.out.println("driving");
    }
}
