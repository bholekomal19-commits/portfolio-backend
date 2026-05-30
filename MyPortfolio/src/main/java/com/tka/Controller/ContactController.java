package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.Entity.Contact;
import com.tka.Service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping("/saveContact")
    public String saveContact(Contact contact) {

        service.saveContact(contact);

        return "redirect:/";

    }

}