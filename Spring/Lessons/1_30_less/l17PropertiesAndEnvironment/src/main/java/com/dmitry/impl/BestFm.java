package com.dmitry.impl;

import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BestFm implements Radio {

    public void listenMusic(){
        System.out.println("AA");
    }
}
