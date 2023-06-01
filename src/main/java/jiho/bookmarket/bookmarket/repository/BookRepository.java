package jiho.bookmarket.bookmarket.repository;

import java.util.List;
import jiho.bookmarket.bookmarket.model.Book;


public interface BookRepository {
    List<Book> getAllBookList();

}
