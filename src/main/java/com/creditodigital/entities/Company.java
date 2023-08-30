package com.creditodigital.entities;

import jakarta.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fantasyName;
    private String cnpj;
    private String servico;

    @OneToOne(mappedBy = "person")
    @JoinColumn(name = "person_id")
    private Person person;
}
