package com.xiaotu.test;

import com.xiaotu.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_PropertyValue {


    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev","test");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }

}
