package com.finalproject.sheeks.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class JeuxDto {
    @NotNull
    @NotEmpty
    @Size(max = 256)
    private long id;

    @NotNull
    @NotEmpty
    @Size(max = 30)
    private String nom;

    public JeuxDto() {
    }

    public JeuxDto(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
