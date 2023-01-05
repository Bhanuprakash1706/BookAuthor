package com.example.BookAuthorProject.Repository;

import com.example.BookAuthorProject.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
