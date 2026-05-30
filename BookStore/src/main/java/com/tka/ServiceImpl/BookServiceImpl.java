package com.tka.ServiceImpl;

import com.tka.Entity.Book;
import com.tka.Exception.ResourceNotFoundException;
import com.tka.Repository.BookRepository;
import com.tka.Service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    // Add Book
    @Override
    public Book addBook(Book book) {

        return bookRepository.save(book);
    }

    // Get All Books
    @Override
    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    // Get Book By ID
    @Override
    public Book getBookById(Long id) {

        return bookRepository.findById(id)

                .orElseThrow(() ->

                        new ResourceNotFoundException(
                                "Book Not Found"));
    }

    // Update Book
    @Override
    public Book updateBook(Long id, Book book) {

        Book existingBook =
                bookRepository.findById(id)

                        .orElseThrow(() ->

                                new ResourceNotFoundException(
                                        "Book Not Found"));

        existingBook.setTitle(book.getTitle());

        existingBook.setAuthor(book.getAuthor());

        existingBook.setPrice(book.getPrice());

        existingBook.setDescription(
                book.getDescription());

        existingBook.setImageUrl(
                book.getImageUrl());

        existingBook.setCategory(
                book.getCategory());

        return bookRepository.save(existingBook);
    }

    // Delete Book
    @Override
    public void deleteBook(Long id) {

        Book book =
                bookRepository.findById(id)

                        .orElseThrow(() ->

                                new ResourceNotFoundException(
                                        "Book Not Found"));

        bookRepository.delete(book);
    }
}