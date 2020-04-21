package com.whl.springdemo.config;

import com.whl.springdemo.component.BeanComponent;
import com.whl.springdemo.component.BeanLifeComponent;
import com.whl.springdemo.component.ImportComponent;
import com.whl.springdemo.component.LazyComponent;
import com.whl.springdemo.condition.WhlCondition;
import org.springframework.context.annotation.*;

@Configuration
@Conditional({WhlCondition.class})
@Import({ImportComponent.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class ComponentRegistrationConfig {

    @Bean
    public BeanComponent beanComponent() {
        return new BeanComponent();
    }

    @Bean
    @Lazy
    public LazyComponent lazyComponent() {
        return new LazyComponent();
    }

    @Bean
    public ComponentFactoryBean componentFactoryBean(){
        return new ComponentFactoryBean();
    }

    @Bean(initMethod = "initMethod",destroyMethod = "destoryMethod")
    public BeanLifeComponent beanLifeComponent(){
        return new BeanLifeComponent();
    }

}
