package com.creditodigital.entities;

import jakarta.persistence.*;

@Entity
public class Associated {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double creditDigital;
    private String matriculation;
    private String typeAssociated;

    @OneToOne()
    @JoinColumn(name = "photo_id")
    private Photo photo;

    @OneToOne()
    @JoinColumn(name = "person_id")
    private Person person;

    public Associated() {
    }

    public Associated(double creditDigital, String matriculation, String typeAssociated) {
        this.creditDigital = creditDigital;
        this.matriculation = matriculation;
        this.typeAssociated = typeAssociated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCreditDigital() {
        return creditDigital;
    }

    public void setCreditDigital(double creditDigital) {
        this.creditDigital = creditDigital;
    }

    public String getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }

    public String getTypeAssociated() {
        return typeAssociated;
    }

    public void setTypeAssociated(String typeAssociated) {
        this.typeAssociated = typeAssociated;
    }
}
