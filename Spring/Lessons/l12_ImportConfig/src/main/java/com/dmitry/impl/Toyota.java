package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Toyota implements Car {


  //  @Value("Dimas ")
   List<String> ownerName;
  //  @Autowired
    Radio radio;




    public void setRadio(Radio radio) {
        this.radio = radio;
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
