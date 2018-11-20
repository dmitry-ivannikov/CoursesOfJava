package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.WorstFm;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


public class Config2 {
    @Bean
    @Primary
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Radio getRadio(){
        return new BestFm();
    }

    @Bean
   // @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Radio getWorstFm(){
        return new WorstFm();
    }
}
