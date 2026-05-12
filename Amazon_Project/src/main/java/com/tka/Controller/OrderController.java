package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.tka.Entity.Cart;
import com.tka.Entity.Order;
import com.tka.Entity.User;
import com.tka.Service.CartService;
import com.tka.Service.OrderService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CartService cartService;

    // ✅ Place Order
    @GetMapping("/place")
    public String placeOrder(HttpSession session) {

        User user = (User) session.getAttribute("user");

        orderService.placeOrder(user.getId());  // 🔥 CALL HERE

        return "success";
    }
            // ✅ View Orders
    @GetMapping
    public String viewOrders(Model model) {
        System.out.println("🔥 Orders API Hit");
        model.addAttribute("orders", orderService.getAllOrders());
        return "orders";
    } 
   
    
    @GetMapping("/details/{id}")
    public String orderDetails(@PathVariable int id, Model model) {

        Order order = orderService.getOrderById(id);

        if (order == null) {
            return "redirect:/orders";
        }

        model.addAttribute("order", order);
        model.addAttribute("items", order.getItems());

        return "order-details";
    }    
   }