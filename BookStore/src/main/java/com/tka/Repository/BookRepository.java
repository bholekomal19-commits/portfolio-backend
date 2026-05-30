package com.tka.Repository;

import com.tka.Entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepository
        extends JpaRepository<Book, Long> {

}