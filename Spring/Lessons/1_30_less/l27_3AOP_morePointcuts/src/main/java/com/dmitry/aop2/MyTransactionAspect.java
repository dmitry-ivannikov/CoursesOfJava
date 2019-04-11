package com.dmitry.aop2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyTransactionAspect {
//    @Pointcut("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
//@Pointcut("execution(public void com.dmitry.aop2.MyUserRepo.getInfo())")
//@Pointcut("execution(* com.dmitry.aop2.*.*fo())")
//    @Pointcut("execution(* com.dmitry.aop2.*.*fo(..))")
//@Pointcut("execution(* com.dmitry.aop2.*.*fo(..)) && execution(* com.dmitry.aop2.*.*())")
//@Pointcut("bean(myUserRepo)")
    //@Pointcut("this(com.dmitry.aop2.MyRepo)")
//@Pointcut("target(com.dmitry.aop2.MyRepo)")
//    @Pointcut("@target(org.springframework.stereotype.Component)")
@Pointcut("@annotation(org.springframework.context.annotation.Primary)")
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
