package com.tka.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.LibrarianDao;
import com.tka.Entity.Librarian;
import com.tka.Service.LibrarianService;

@Service
public class LibrarianServiceImpl
implements LibrarianService {

    @Autowired
    private LibrarianDao librarianDao;

    // Add Librarian

    @Override
    public Librarian addLibrarian(
            Librarian librarian
    ) {

        return librarianDao.save(librarian);
    }

    // Get All Librarians

    @Override
    public List<Librarian>
    getAllLibrarians() {

        return librarianDao.findAll();
    }

    // Get Librarian By Id

    @Override
    public Librarian
    getLibrarianById(Long id) {

        return librarianDao.findById(id)
                .orElse(null);
    }

    // Update Librarian

    @Override
    public Librarian
    updateLibrarian(
            Librarian librarian
    ) {

        return librarianDao.save(librarian);
    }

    // Delete Librarian

    @Override
    public void deleteLibrarian(
            Long id
    ) {

        librarianDao.deleteById(id);
    }

    // Login Validation

    @Override
    public Librarian login(
            String username,
            String password
    ) {

        return librarianDao
                .findByUsernameAndPassword(
                        username,
                        password
                );
    }
}