package com.example.BookAuthorProject.Repository;

import com.example.BookAuthorProject.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
