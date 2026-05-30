package com.tka.ServiceImpl;

import com.tka.Entity.Order;
import com.tka.Repository.OrderRepository;
import com.tka.Service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order placeOrder(Order order) {

        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {

        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order updateOrder(Long id, Order order) {

        Order existingOrder =
                orderRepository.findById(id).orElse(null);

        if (existingOrder != null) {

            existingOrder.setStatus(order.getStatus());
            existingOrder.setTotalPrice(order.getTotalPrice());

            return orderRepository.save(existingOrder);
        }

        return null;
    }

    @Override
    public void deleteOrder(Long id) {

        orderRepository.deleteById(id);
    }
}