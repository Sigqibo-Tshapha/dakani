package com.logitech.domain.product;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    String id;

    String name;


    @Embedded
    Dimensions dimensions;

    public Product() {

    }
}
