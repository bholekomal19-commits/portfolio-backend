package com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Entity.Contact;
import com.tka.Repository.ContactRepo;

@Service
public class ContactService {

    @Autowired
    private ContactRepo repository;

    public Contact saveContact(Contact contact) {

        return repository.save(contact);

    }

    public List<Contact> getAllContacts() {

        return repository.findAll();

    }
    public void deleteContact(int id) {

        repository.deleteById((long) id);

    }

}