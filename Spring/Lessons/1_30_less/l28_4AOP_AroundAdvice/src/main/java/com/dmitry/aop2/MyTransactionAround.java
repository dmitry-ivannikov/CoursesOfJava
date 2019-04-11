package com.dmitry.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyTransactionAround {
    @Around("execution(* com.dmitry.aop2.MyUserRepo.getInfo())")
    public void aroundTransaction(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("start transaction");

                joinPoint.proceed();
            System.out.println("end");
        }catch (Throwable throwable) {
            System.out.println("Rollback transaction");
        } finally {
            System.out.println("commit");
        }
    }
}
