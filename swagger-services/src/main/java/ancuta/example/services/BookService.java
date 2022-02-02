package ancuta.example.services;

import ancuta.example.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> getAllBooks(){

        List<Book> books =  new ArrayList<>();
        books.add(getBook("1"));
        books.add(getBook("2"));
        books.add(getBook("3"));

        return books;
    }

    private Book getBook(String suffix){
        Book b = new Book();
        b.setName("Book-"+suffix);
       //b.setAuthor("Author-"+suffix);
        b.setDescription("This is a book "+suffix);
        return b;

    }


}
