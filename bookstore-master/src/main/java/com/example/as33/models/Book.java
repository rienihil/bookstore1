package com.example.as33.models;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private double price;
    private Category category;

    public Book(String title,String author,double price,Category category){
        this.title=title;
        this.author=author;
        this.price=price;
        this.category=category;
    }

    public Book(int id,String title,String author,double price, Category category){
        this.title=title;
        this.author=author;
        this.price=price;
        this.category=category;
        setId(id);
    }
    public enum Category {
        Horror,Romance,Drama,Fantasy
    }
}

