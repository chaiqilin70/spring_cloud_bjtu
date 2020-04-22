package com.service;

import com.Dao.SeatDao;
import com.Dao.orderDao;
import com.entity.order_s;
import com.entity.seat;
import com.entity.user;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderService {
    @Autowired
    orderDao orderDao;

    public Integer insertOrder(int userId,int seatId,int price)
    {
        return orderDao.insertOrder(userId,seatId,price);
    }

    public List<order_s> getOrderList()
    {
        return orderDao.getOrderList();
    }

    public int changeIsPay(int userId)
    {
        return orderDao.changeIsPay(userId);
    }


}