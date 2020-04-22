package com.service;

import com.Dao.SeatDao;
import com.entity.seat;
import com.entity.user;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class seatService {
    @Autowired
    SeatDao seatDao;

    public Integer queryPrice(int seatId)
    {
        return seatDao.queryPrice(seatId);
    }

    public Integer queryIsOrder(int seatId)
    {
        return seatDao.queryIsOrder(seatId);
    }

    public void changeState(int seatId)
    {
        seatDao.changeState(seatId);
    }

    public List<seat> querySeat(int seatId)
    {
        return seatDao.querySeat(seatId);
    }


}