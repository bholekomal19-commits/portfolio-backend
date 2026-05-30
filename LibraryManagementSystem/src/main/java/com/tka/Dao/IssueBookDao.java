package com.tka.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.Entity.IssueBook;

@Repository
public interface IssueBookDao
extends JpaRepository<IssueBook, Long> {

    // Find Issued Books By Student Name

    List<IssueBook>
    findByStudentName(String studentName);

    // Find Issued Books By Book Name

    List<IssueBook>
    findByBookName(String bookName);
}