package com.xiaotu.config;

import com.xiaotu.bean.Person;
import com.xiaotu.controller.BookController;
import com.xiaotu.dao.BookDao;
import com.xiaotu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.type.filter.AspectJTypeFilter;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//配置类
//@ComponentScan(
//        value = "com.xiaotu",
//        includeFilters = { @Filter( type = FilterType.ANNOTATION,classes = { Controller.class } )},
//        useDefaultFilters = false
//)
//@ComponentScan(
//        value = "com.xiaotu",
//        includeFilters = { @Filter( type = FilterType.ASSIGNABLE_TYPE ,classes = {BookService.class} )  },
//        useDefaultFilters = false
//)

//@ComponentScan(
//        value = "com.xiaotu",
//        includeFilters = { @Filter( type = FilterType.ASPECTJ,classes = AspectJTypeFilter.class) },
//        useDefaultFilters = false
//)
//@ComponentScan(
//        value = "com.xiaotu",
//        includeFilters = { @Filter( type = FilterType.REGEX,classes = RegexPatternTypeFilter.class) },
//        useDefaultFilters = false
//)

//@ComponentScan(
//        value = "com.xiaotu",
//        includeFilters = { @Filter( type = FilterType.CUSTOM,classes = MyTypeFilter.class) },
//        useDefaultFilters = false
//)
@ComponentScans(
        //@ComponentScan( value = "com.xiaotu",  includeFilters = { @Filter( type = FilterType.ANNOTATION,classes = { Service.class } )}, useDefaultFilters = false )
        @ComponentScan( value = "com.xiaotu", includeFilters = { @Filter( type = FilterType.CUSTOM,classes = MyTypeFilter.class) }, useDefaultFilters = false )
)
@Configuration //告诉Spring这事一个配置类
public class MainConfig {

    //给容器注册一个Bean 类型返回值的类型 id默认方法名
    //@Bean("person002")
    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("xiaotu2",20);
    }

}
