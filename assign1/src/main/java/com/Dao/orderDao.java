package com.Dao;

import com.entity.order_s;
import com.entity.seat;
import com.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class orderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int insertOrder(int userId,int seatId,int price) {
        int flag = jdbcTemplate.update("insert into order_s values('"+ userId + "','"+ seatId +  "','" + price + "','0')");
        return flag;
    }

    public List<order_s> getOrderList() {
        List<order_s> list = jdbcTemplate.query("select * from order_s", new Object[]{}, new BeanPropertyRowMapper(order_s.class));
        return list;
    }

    public int changeIsPay(int userId)
    {
        int flag = jdbcTemplate.update("update order_s set isPay = '1' where userId = '" + userId + "'");
        return flag;
    }


}