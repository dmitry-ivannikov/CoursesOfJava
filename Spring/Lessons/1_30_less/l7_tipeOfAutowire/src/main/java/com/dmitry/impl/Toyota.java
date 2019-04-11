package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {

    Radio radio;
/*
//    by field
    @Autowired
    public Toyota(){}
*/

/*//by constuctor

    public Toyota(){}

    @Autowired
    public Toyota(Radio radio) {
        this.radio = radio;
    }*/

//by set

    @Autowired
    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving");
    }
}
