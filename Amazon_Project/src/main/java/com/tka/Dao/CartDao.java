package com.tka.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tka.Entity.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {

    // ✅ Spring आपोआप implement करेल
    List<Cart> findByUserId(int userId);

    Cart findByUserIdAndProductId(int userId, int productId);
}