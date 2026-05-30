package com.tka.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.Entity.Book;
import com.tka.Service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

        // View All Books
    @GetMapping("/books")
    public String booksPage(Model model) {

        List<Book> books = bookService.getAllBooks();

        model.addAttribute("books", books);

        return "books";
    }
    // Add Book Page
    @GetMapping("/addBook")
    public String addBookPage() {

        return "addbook";
    }

    // Save Book
    @PostMapping("/saveBook")
    public String saveBook(

            @RequestParam String title,
            @RequestParam String author,
            @RequestParam String category,
            @RequestParam double price,
            @RequestParam int quantity,
            @RequestParam String image

    ) {

        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setCategory(category);
        book.setPrice(price);
        book.setQuantity(quantity);
        book.setImage(image);

        bookService.addBook(book);

        return "redirect:/books";
    }
    @GetMapping("/deleteBook")
    public String deleteBook(@RequestParam Long id){

        bookService.deleteBook(id);

        return "redirect:/books";
    }
}