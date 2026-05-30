package com.tka.Service;

import java.util.List;

import com.tka.Entity.Book;

public interface BookService {

    // Add New Book

    Book addBook(Book book);

    // Get All Books

    List<Book> getAllBooks();

    // Get Book By Id

    Book getBookById(Long id);

    // Update Book

    Book updateBook(Book book);

    // Delete Book

    void deleteBook(Long id);

    // Search Book By Title

    List<Book> searchBookByTitle(String title);

    // Search Book By Author

    List<Book> searchBookByAuthor(String author);

    // Search Book By Category

    List<Book> searchBookByCategory(String category);
}