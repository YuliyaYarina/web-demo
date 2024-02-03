package com.example.pro.sky.course.webdemo.controllers;

import com.example.pro.sky.course.webdemo.model.Book;
import com.example.pro.sky.course.webdemo.servise.BookServise;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BooksController {

    private final BookServise bookServise;

    public BooksController(BookServise bookServise) {
        this.bookServise = bookServise;
    }

    @GetMapping("{id}") //
    public Book getBookInfo(@PathVariable long id){
        return bookServise.findBook(id);
    }

      @PostMapping("{id}") //
    public Book createBook(Book book){
        return bookServise.createBook(book);
    }




}
