package com.example.jpa;

import com.example.ApplicationTests;
import com.example.jpa.repository.MovieRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieRepositoryTest extends ApplicationTests {

    @Autowired
    private MovieRepository movieRepository;
    
    @Test
    public void mariaDbTest() {
        assertThat(movieRepository.findAll()).isNotEmpty();
    }
}
