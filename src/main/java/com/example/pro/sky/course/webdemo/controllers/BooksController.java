package com.example.pro.sky.course.webdemo.controllers;

import com.example.pro.sky.course.webdemo.model.Book;
import com.example.pro.sky.course.webdemo.servise.BookServise;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("books")
public class BooksController {

    private final BookServise bookServise;

    public BooksController(BookServise bookServise) {
        this.bookServise = bookServise;
    }

    @GetMapping("{id}") //
    public ResponseEntity getBookInfo(@PathVariable long id){
        Book book = bookServise.findBook(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }

    @GetMapping
    private ResponseEntity<Collection<Book>> getAllBooks () {
        return ResponseEntity.ok(bookServise.getAllBooks());
    }

      @PostMapping("{id}") //
    public Book createBook(@RequestBody Book book){
        return bookServise.createBook(book);
    }

    @PutMapping
    public ResponseEntity<Book> editBook(@RequestBody Book book){
        Book foundBook = bookServise.editBook(book);
        if (foundBook == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundBook);
    }

 @DeleteMapping("{id}")
    public Book deleteBook(@PathVariable long id){
        return bookServise.deleteBook(id);
    }




}
