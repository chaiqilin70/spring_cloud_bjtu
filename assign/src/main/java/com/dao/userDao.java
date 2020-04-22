package com.dao;

import com.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<user> getPersonList() {

        List<user> list = jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper(user.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }

    }

    public int addUser(String userName,String userPas) {
        int flag = jdbcTemplate.update("insert into user(userName,UserPas,account) values('" + userName +  "' ,'"+ userPas + "','1000')");
        return flag;
    }

    public int deleteUser(String userName) {
        int flag = jdbcTemplate.update("delete from user where userName ='" + userName + "'");
        return flag;
    }

}
