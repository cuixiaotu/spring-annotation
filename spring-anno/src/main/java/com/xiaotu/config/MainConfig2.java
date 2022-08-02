package com.xiaotu.config;

import com.xiaotu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {

    @Scope("prototype")
    @Bean
    public Person person(){
        System.out.println("给容器中添加person对象");
        return new Person("theodore",18);
    }
}
