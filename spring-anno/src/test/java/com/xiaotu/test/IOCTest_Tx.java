package com.xiaotu.test;

import com.xiaotu.config.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xiaotu.tx.UserService;

public class IOCTest_Tx {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insert();
    }


}
