package com.whl.springdemo.controller;

import com.whl.springdemo.service.CalculatorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/aop")
public class AopController {

    private CalculatorService calculatorService;

    @Inject
    public AopController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @RequestMapping("/cal/{a}/{b}")
    public int aop(@PathVariable("a") int a, @PathVariable("b") int b) {
        return calculatorService.calculator(a,b);
    }

}
