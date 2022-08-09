package com.xiaotu.service;

import com.xiaotu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insert(){
        userDao.insert();
    }

}
