package com.creditodigital.dtos;

import com.creditodigital.entities.Associated;

public class AssociatedDTO {
    private Long id;
    private double creditDigital;
    private String matriculation;
    public AssociatedDTO(Associated associated){
        id = associated.getId();
        creditDigital = associated.getCreditDigital();
        matriculation = associated.getMatriculation();
        typeAssociated = associated.getTypeAssociated();

    }
    public AssociatedDTO(Long id, double creditDigital, String matriculation, String typeAssociated){
        this.id = id;
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

    private String typeAssociated;

}
