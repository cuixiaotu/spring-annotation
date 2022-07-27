package com.xiaotu.test;

import com.xiaotu.bean.Person;
import com.xiaotu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person)applicationContext.getBean("person");
//        System.out.println(person);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] name4Type = applicationContext.getBeanNamesForType(Person.class);
        for ( String name:name4Type){
            System.out.println(name);
        }

    }

    @Test
    public void testScan(){
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for ( String name:definitionNames){
            System.out.println(name);
        }
    }

}