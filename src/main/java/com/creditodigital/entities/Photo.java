package com.creditodigital.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bucketPhotos;

    public Photo() {
    }

    public Photo(String name, String bucketPhotos) {
        this.name = name;
        this.bucketPhotos = bucketPhotos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBucketPhotos() {
        return bucketPhotos;
    }

    public void setBucketPhotos(String bucketPhotos) {
        this.bucketPhotos = bucketPhotos;
    }
}
