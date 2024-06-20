package dev.patika.ecommerce.dao;

import dev.patika.ecommerce.entities.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowingRepo extends JpaRepository<BookBorrowing, Integer> {
}
