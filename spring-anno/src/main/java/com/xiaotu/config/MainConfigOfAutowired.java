package com.xiaotu.config;


import com.xiaotu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.xiaotu.service","com.xiaotu.controller","com.xiaotu.dao"})
@Configuration
public class MainConfigOfAutowired {

    @Bean
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

}
