package dev.patika.ecommerce.dto.response.book;

import dev.patika.ecommerce.entities.Author;
import dev.patika.ecommerce.entities.Category;
import dev.patika.ecommerce.entities.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private int id;
    private String name;
    private int publicationYear;
    private int stock;

    private int authorId;
    private int publisherId;
    private List<Category> categoryList;
}
