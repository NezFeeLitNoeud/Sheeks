package com.finalproject.sheeks.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Entity
@Table( name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private Long id;

    @Column(name = "u_pseudo", nullable = false, unique = true, length = 50)
    private String pseudo;

    @Column(name = "u_email",nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "u_password",nullable = false, length = 200)
    private String password;

    @Column(name = "u_gamertag",nullable = false, unique = true, length = 50)
    private String gamertag;

    @Column (name = "u_gender", nullable = false, length = 15)
    private String gender;

    @Column (name = "u_reputation", nullable = false, length = 500)
    private int reputation;

    @Column (name = "u_color", nullable = false, length = 20)
    private String color;

    @OneToOne
    @JoinColumn(name = "u_role", nullable = false)
    private Role roles;

    public User() {
    }

    public User(String pseudo, String email, String password, String gamertag, String gender, int reputation,
                String color, Role roles) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.gamertag = gamertag;
        this.gender = gender;
        this.reputation = reputation;
        this.color = color;
        this.roles = roles;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }
}