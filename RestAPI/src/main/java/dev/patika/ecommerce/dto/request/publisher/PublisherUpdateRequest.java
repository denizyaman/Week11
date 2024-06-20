package dev.patika.ecommerce.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherUpdateRequest {
    @Positive(message = "ID pozitif olmak zorunda")
    private int id;
    private String name;
    private int establishmentYear;
    private String address;
}
