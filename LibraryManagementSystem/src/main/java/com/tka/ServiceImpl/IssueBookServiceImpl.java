package com.tka.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.IssueBookDao;
import com.tka.Entity.IssueBook;
import com.tka.Service.IssueBookService;

@Service
public class IssueBookServiceImpl
implements IssueBookService {

    @Autowired
    private IssueBookDao issueBookDao;

    // Issue Book

    @Override
    public IssueBook issueBook(
            IssueBook issueBook
    ) {

        return issueBookDao.save(issueBook);
    }

    // Get All Issued Books

    @Override
    public List<IssueBook>
    getAllIssuedBooks() {

        return issueBookDao.findAll();
    }

    // Get Issued Book By Id

    @Override
    public IssueBook
    getIssueBookById(Long id) {

        return issueBookDao.findById(id)
                .orElse(null);
    }

    // Return Book

    @Override
    public void returnBook(Long id) {

        issueBookDao.deleteById(id);
    }

    // Search By Student Name

    @Override
    public List<IssueBook>
    getBooksByStudentName(
            String studentName
    ) {

        return issueBookDao
                .findByStudentName(studentName);
    }

    // Search By Book Name

    @Override
    public List<IssueBook>
    getBooksByBookName(
            String bookName
    ) {

        return issueBookDao
                .findByBookName(bookName);
    }
}