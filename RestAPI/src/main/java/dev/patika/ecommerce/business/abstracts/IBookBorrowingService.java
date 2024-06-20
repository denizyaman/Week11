package dev.patika.ecommerce.business.abstracts;

import dev.patika.ecommerce.entities.BookBorrowing;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IBookBorrowingService{
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing get(int id);
    BookBorrowing update(BookBorrowing bookBorrowing);
    boolean delete(int id);
    Page<BookBorrowing> cursor(int page, int pageSize);

}
