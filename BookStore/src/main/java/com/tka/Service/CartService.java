package com.tka.Service;

import com.tka.Entity.Cart;

import java.util.List;

public interface CartService {

    Cart addToCart(Cart cart);

    List<Cart> getAllCartItems();

    Cart getCartItemById(Long id);

    Cart updateCartItem(Long id, Cart cart);

    void deleteCartItem(Long id);
}