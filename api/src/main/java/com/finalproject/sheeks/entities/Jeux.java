package com.finalproject.sheeks.entities;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Jeux {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long id;

    @Column(name = "g_name", nullable = false, unique = true)
    private String nom;

    @Column(name = "g_type", nullable = false, unique = true)
    private String type;

    public Jeux() {
    }

    public Jeux(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
