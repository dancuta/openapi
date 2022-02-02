package ancuta.example.controllers;

import ancuta.example.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/books/all")
    public ResponseEntity getAllBooks() {

        return ResponseEntity.ok().body(bookService.getAllBooks());
    }
}
