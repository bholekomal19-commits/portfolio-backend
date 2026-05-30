package com.tka.ServiceImpl;

import com.tka.Entity.Cart;
import com.tka.Repository.CartRepository;
import com.tka.Service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart addToCart(Cart cart) {

        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCartItems() {

        return cartRepository.findAll();
    }

    @Override
    public Cart getCartItemById(Long id) {

        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart updateCartItem(Long id, Cart cart) {

        Cart existingCart =
                cartRepository.findById(id).orElse(null);

        if (existingCart != null) {

            existingCart.setQuantity(cart.getQuantity());

            return cartRepository.save(existingCart);
        }

        return null;
    }

    @Override
    public void deleteCartItem(Long id) {

        cartRepository.deleteById(id);
    }
}