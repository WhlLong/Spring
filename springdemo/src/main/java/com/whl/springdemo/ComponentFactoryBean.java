package com.whl.springdemo;

import com.whl.springdemo.component.FactoryBeanComponent;
import org.springframework.beans.factory.FactoryBean;

public class ComponentFactoryBean implements FactoryBean<FactoryBeanComponent> {
    @Override
    public FactoryBeanComponent getObject() throws Exception {
        return new FactoryBeanComponent();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanComponent.class;
    }
}
