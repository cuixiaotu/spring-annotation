package com.xiaotu.config;

import com.xiaotu.bean.Person;
import com.xiaotu.controller.BookController;
import com.xiaotu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//配置类
@ComponentScan(
        value = "com.xiaotu",
        includeFilters = { @Filter( type = FilterType.ANNOTATION,classes = { Service.class } )},
        useDefaultFilters = false
)
@ComponentScan(
        value = "com.xiaotu",
        includeFilters = { @Filter( type = FilterType.ANNOTATION,classes = { Controller.class } )},
        useDefaultFilters = false
)
@Configuration //告诉Spring这事一个配置类
public class MainConfig {

    //给容器注册一个Bean 类型返回值的类型 id默认方法名
    //@Bean("person002")
    @Bean
    public Person person(){
        return new Person("xiaotu2",20);
    }

}
