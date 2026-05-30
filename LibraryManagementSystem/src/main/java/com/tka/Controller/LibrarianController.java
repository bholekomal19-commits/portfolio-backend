package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.Entity.Librarian;
import com.tka.Service.LibrarianService;

@Controller
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    // Librarian Login Page

    @GetMapping("/librarianLogin")
    public String librarianLoginPage() {

        return "librarianlogin";
    }

    // Dashboard Page

    @GetMapping("/dashboard")
    public String dashboardPage(Model model) {

        List<Librarian> librarians =
                librarianService.getAllLibrarians();

        model.addAttribute("librarians", librarians);

        return "dashboard";
    }

    // View Librarians

    @GetMapping("/librarians")
    public String getAllLibrarians(Model model) {

        List<Librarian> librarians =
                librarianService.getAllLibrarians();

        model.addAttribute("librarians", librarians);

        return "librarians";
    }
}