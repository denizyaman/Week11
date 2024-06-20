package dev.patika.ecommerce.dto.request.author;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {
    @Positive(message = "ID pozitif olmak zorunda")
    private int id;
    @NotNull(message = "Yazar adı boş olamaz")
    private String name;
    private LocalDate birthday;
    private String country;
}
