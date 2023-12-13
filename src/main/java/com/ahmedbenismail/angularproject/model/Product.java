package com.ahmedbenismail.angularproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "reference")
    private String reference;

    @Column(name = "designation")
    private String designation;

    @Column(name = "imageart")
    private String imageart;

    @Column(name = "marque")
    private String marque;

    @Column(name = "prix")
    private double prix;

    @Column(name = "qtestock")
    private int qtestock;

    @Column(name = "scategorieID")
    private String scategorieID;
}