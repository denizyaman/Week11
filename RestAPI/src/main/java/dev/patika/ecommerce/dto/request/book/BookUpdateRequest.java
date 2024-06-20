package dev.patika.ecommerce.dto.request.book;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {
    @Positive(message = "ID pozitif sayı olmak zorunda")
    private int id;
    @NotNull(message = "İsim boş olamaz")
    private String name;
    private int publicationYear;
    @NotNull(message = "Stok boş olamaz")
    private int stock;
    private int authorId;
    private int publisherId;

}