package com.dmitry.impl;

import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("radio")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BestFm implements Radio {
    @Value("best")
    String name;
    public void listenMusic(){
        System.out.println("AA");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
