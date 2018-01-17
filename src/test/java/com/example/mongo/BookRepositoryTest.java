package com.example.mongo;

import com.example.ApplicationTests;
import com.example.mongo.domain.Book;
import com.example.mongo.repository.BookRepository;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BookRepositoryTest extends ApplicationTests {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void mongoTest() {
        mongoTemplate.createCollection(Book.class);
        Book comunidadAnillo = new Book();
        comunidadAnillo.setPrice(new BigDecimal(200));
        comunidadAnillo.setTitle("El señor de los anillos: La comunidad del anillo");
        Book dosTorres = new Book();
        dosTorres.setPrice(new BigDecimal(200));
        dosTorres.setTitle("El señor de los anillos: Las dos torres");
        Book retornoRey = new Book();
        retornoRey.setPrice(new BigDecimal(200));
        retornoRey.setTitle("El señor de los anillos: El retorno del rey");
        mongoTemplate.insert(Arrays.asList(comunidadAnillo, dosTorres, retornoRey), Book.class);

        assertThat(bookRepository.findAll()).hasSize(3);
    }

}
