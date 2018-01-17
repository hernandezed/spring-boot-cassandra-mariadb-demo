package com.example.cassandra;

import com.example.ApplicationTests;
import com.example.cassandra.repository.CustomerRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerRepositoryTest extends ApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void cassandraTest() {
        assertThat(customerRepository.findAll()).isNotEmpty();
    }

}
