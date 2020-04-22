package com.controller;


import com.entity.user;
import com.service.accountService;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    userService personService;

    @Autowired
    accountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<user> getPersonList() {
        return personService.getPersonList();
    }

    @RequestMapping(value = "/add/{userName}/{userPas}", method = RequestMethod.GET)
    public String addUser(@PathVariable String userName, @PathVariable String userPas) {
        int flag = personService.addUser(userName,userPas);
        if(flag==1)
        {
            return "success";
        }
        return "failed";
    }

    @RequestMapping(value = "/delete/{userName}", method = RequestMethod.GET)
    public String addUser(@PathVariable String userName) {
        int flag = personService.deleteUser(userName);
        if(flag==1)
        {
            return "success";
        }
        return "failed";
    }

    @RequestMapping(value = "/pay/{userId}/{number}", method = RequestMethod.GET)
    public String pay(@PathVariable String userId, @PathVariable String number) {
        int flag = accountService.changeAccount(Integer.valueOf(userId),Integer.valueOf(number));
        if(flag==1)
        {
            return "success";
        }
        return "failed";
    }

}
