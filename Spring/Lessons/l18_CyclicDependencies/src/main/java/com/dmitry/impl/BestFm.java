package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BestFm implements Radio {


    @Autowired
    Car Toyota;


    public BestFm(Car toyota) {
        Toyota = toyota;
    }

    public BestFm() {

    }


    public void listenMusic(){
        System.out.println("AA");
    }
}
