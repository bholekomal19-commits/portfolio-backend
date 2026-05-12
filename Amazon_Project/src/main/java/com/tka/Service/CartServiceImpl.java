package com.tka.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.CartDao;
import com.tka.Dao.ProductDao;
import com.tka.Dao.UserDao;
import com.tka.Entity.Cart;
import com.tka.Entity.Product;
import com.tka.Entity.User;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private UserDao userDao;

    // ✅ Add to Cart
    @Override
    public void addToCart(int productId, int userId) {

        Cart existing = cartDao.findByUserIdAndProductId(userId, productId);

        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + 1);
            existing.setPrice(existing.getProduct().getPrice());
            cartDao.save(existing);
        } else {
            Product product = productDao.findById(productId).orElse(null);
            User user = userDao.findById(userId).orElse(null);

            if (product != null && user != null) {
                Cart cart = new Cart();
                cart.setProduct(product);
                cart.setUser(user);
                cart.setQuantity(1);
                cart.setPrice(product.getPrice());

                cartDao.save(cart);
            }
        }
    }

    // ✅ View Cart by User
    @Override
    public List<Cart> getCartByUser(int userId) {
        List<Cart> list = cartDao.findByUserId(userId);
        return list != null ? list : new ArrayList<>();
    }

    // ✅ Delete Single Item
    @Override
    public void deleteCart(int id) {
        cartDao.deleteById(id);
    }

    // ✅ Increase Quantity
    @Override
    public void increaseQty(int id) {
        Cart c = cartDao.findById(id).orElse(null);
        if (c != null) {
            c.setQuantity(c.getQuantity() + 1);
            cartDao.save(c);
        }
    }

    // ✅ Decrease Quantity
    @Override
    public void decreaseQty(int id) {
        Cart c = cartDao.findById(id).orElse(null);
        if (c != null && c.getQuantity() > 1) {
            c.setQuantity(c.getQuantity() - 1);
            cartDao.save(c);
        }
    }

    // ✅ Clear Full Cart (after order)
    @Override
    public void clearCart(int userId) {
        cartDao.deleteById(userId);
    }
}