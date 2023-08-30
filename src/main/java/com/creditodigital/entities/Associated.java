package com.creditodigital.entities;

import jakarta.persistence.*;

@Entity
public class Associated {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double creditoDigital;
    private String matriculation;
    private String typeAssociated;

    @OneToOne(mappedBy = "photo")
    @JoinColumn(name = "photo_id")
    private Photo photo;

    @OneToOne(mappedBy = "person")
    @JoinColumn(name = "person_id")
    private Person person;
}
