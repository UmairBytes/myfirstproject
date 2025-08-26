package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.entity.Book;
import com.mycompany.myfirstproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;

    public List<Book> getMyBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElseThrow();
    }

    public Book createBook(Book body) {
        return bookRepo.save(body); // fixed "Save" -> "save"
    }

    public void deleteBookById(Long id) {
        bookRepo.deleteAllById(Collections.singletonList(id));
    }
}
