package com.suri.bookstore.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Book {
    @GetMapping("/books")
    public String getBooks() {
        return "Books API!!!";
    }
    
}
