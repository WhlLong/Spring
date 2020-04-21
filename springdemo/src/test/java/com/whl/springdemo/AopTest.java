package com.whl.springdemo;

import com.whl.springdemo.config.AopConfig;
import com.whl.springdemo.service.CalculatorService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    @Test
    public void aopTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        CalculatorService calculatorService = context.getBean(CalculatorService.class);
        calculatorService.calculator(2,4);
        context.close();
    }
}
