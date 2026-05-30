package com.tka.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.BookDao;
import com.tka.Entity.Book;
import com.tka.Service.BookService;

@Service
public class BookServiceImpl
implements BookService {

    @Autowired
    private BookDao bookDao;

    // Add Book

    @Override
    public Book addBook(Book book) {

        return bookDao.save(book);
    }

    // Get All Books

    @Override
    public List<Book> getAllBooks() {

        return bookDao.findAll();
    }

    // Get Book By Id

    @Override
    public Book getBookById(Long id) {

        return bookDao.findById(id)
                .orElse(null);
    }

    // Update Book

    @Override
    public Book updateBook(Book book) {

        return bookDao.save(book);
    }

    // Delete Book

    @Override
    public void deleteBook(Long id) {

        bookDao.deleteById(id);
    }

    // Search By Title

    @Override
    public List<Book>
    searchBookByTitle(String title) {

        return bookDao.findByTitle(title);
    }

    // Search By Author

    @Override
    public List<Book>
    searchBookByAuthor(String author) {

        return bookDao.findByAuthor(author);
    }

    // Search By Category

    @Override
    public List<Book>
    searchBookByCategory(String category) {

        return bookDao.findByCategory(category);
    }
}