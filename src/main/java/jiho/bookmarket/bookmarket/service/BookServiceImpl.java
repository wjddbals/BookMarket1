package jiho.bookmarket.bookmarket.service;

import jiho.bookmarket.bookmarket.model.Book;
import jiho.bookmarket.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBookList(){
        return bookRepository.getAllBookList();
    }
}



