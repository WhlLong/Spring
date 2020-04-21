package com.whl.springdemo.service;

import org.springframework.stereotype.Service;

/**
 *
 */
public class CalculatorService {

    public int calculator(int a, int b) {
        System.out.println("service biz code ========");
        return a + b;
    }

}
