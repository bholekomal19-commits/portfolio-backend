package com.tka.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Book;

@Repository
public interface BookDao
extends JpaRepository<Book, Long> {

    // Search Book By Title

    List<Book> findByTitle(String title);

    // Search Book By Author

    List<Book> findByAuthor(String author);

    // Search Book By Category

    List<Book> findByCategory(String category);
}