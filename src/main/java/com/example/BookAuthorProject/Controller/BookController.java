package com.example.BookAuthorProject.Controller;

import com.example.BookAuthorProject.Models.Book;
import com.example.BookAuthorProject.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/create")
    public ResponseEntity<String> createBook(@RequestBody() Book book){

        bookService.addBook(book);
        return new ResponseEntity("Successfully book is created", HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
        Book book= bookService.getBook(id);
        return  new ResponseEntity(book,HttpStatus.ACCEPTED);
    }
}
