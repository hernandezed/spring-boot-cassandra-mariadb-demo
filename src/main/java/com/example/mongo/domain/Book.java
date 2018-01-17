package com.example.mongo.domain;

import java.math.BigDecimal;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
public class Book {

    @Id
    private String id;
    private String title;
    private BigDecimal price;
}
