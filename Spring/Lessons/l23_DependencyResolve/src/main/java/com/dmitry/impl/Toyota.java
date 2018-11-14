package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Component
//@Resource
//@Service
@Repository
//@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public  class Toyota implements Car {


    @Autowired
    public  Radio radio;


    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving toyota" );

    }

}
