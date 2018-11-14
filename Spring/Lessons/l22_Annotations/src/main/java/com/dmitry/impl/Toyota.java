package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component
//@Resource
//@Service
@Repository
//@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public abstract class Toyota implements Car, ApplicationContextAware {

    @Lookup
    public abstract Radio getRadio();

    ApplicationContext context;

    public void drive() {
        getRadio().listenMusic();
        System.out.println("driving by" );
        System.out.println(new Double(context.getStartupDate()));
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
