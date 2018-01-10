package com.example.cassandra.repository;

import com.example.ApplicationTests;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerRepositoryTest extends ApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void asd() {
        assertThat(customerRepository.findAll()).isNotEmpty();
    }

}
