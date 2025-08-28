package com.mycompany.myfirstproject.controller.java;

import com.mycompany.myfirstproject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) { this.bookService = bookService; }

    @GetMapping
    public ResponseEntity<List<Book>>getAllBooks(){
        List<Book> books = bookService.getMyBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book>getSpecificBook(@PathVariable Long id){
        Book retrivedBook = bookService.getBookById(id);
        return ResponseEntity.ok(retrivedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book>getDeleteBook(@PathVariable Long id){
         bookService.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Book>createNewBook(@RequestBody Book body){
        Book book = bookService.createBook(body);
        return ResponseEntity.ok(book);
    }

}
