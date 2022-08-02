package com.xiaotu.config;

import com.xiaotu.bean.Color;
import com.xiaotu.bean.ColorFactoryBean;
import com.xiaotu.bean.Person;
import com.xiaotu.bean.Red;
import com.xiaotu.condition.MyImportBeanDefinitionRegistrar;
import com.xiaotu.condition.MyImportSelector;
import org.springframework.context.annotation.*;

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    @Lazy
    //@Scope("prototype")
    @Bean
    public Person person(){
        System.out.println("给容器中添加person对象");
        return new Person("theodore",18);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
