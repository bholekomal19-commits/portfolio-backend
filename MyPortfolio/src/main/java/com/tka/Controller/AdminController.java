package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.Entity.Contact;
import com.tka.Service.ContactService;

@Controller
public class AdminController {

    @Autowired
    private ContactService service;

    @GetMapping("/admin")
    public String adminPage(Model model) {

        List<Contact> contacts = service.getAllContacts();

        model.addAttribute("contacts", contacts);

        return "admin";
    }

    @GetMapping("/delete/{id}")
    public String deleteContact(@PathVariable int id) {

        service.deleteContact(id);

        return "redirect:/admin";
    }

}