package com.dmitry.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(0)
public class NewAspect implements Ordered {
    @Before("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void before(){
        System.out.println("new Ass");
    }

    public int getOrder() {
        return 2;
    }
}
