# Project Introduction
A Microservice System for Ticket Booking Based On SpringCloud.

## 1.Set up the project
Maven is used to manage the project and Spring Boot is used as the main framework for our project.Spring Boot is the most popular open source framework available at [https://start.spring.io/](https://start.spring.io/) where you can easily pick and choose which modules you need.
Here is a brief overview of some of the microservices we use:
### assign
User microservice: Client can add and delete account using the service.
### assign1
Ticket order microservice: All tickets are numbered individually. Existing users can place
orders upon a specific ticket upon its availability.
### assgin2
Simple payment microservice: Clients make payment upon their order.
### center
Server using the eureka registry, manages various microservices.Form a service cluster with center1 to keep watch on each other.
### center1
Server using the eureka registry, manages various microservices.Form a service cluster with center to keep watch on each other.
### gateway
An API gateway for path rewriting to enhance security.

------------------------------------------------
# 项目简介
基于SpringCloud的微服务机票预定系统。

## 1.搭建框架
使用Maven来管理项目，并使用Spring Boot作为我们项目的主体框架。
Spring Boot是目前最流行的开源框架，在[https://start.spring.io/](https://start.spring.io/)
上你可以轻松的挑选自己需要的模块。填写好GroupId和ArtifactId（ArtifactId使用spring_cloud_bjtu）之后，下载到本地，用
你自己的IDE打开pom.xml文件，待pom.xml文件解析下载完毕后，我们的项目框架就搭建好了。
下面简单介绍一下我们使用到的几个微服务：
### assign
assign是用户微服务，客户端可以使用服务添加和删除账户，查看用户情况。
### assign1
assign1是机票订购微服务，飞机的所有座位单独编号，现有用户可以根据其可用性对特定的票进行订购。
### assgin2
assgin2是简单支付微服务，客户按订单支付，查看是否购买成功。
### center
center是服务端，利用eureka注册中心，来管理各种微服务。与center1形成服务集群，互相守望。
### center1
center是服务端，利用eureka注册中心，来管理各种微服务。与center形成服务集群，互相守望。
### gateway
gateway是一个API网关，用以进行路径重写，加强安全性。
