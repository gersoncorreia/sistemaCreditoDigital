package com.creditodigital.entities;

import jakarta.persistence.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
