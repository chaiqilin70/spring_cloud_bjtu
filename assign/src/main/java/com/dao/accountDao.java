package com.dao;

import com.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class accountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int changeAccount(int userId,int number) {
        int flag = jdbcTemplate.update("update user set account = account - '" + number + "' where userId = '"+ userId + "'");
        return flag;
    }

}
