package com.tka.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tka.Entity.Product;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<Product> findByNameContaining(String name);
    List<Product> findByCategory(String category);
    List<Product> findByPriceBetween(double min, double max);
   
    
    @Query("SELECT p FROM Product p WHERE " +
    	       "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
    	       "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
    	       "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    	List<Product> searchProducts(@Param("keyword") String keyword);
}