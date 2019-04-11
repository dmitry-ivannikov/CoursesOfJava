package com.dmitry;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dmitry")//6
public class Config {
//    @Bean
//    public Car getToyota() {
//        return new Toyota();
//    }
}
