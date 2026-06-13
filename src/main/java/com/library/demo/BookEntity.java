package com.library.demo;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class BookEntity {
    Long id;
    String name;
    Integer pages;

    public BookEntity(Long id, String name, Integer pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

}
