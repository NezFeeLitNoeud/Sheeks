package com.finalproject.sheeks.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "announce")
public class Announce {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "a_user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "a_game_id", nullable = false)
    private Jeux jeux;

    @Column(name = "a_titre", nullable = false)
    private String titre;

    @Column(name = "a_message",nullable = false)
    private String message;

    @Column(name = "a_level",nullable = false)
    private String niveau;

    @Column(name = "a_plateforme",nullable = false)
    private String plateforme;

    @OneToMany(mappedBy = "announce_id", cascade = CascadeType.REMOVE)
    private List<Answer> answers;

    public Announce() {
    }

    public Announce(User user, Jeux jeux, String titre, String message, String niveau, String plateforme) {
        this.user = user;
        this.jeux = jeux;
        this.titre = titre;
        this.message = message;
        this.niveau = niveau;
        this.plateforme = plateforme;
    }

    public Announce(User user, Jeux jeux, String titre, String message, String niveau, String plateforme, List<Answer> answers) {
        this.user = user;
        this.jeux = jeux;
        this.titre = titre;
        this.message = message;
        this.niveau = niveau;
        this.plateforme = plateforme;
        this.answers = answers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Jeux getJeux() {
        return jeux;
    }

    public void setJeux(Jeux jeux) {
        this.jeux = jeux;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getPlateforme() {
        return plateforme;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
