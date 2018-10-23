package com.dmitry;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.concurrent.locks.Condition;

public class MyCondition implements org.springframework.context.annotation.Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getActiveProfiles().length > 0;
    }
}
