package com.tka.Service;

import com.tka.Entity.*;
import com.tka.Dao.*;
import com.tka.Service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartDao cartDao;

    @Autowired
    private UserDao userDao;

    @Override
    public Order placeOrder(int userId) {

        User user = userDao.findById(userId).orElse(null);
        List<Cart> cartItems = cartDao.findByUserId(userId);

        Order order = new Order();
        order.setUser(user);
        order.setStatus("PLACED");

        double total = 0;

        List<OrderItem> orderItems = new ArrayList<>();

        for (Cart c : cartItems) {

            OrderItem item = new OrderItem();
            item.setOrder(order);
            item.setProduct(c.getProduct());
            item.setQuantity(c.getQuantity());
            item.setPrice(c.getProduct().getPrice());

            total += c.getProduct().getPrice() * c.getQuantity();

            orderItems.add(item);
        }

        order.setItems(orderItems); // 🔥 IMPORTANT
        order.setTotalPrice(total);

        orderDao.save(order);

        // clear cart
        cartDao.findByUserId(userId);

        return order;
    }   
    
    @Override
    public void saveOrder(User user, double total) {
        Order order = new Order();
        order.setUser(user);
        order.setTotalPrice(total);
        orderDao.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderDao.findAll();
    }
    
    @Override
    public Order getOrderById(int id) {
        return orderDao.findById(id).orElse(null);
    }
}