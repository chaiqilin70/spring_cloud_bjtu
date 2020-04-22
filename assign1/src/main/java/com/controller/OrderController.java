package com.controller;

import com.entity.order_s;
import com.entity.user;
import com.service.orderService;
import com.service.seatService;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private userService userService;

    @Autowired
    private seatService seatService;

    @Autowired
    private orderService orderService;

    @GetMapping(value = "order/{userName}/{userPas}/{seatId}")
    public String queryOrderById(@PathVariable String userName, @PathVariable String userPas, @PathVariable String seatId) {

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

        int isorder = seatService.queryIsOrder(Integer.valueOf(seatId));

        int price = seatService.queryPrice(Integer.valueOf(seatId));

        if(isorder==1)
        {
            return "已预定";
        }

        seatService.changeState(Integer.valueOf(seatId));

        orderService.insertOrder(userId,Integer.valueOf(seatId),price);

        return seatService.querySeat(Integer.valueOf(seatId)).get(0).toString() + "预订成功";

    }


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public List<order_s> getOrderList() {
        return orderService.getOrderList();
    }

    @RequestMapping(value = "/pay/{userId}", method = RequestMethod.GET)
    public int changeIsPay(@PathVariable String userId) {
         return orderService.changeIsPay(Integer.valueOf(userId));
    }


}
