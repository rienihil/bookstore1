package com.example.as33.validation;

import com.example.as33.models.Book;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class BookValidator {
    public boolean validateBook(Book book) {
        return book != null && StringUtils.hasText(book.getTitle()) && book.getAuthor() != null;
    }
}
