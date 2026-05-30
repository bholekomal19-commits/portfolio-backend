package com.tka.Service;

import java.util.List;

import com.tka.Entity.Librarian;

public interface LibrarianService {

    // Add Librarian

    Librarian addLibrarian(
            Librarian librarian
    );

    // Get All Librarians

    List<Librarian> getAllLibrarians();

    // Get Librarian By Id

    Librarian getLibrarianById(
            Long id
    );

    // Update Librarian

    Librarian updateLibrarian(
            Librarian librarian
    );

    // Delete Librarian

    void deleteLibrarian(
            Long id
    );

    // Login Validation

    Librarian login(
            String username,
            String password
    );
}