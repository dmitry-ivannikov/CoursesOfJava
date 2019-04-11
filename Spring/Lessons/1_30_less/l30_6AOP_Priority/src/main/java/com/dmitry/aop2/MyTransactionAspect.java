package com.dmitry.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(1)
public class MyTransactionAspect implements Ordered {

    @Pointcut("execution(* com.dmitry.aop2.MyUserRepo.withParams(String)) && args(name)")
    public void paramPointCut(String name){}


    @Before("paramPointCut(name)")
    public void beforeMethodWithParams(String name){
        System.out.println("entered" + name);
    }


    @Pointcut("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
   public void myPointCut(){}
//@Before("myPointCut()")
public void beginTransaction(){
    System.out.println("begin Transaction");
}
//@After("myPointCut()")
public void after(){
    System.out.println("afterMaethod");
}
//@AfterReturning("myPointCut()")
public void commitTransaction(){
    System.out.println("commit Transaction");
}
//@AfterThrowing("myPointCut()")
public void rollback(){
    System.out.println("rollback transaction");
}

    public int getOrder() {
        return 1;
    }
}
