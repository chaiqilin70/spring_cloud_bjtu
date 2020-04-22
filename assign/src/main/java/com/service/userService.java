package com.service;

import com.entity.user;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;


public interface  userService {
    List<user> getPersonList();
    int addUser(String userName,String userPas);
    int deleteUser(String userName);
}
