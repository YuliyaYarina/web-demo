package com.example.pro.sky.course.webdemo.servise;

import com.example.pro.sky.course.webdemo.model.Book;
import com.example.pro.sky.course.webdemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class BookServise {

    private final BookRepository bookRepository;

    public BookServise(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findBook (long id) {
        return bookRepository.findById(id).get();
    }

    public Book editBook (Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook (long id) {
         bookRepository.deleteById(id);
    }


    public Collection<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
