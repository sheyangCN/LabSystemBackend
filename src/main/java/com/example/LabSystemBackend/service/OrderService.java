package com.example.LabSystemBackend.service;

import com.example.LabSystemBackend.entity.Order;

import java.util.List;

public interface OrderService {
    //获取此用户的所有orders
    List<Order> getUserOrders(int userId);

    //获取此用户的active orders
    List<Order> getUserActiveOrders(int userId);

    //删除order
    Order deleteOrder(int orderId);

    //获取此用户的 past orders
    List<Order> getUserPastOrders(int userId);

    //提交一个 order
    Order submitOrder(int userId, String item, int amount, String link);

    //获取所有的 active orders
    List<Order> getAllActiveOrders();

    //同意 order
    Order confirmOrder(int orderId);

    //拒绝 order
    Order rejectOrder(int orderId);//拒绝订单后订单直接在数据库里清除
}