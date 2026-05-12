package com.tka.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Entity.OrderItem;
import java.util.List;

public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {

    List<OrderItem> findByOrder_Id(int orderId);
}