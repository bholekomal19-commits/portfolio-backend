package com.tka.Controller;

import com.tka.Entity.Book;
import com.tka.Service.BookService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/books")

@CrossOrigin(origins = "http://localhost:5173")

public class BookController {

    @Autowired
    private BookService bookService;

    // Add Book
    @PostMapping
    public Book addBook(
            @RequestBody Book book) {

        return bookService.addBook(book);
    }

    // Get All Books
    @GetMapping
    public List<Book> getAllBooks() {

        return bookService.getAllBooks();
    }

    // Get Book By Id
    @GetMapping("/{id}")
    public Book getBookById(
            @PathVariable Long id) {

        return bookService.getBookById(id);
    }

    // Update Book
    @PutMapping("/{id}")
    public Book updateBook(
            @PathVariable Long id,
            @RequestBody Book book) {

        return bookService.updateBook(id, book);
    }

    // Delete Book
    @DeleteMapping("/{id}")
    public String deleteBook(
            @PathVariable Long id) {

        bookService.deleteBook(id);

        return "Book Deleted Successfully";
    }
}