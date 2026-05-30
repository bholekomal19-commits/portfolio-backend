package com.tka.Repository;

import com.tka.Entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository
        extends JpaRepository<Category, Long> {

}