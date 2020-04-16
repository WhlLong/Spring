package com.whl.springdemo.controller;

import com.whl.springdemo.component.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private BeanComponent beanComponent;
    @Autowired
    private LazyComponent lazyComponent;
    @Autowired
    private ImportComponent importComponent;
    @Autowired
    private ImportSelectorComponent importSelectorComponent;
    @Autowired
    private ImportBeanDefinitionRegistrarComponent importBeanDefinitionRegistrarComponent;
    @Autowired
    private FactoryBeanComponent factoryBeanComponent;


    @RequestMapping("/helloworld")
    public String hello(){
        beanComponent.sout();
        lazyComponent.sout();
        importComponent.sout();
        importSelectorComponent.sout();
        importBeanDefinitionRegistrarComponent.sout();
        factoryBeanComponent.sout();
        return "Hello World!";
    }

}
