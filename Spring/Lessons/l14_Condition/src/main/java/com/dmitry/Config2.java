package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.WorstFm;
import com.dmitry.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;

public class Config2 {
    @Bean
    @Profile("default")
    public Radio getRadio(){
        return new BestFm();
    }

    @Bean
    @Conditional(MyCondition.class)
    public Radio getWorstFm(){
        return new WorstFm();
    }
}
