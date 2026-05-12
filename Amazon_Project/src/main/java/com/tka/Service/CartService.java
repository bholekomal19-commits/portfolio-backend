package com.tka.Service;

import com.tka.Entity.Cart;
import java.util.List;

public interface CartService {

    void addToCart(int productId, int userId);

    void deleteCart(int id);

    void increaseQty(int id);

    void decreaseQty(int id);

    List<Cart> getCartByUser(int id);   // ✅ only declaration

    void clearCart(int id);
}