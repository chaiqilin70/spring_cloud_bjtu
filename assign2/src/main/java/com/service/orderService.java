package com.service;

import com.entity.order_s;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class orderService {

    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;


    public List queryOrder() {

        // 该方法走eureka注册中心调用(去注册中心根据app-item查找服务，这种方式必须先开启负载均衡@LoadBalanced)
        String itemUrl = "http://TicketManager/order";
        order_s[] temp = restTemplate.getForObject(itemUrl,order_s[].class);
        List<order_s> result = Arrays.asList(temp);
        return result;
    }

    public int changeIsPay(int userId) {
        // 该方法走eureka注册中心调用(去注册中心根据app-item查找服务，这种方式必须先开启负载均衡@LoadBalanced)
        String itemUrl = "http://TicketManager/pay/" + userId;
        int temp = restTemplate.getForObject(itemUrl,Integer.class);
        return temp;
    }
}