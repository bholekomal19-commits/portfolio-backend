package com.tka.Controller;

import com.tka.Entity.Order;
import com.tka.Service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

@CrossOrigin("*")

public class OrderController {

    @Autowired
    private OrderService orderService;

    // Place Order
    @PostMapping
    public Order placeOrder(@RequestBody Order order) {

        return orderService.placeOrder(order);
    }

    // Get All Orders
    @GetMapping
    public List<Order> getAllOrders() {

        return orderService.getAllOrders();
    }

    // Get Order By Id
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {

        return orderService.getOrderById(id);
    }

    // Update Order
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id,
                             @RequestBody Order order) {

        return orderService.updateOrder(id, order);
    }

    // Delete Order
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {

        orderService.deleteOrder(id);

        return "Order Deleted Successfully";
    }
}