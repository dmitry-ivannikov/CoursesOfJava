package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
//@Resource
//@Service
@Repository
//@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public  class Toyota implements Car {


    @Autowired
    public  Radio radio;

    //@Value("ddd")
    @Value("#{radio.name}")
    String name;


    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }
    List<String> list;

    public void drive() {
        radio.listenMusic();
        System.out.println("driving toyota by: " + name );
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList(){
        return list;
    }
}
