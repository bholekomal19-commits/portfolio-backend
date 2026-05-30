package com.tka.Repository;

import com.tka.Entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepository
        extends JpaRepository<Order, Long> {

}