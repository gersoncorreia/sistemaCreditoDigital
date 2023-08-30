package com.creditodigital.entities;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String email;
    private String password;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Associated associated;

    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
