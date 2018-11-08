package com.dmitry;

import com.dmitry.impl.BestFm;
import com.dmitry.impl.Toyota;
import com.dmitry.impl.WorstFm;
import com.dmitry.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class Config2 {
    @Bean
    //@Profile("default")
    @Primary
    @MyRadio
    public Radio getRadio(){
        return new BestFm();
    }

    @Bean
   // @Primary
    //@Conditional(MyCondition.class)
    public Radio getWorstFm(){
        return new WorstFm();
    }
}
