package com.example.BookAuthorProject.Service;

import com.example.BookAuthorProject.Models.Book;
import com.example.BookAuthorProject.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBook(int id) {
        return bookRepository.findById(id).get();
    }
}
