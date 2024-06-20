package dev.patika.ecommerce.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "book_id", columnDefinition = "serial")
    private int id;
    @Column(name = "book_name", nullable = false)
    private String name;
    @Column(name = "book_publication_year", nullable = false)
    private int publicationYear;
    @Column(name = "book_stock", nullable = false )
    private int stock;

    @ManyToOne
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id",referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name = "book2category",
            joinColumns = {@JoinColumn( name = "book2category_book_id" )},
            inverseJoinColumns = {@JoinColumn( name = "book2category_category_id" )}
    )
    private List<Category> categoryList;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> bookBorrowingList;


}

