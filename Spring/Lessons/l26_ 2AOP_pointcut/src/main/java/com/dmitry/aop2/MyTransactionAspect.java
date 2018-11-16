package com.dmitry.aop2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyTransactionAspect {
    @Pointcut("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void myPointCut(){}
@Before("myPointCut()")
public void beginTransaction(){
    System.out.println("begin Transaction");
}
@After("myPointCut()")
public void after(){
    System.out.println("afterMaethod");
}
@AfterReturning("myPointCut()")
public void commitTransaction(){
    System.out.println("commit Transaction");
}
@AfterThrowing("myPointCut()")
public void rollback(){
    System.out.println("rollback transaction");
}
}
