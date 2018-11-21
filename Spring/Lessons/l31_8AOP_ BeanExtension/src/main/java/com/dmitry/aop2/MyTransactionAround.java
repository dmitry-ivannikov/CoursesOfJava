package com.dmitry.aop2;

//@Aspect
//@Component
//public class MyTransactionAround {
//    @Around("execution(* com.MyUserRepo.getInfo())")
//    public void aroundTransaction(ProceedingJoinPoint joinPoint){
//        try {
//            System.out.println("start transaction");
//
//                joinPoint.proceed();
//            System.out.println("end");
//        }catch (Throwable throwable) {
//            System.out.println("Rollback transaction");
//        } finally {
//            System.out.println("commit");
//        }
//    }
//}
