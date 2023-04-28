package com.example.demo.productProblem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String manufacturer;
    private String detail;
    private String category;
    private String expireDate;

    public Product(String name, String manufacturer, String detail, String category, String expireDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.detail = detail;
        this.category = category;
        this.expireDate = expireDate;
    }
}