package com.whl.springdemo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WhlCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("server.port");
        if(property.contains("1000")){
            return true;
        }
        return false;
    }
}
