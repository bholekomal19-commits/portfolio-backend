package com.tka.Service;

import java.util.List;

import com.tka.Entity.IssueBook;

public interface IssueBookService {

    // Issue Book

    IssueBook issueBook(IssueBook issueBook);

    // Get All Issued Books

    List<IssueBook> getAllIssuedBooks();

    // Get Issued Book By Id

    IssueBook getIssueBookById(Long id);

    // Return Book

    void returnBook(Long id);

    // Search By Student Name

    List<IssueBook>
    getBooksByStudentName(String studentName);

    // Search By Book Name

    List<IssueBook>
    getBooksByBookName(String bookName);
}