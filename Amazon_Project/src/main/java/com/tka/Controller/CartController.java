package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.tka.Entity.Cart;
import com.tka.Entity.User;
import com.tka.Service.CartService;

import jakarta.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // ✅ View Cart
    @GetMapping
    public String viewCart(HttpSession session, Model model) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        List<Cart> cartList = cartService.getCartByUser(user.getId());

        if (cartList == null) {
            cartList = new ArrayList<>();
        }

        model.addAttribute("cartList", cartList);

        return "cart";
    }

    // ✅ Add to cart
    @GetMapping("/add/{pid}")
    public String addToCart(@PathVariable int pid, HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        cartService.addToCart(pid, user.getId());

        return "redirect:/products";
    }

    // ✅ Bill page
    @GetMapping("/bill")
    public String bill(HttpSession session, Model model) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        List<Cart> cartList = cartService.getCartByUser(user.getId());

        if (cartList == null) {
            cartList = new ArrayList<>();
        }

        double total = 0;

        for (Cart c : cartList) {
            total += c.getProduct().getPrice() * c.getQuantity();
        }

        model.addAttribute("items", cartList);
        model.addAttribute("total", total);

        return "bill";
    }

    // ✅ Delete item
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {

        cartService.deleteCart(id);
        return "redirect:/cart";
    }

    // ✅ Increase qty
    @GetMapping("/increase/{id}")
    public String increase(@PathVariable int id) {
        cartService.increaseQty(id);
        return "redirect:/cart";
    }

    // ✅ Decrease qty
    @GetMapping("/decrease/{id}")
    public String decrease(@PathVariable int id) {
        cartService.decreaseQty(id);
        return "redirect:/cart";
    }
}