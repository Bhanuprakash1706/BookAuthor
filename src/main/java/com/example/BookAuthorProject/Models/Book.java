package com.example.BookAuthorProject.Models;

import com.example.BookAuthorProject.enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn     //here is removed jsonignore because while creating book there should be author
    private Author author;//if you already created author then you can give same details here so that this can override instead of creating new record

}
