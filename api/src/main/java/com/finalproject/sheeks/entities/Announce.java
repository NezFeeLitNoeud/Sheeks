package com.finalproject.sheeks.entities;

import javax.persistence.*;

@Entity(name = "annonce")
public class Announce {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    //@ManyToOne
   // @JoinColumn(name = "user_pseudo")
    private String user_pseudo;

    @Column(nullable = false, unique = true)
    private String titre;

    @Column(nullable = false, unique = true)
   //@ManyToOne
    private String Jeux;

    @Column(nullable = false, unique = true)
    private String plateforme;

    @Column(nullable = false, unique = true)
    private String niveau;

    @Column(nullable = false, unique = true)
    private String message;


    public Announce() {
    }

    public Announce(long id, String user, String titre, String jeux, String plateforme, String niveau, String message) {
        this.id = id;
        this.user_pseudo = user;
        this.titre = titre;
        Jeux = jeux;
        this.plateforme = plateforme;
        this.niveau = niveau;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_pseudo() {
        return user_pseudo;
    }

    public void setUser_pseudo(String user_pseudo) {
        this.user_pseudo = user_pseudo;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getJeux() {
        return Jeux;
    }

    public void setJeux(String jeux) {
        Jeux = jeux;
    }

    public String getPlateforme() {
        return plateforme;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
