package com.tka.Controller;

import com.tka.Entity.Cart;
import com.tka.Service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")

@CrossOrigin("*")

public class CartController {

    @Autowired
    private CartService cartService;

    // Add Item To Cart
    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {

        return cartService.addToCart(cart);
    }

    // Get All Cart Items
    @GetMapping
    public List<Cart> getAllCartItems() {

        return cartService.getAllCartItems();
    }

    // Get Cart Item By Id
    @GetMapping("/{id}")
    public Cart getCartItemById(@PathVariable Long id) {

        return cartService.getCartItemById(id);
    }

    // Update Cart Item
    @PutMapping("/{id}")
    public Cart updateCartItem(@PathVariable Long id,
                               @RequestBody Cart cart) {

        return cartService.updateCartItem(id, cart);
    }

    // Remove Cart Item
    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable Long id) {

        cartService.deleteCartItem(id);

        return "Cart Item Removed Successfully";
    }
}