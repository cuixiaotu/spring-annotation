package com.xiaotu.test;

import com.xiaotu.aop.MathCalculator;
import com.xiaotu.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Aop {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        MathCalculator calculator = applicationContext.getBean(MathCalculator.class);
        System.out.println(calculator.div(18,2));

        applicationContext.close();
    }
}
