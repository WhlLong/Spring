package com.whl.springdemo;

import com.whl.springdemo.component.ImportBeanDefinitionRegistrarComponent;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition definition = new RootBeanDefinition(ImportBeanDefinitionRegistrarComponent.class);
        registry.registerBeanDefinition("importBeanDefinitionRegistrarComponent", definition);
    }
}
