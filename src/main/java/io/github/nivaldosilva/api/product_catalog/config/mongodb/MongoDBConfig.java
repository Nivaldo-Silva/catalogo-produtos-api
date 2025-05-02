package io.github.nivaldosilva.api.product_catalog.config.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import io.github.nivaldosilva.api.product_catalog.models.Category;
import io.github.nivaldosilva.api.product_catalog.models.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDBConfig {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void initializeCollections() {
        if (!mongoTemplate.collectionExists(Product.class)) {
            mongoTemplate.createCollection(Product.class);
            System.out.println("Collection 'products' created successfully!");
        }

        if (!mongoTemplate.collectionExists(Category.class)) {
            mongoTemplate.createCollection(Category.class);
            System.out.println("Collection 'categories' created successfully!");
        }
    }

}
