package com.service;

import com.dao.userDao;
import com.entity.user;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Autowired
    userDao userdao;

    @Override
    public List<user> getPersonList() {
        return userdao.getPersonList();
    }

    @Override
    public int addUser(String userName, String userPas) {
        return userdao.addUser(userName,userPas);
    }

    @Override
    public int deleteUser(String userName) {
        return userdao.deleteUser(userName);
    }


}