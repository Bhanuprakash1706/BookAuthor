package com.example.BookAuthorProject.Controller;

import com.example.BookAuthorProject.Models.Author;
import com.example.BookAuthorProject.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    //here this api is used for creating author for future use
    //because while creating book we are also creating author which is more logical
    @PostMapping("/create")
    public ResponseEntity<String> createAuthor(@RequestBody()Author author){
        authorService.addAuthor(author);
        return new ResponseEntity("Successfully Author is created", HttpStatus.CREATED);
    }
    /////////////////////////////////////////////////
    //i skipped DTO's for the sake of simplicity
    @GetMapping("/get/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable("id") int id){
        Author author=authorService.getAuthor(id);
        return new ResponseEntity(author,HttpStatus.ACCEPTED);
    }
}
