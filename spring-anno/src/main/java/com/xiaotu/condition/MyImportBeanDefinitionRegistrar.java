package com.xiaotu.condition;

import com.xiaotu.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata : 当前类的注解信息
     * BeanDefinitionRegistry : BeanDefinition注册类
     *
     * 我们可以通过调用BeanDefinitionRegistry接口中的registerBeanDefinition方法，
     * 手动注册所有需要添加到容器中的bean
     * */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition1 = registry.containsBeanDefinition("com.xiaotu.bean.Blue");
        boolean definition2 = registry.containsBeanDefinition("com.xiaotu.bean.Red");
        if (definition1 && definition2){
            // 指定bean的定义信息,包括bean的类型、作用域等
            // RootBeanDefinition是BeanDefinition的一个实现类
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            // 注册一个bean,并指定bean的名称
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
