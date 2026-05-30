package com.tka.Service;

import com.tka.Entity.Order;

import java.util.List;

public interface OrderService {

    Order placeOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order updateOrder(Long id, Order order);

    void deleteOrder(Long id);
}