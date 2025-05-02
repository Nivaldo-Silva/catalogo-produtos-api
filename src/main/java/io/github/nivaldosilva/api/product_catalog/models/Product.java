package io.github.nivaldosilva.api.product_catalog.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String id;

    @NotBlank(message = "The product name is mandatory")
    private String name;

    @NotBlank(message = "The product description is mandatory")
    private String description;

    @NotNull(message = "The product price is mandatory")
    @Positive(message = "The price must be greater than zero")
    private BigDecimal price;

    @Field("owner_id")
    @NotBlank(message = "The owner ID is mandatory")
    private String ownerId;

    private Category category;

    @CreatedDate
    @Field("creation_date")
    private LocalDateTime creationDate;

    @LastModifiedDate
    @Field("update_date")
    private LocalDateTime updateDate;

    private boolean active = true;
}
