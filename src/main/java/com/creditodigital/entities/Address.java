package com.creditodigital.entities;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String district;
    private String street;

    @OneToOne
    private Country country;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Address() {
    }

    public Address(String address, String district, String street, Country country, Person person) {
        this.address = address;
        this.district = district;
        this.street = street;
        this.country = country;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
