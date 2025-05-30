package com.shoyeb.controller;

import com.shoyeb.BookResponse;
import com.shoyeb.dto.BookDto;
import com.shoyeb.service.BookServiceClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {

    private final BookServiceClient bookServiceClient;

    public BookController(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }
    @GetMapping("/{bookTitle}")
    public ResponseEntity<BookDto> getBook(@PathVariable String bookTitle) {
        BookDto bookDto = bookServiceClient.findBookByTitle(bookTitle);
        return ResponseEntity.ok(bookDto);
    }
}
