package dev.patika.ecommerce.dto.request.bookBorrowing;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveRequest {
    @NotNull(message = "Kiralayan kişi ismi boş olamaz")
    private String borrowerName;

    @NotNull(message = "Kiralama tarihi boş olamaz")
    private LocalDate borrowingDate;

    @NotNull(message = "Kitap teslim tarihi boş olamaz")
    private LocalDate returnDate;
    @NotNull(message = "Kitap ID boş olamaz")
    private int bookId;

}
