package dev.patika.ecommerce.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book_borrowings")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "borrowing_id", columnDefinition = "serial")
    private int id;
    @Column(name = "borrower_name")
    private String borrowerName;
    @Column(name = "borrowing_date")
    private LocalDate borrowingDate;
    @Column(name = "return_date")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn (name = "borrowing_book_id", referencedColumnName = "book_id")
    private Book book;


}
