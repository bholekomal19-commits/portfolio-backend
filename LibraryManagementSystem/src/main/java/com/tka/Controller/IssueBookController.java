package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.Entity.IssueBook;
import com.tka.Service.IssueBookService;

@Controller
public class IssueBookController {

    @Autowired
    private IssueBookService issueBookService;

    @GetMapping("/issueBook")
    public String issueBookPage(Model model) {

        List<IssueBook> issueBooks =
                issueBookService.getAllIssuedBooks();

        model.addAttribute("issueBooks", issueBooks);

        return "issuebook";
    }

    @PostMapping("/saveIssueBook")
    public String saveIssueBook(

            @RequestParam String studentName,
            @RequestParam String department,
            @RequestParam String bookName,
            @RequestParam String issueDay,
            @RequestParam String issueDate,
            @RequestParam String returnDate

    ) {
    	boolean valid = false;

    	if(department.equalsIgnoreCase("Information Technology") 
    	        && issueDay.equalsIgnoreCase("Thursday")) {

    	    valid = true;
    	}

    	else if(department.equalsIgnoreCase("Mathematics") 
    	        && issueDay.equalsIgnoreCase("Friday")) {

    	    valid = true;
    	}

    	else if(department.equalsIgnoreCase("Chemistry") 
    	        && issueDay.equalsIgnoreCase("Saturday")) {

    	    valid = true;
    	}

    	if(!valid) {

    	    return "redirect:/issueBook?error=invalidday";
    	}

        IssueBook issueBook = new IssueBook();

        issueBook.setStudentName(studentName);
        issueBook.setDepartment(department);
        issueBook.setBookName(bookName);
        issueBook.setIssueDay(issueDay);
        issueBook.setIssueDate(issueDate);
        issueBook.setReturnDate(returnDate);

        issueBookService.issueBook(issueBook);

        return "redirect:/issueBook";
    }

    @GetMapping("/returnBook")
    public String returnBook(@RequestParam Long id) {

        issueBookService.returnBook(id);

        return "redirect:/issueBook";
    }
}