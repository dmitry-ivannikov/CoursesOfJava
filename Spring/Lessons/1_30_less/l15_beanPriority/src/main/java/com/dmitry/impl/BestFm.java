package com.dmitry.impl;

import com.dmitry.interfaces.Radio;
import org.springframework.stereotype.Component;

@Component
public class BestFm implements Radio {

    public void listenMusic(){
        System.out.println("AA");
    }
}
