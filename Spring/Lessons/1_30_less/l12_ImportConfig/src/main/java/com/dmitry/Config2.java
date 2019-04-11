package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.interfaces.Radio;
import org.springframework.context.annotation.Bean;

public class Config2 {
    @Bean
    public Radio getRadio(){
        return new BestFm();
    }
}
