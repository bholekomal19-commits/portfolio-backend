package com.tka.Service;

import com.tka.Entity.Order;
import com.tka.Entity.User;

import java.util.List;

public interface OrderService {

    Order placeOrder(int userId);


    void saveOrder(User user, double total);
    List<Order> getAllOrders();


	Order getOrderById(int id);
	
}