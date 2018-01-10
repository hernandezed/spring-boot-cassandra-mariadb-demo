package com.example.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movie {

    @Id
    private Long id;
    private String title;
}
