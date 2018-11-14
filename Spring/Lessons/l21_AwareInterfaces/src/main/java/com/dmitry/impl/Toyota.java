package com.dmitry.impl;

import com.dmitry.interfaces.Car;
import com.dmitry.interfaces.Radio;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public abstract class Toyota implements Car, InitializingBean, DisposableBean, BeanPostProcessor {

    public void init(){
        System.out.println("init");
    }


    public void afterPropertiesSet() {
        System.out.println("afterProperties");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    @PostConstruct
    public void postConstict(){
        System.out.println("postConstict");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy");
    }




    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean init");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean post init");
        return bean;
    }

    @Lookup
    public abstract Radio getRadio();

    public void drive() {
        getRadio().listenMusic();
        System.out.println("driving by" );
    }
}
