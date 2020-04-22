package com.service;

import com.dao.accountDao;
import com.dao.userDao;
import com.entity.user;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class accountService {
    @Autowired
    accountDao accountdao;

    public int changeAccount(int userId,int number) {
        return accountdao.changeAccount(userId,number);
    }


}
