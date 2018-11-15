package com.dmitry.aop2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

    @Component
@Aspect
public class MyTransactionAspect {
   // @Before("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void beginTransaction(){
        System.out.println("begin Transaction");
    }
   // @After("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void after(){
        System.out.println("afterMaethod");
    }
   // @AfterReturning("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void commitTransaction(){
        System.out.println("commit Transaction");
    }
   // @AfterThrowing("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void rollback(){
        System.out.println("rollback transaction");
    }
}
