package com.controller;

import com.entity.order_s;
import com.entity.user;
import com.service.orderService;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PayController {
    @Autowired
    private userService userService;

    @Autowired
    private orderService orderService;

    @GetMapping(value = "pay/{userName}/{userPas}")
    public String queryOrderById(@PathVariable String userName, @PathVariable String userPas) {

        boolean flag = false;
        String id = "";
        List<user> users = this.userService.queryUser();
        for(user temp:users)
        {
            if(temp.getUserName().equals(userName) && temp.getUserPas().equals(userPas))
            {
                flag = true;
                id = temp.getUserId();
            }
        }

        if(flag == false)
        {
            return "账号密码错误";
        }

        int userId = Integer.valueOf(id);

        List<order_s> orders = this.orderService.queryOrder();

        StringBuffer MyOrder = new StringBuffer();

        for(order_s temp:orders)
        {
            if(temp.getUserId() == userId)
            {
                MyOrder.append(temp.toString());
            }
        }

        return MyOrder.toString();

    }


    @GetMapping(value = "pay/{userName}/{userPas}/true")
    public String changeAccount(@PathVariable String userName, @PathVariable String userPas) {

        boolean flag = false;
        String id = "";
        int account = 0;
        List<user> users = this.userService.queryUser();
        for(user temp:users)
        {
            if(temp.getUserName().equals(userName) && temp.getUserPas().equals(userPas))
            {
                flag = true;
                id = temp.getUserId();
                account = Integer.valueOf(temp.getAccount());
            }
        }

        if(flag == false)
        {
            return "账号密码错误";
        }

        int userId = Integer.valueOf(id);

        List<order_s> orders = this.orderService.queryOrder();

        int number= 0;

        for(order_s temp:orders)
        {
            if(temp.getUserId() == userId && temp.getIsPay() == 0)
            {
                number = number + temp.getPrice();
            }
        }

        if(number>account)
        {
            return "余额不足";
        }

        this.userService.changeAccount(userId,number);

        this.orderService.changeIsPay(userId);

        return "支付成功";

    }
}
