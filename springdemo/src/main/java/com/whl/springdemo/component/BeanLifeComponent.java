package com.whl.springdemo.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BeanLifeComponent implements InitializingBean, DisposableBean, BeanPostProcessor, ApplicationContextAware {


    public void sout() {
        System.out.println("BeanLifeComponent sout...");
    }

    //3
    public void initMethod() {
        System.out.println("BeanLifeComponent.initMethod....");
    }

    //8
    public void destoryMethod() {
        System.out.println("BeanLifeComponent.destoryMethod....");
    }

    //2
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeComponent.afterPropertiesSet....");
    }

    //7
    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeComponent.destroy....");
    }

    //6
    @PreDestroy
    public void preDestroy() {
        System.out.println("BeanLifeComponent.PreDestroy....");
    }

    //1
    @PostConstruct
    public void postConstruct() {
        System.out.println("BeanLifeComponent.PostConstruct....");
    }

    //4
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanLifeComponent.postProcessBeforeInitialization....");
        return bean;
    }

    //5
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanLifeComponent.postProcessAfterInitialization....");
        return bean;
    }

    //0
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BeanLifeComponent.setApplicationContext....");
    }
}
