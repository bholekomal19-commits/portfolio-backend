package com.tka.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Entity.Order;
import java.util.List;

public interface OrderDao extends JpaRepository<Order, Integer> {

    List<Order> findByUser_Id(int userId);
}