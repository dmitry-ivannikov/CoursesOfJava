package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Toyota implements Car {


  //  @Value("Dimas ")
   List<String> ownerName;
  //  @Autowired
    Radio radio;




    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }

    @Autowired
    public Toyota(List<String> ownerName, Radio radio) {
        this.ownerName = ownerName;
        this.radio = radio;
    }

//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving by" + ownerName);
    }
}
