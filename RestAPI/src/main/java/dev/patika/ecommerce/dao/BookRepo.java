package dev.patika.ecommerce.dao;

import dev.patika.ecommerce.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
