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
@Table(name = "scategories")
public class Scategorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nomscategorie")
    private String nomscategorie;

    @Column(name = "imagescategorie")
    private String imagescategorie;

    @Column(name = "categorieID")
    private String categorieID;


}