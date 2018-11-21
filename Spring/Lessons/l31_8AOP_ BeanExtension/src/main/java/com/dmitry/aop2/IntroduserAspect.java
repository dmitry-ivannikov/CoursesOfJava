package com.dmitry.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class IntroduserAspect {
//    @DeclareParents(value = "com.dmitry.aop2.MyRepo+", defaultImpl = AditionalJob.class)
    public static NewInterface newInterface;
}
