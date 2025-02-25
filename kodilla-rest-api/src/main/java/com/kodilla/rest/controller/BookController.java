package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping                                         // [1]
    public void addBook(@RequestBody BookDto bookDto) {  // [2]
        bookService.addBook(bookDto);
    }

    @DeleteMapping
    public ResponseEntity<String> removeBook(@RequestBody BookDto book) {
        boolean removed = bookService.removeBook(book);
        if (removed) {
            return ResponseEntity.ok("Book removed successfully");
        } else {
            return ResponseEntity.status(404).body("Book not found");
        }
    }
}