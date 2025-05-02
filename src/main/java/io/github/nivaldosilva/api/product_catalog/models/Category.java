package io.github.nivaldosilva.api.product_catalog.models;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    private String id;

    @NotBlank(message = "category title is mandatory")
    @Indexed(unique = true)
    private String title;

    @NotBlank(message = "category description is mandatory")
    private String description;

    @Field("owner_id")
    @NotBlank(message = "owner ID is mandatory")
    private String ownerId;

    @CreatedDate
    @Field("creation_date")
    private LocalDateTime creationDate;

    @LastModifiedDate
    @Field("update_date")
    private LocalDateTime updateDate;
}
