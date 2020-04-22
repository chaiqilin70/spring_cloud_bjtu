package com.Dao;

import com.entity.seat;
import com.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeatDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer queryPrice(int seatId) {
        Integer s = jdbcTemplate.queryForObject("select price from seat where seatId = '" + seatId + "'",Integer.class);
        return s;
    }

    public Integer queryIsOrder(int seatId) {
        Integer s = jdbcTemplate.queryForObject("select isOrder from seat where seatId = '" + seatId + "'",Integer.class);
        return s;
    }


    public void changeState(int seatId) {
        int flag = jdbcTemplate.update("update seat set isOrder = '1' where seatId = '"+ seatId + "'");
    }

    public List<seat> querySeat(int seatId) {
        List<seat> list = jdbcTemplate.query("select * from seat where seatId = '" + seatId + "'", new Object[]{}, new BeanPropertyRowMapper(seat.class));
        return list;
    }

}
