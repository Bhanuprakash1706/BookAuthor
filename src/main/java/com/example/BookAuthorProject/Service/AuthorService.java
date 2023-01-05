package com.example.BookAuthorProject.Service;

import com.example.BookAuthorProject.Models.Author;
import com.example.BookAuthorProject.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    public Author getAuthor(int id) {
        return authorRepository.findById(id).get();
    }
}
