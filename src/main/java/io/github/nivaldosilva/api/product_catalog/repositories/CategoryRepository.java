package io.github.nivaldosilva.api.product_catalog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import io.github.nivaldosilva.api.product_catalog.models.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {}
