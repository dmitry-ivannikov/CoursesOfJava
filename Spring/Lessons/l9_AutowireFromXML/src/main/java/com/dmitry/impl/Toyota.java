package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;

//@Component
public class Toyota implements Car {

 //   @Autowired
    Radio radio;

    public Toyota(){}

    public Toyota(Radio radio) {
        this.radio = radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving");
    }
}
