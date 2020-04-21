package com.whl.springdemo.config;

import com.whl.springdemo.aop.LogAspect;
import com.whl.springdemo.service.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }

    @Bean
    public CalculatorService calculatorService(){
        return new CalculatorService();
    }

}
