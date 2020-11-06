package com.finalproject.sheeks.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private Long id;

    @Column(name = "u_pseudo", nullable = false, unique = true)
    private String pseudo;

    @Column(name = "u_email",nullable = false, unique = true)
    private String email;

    @Column(name = "u_password",nullable = false)
    private String password;

    @Column(name = "u_gamertag",nullable = false, unique = true)
    private String gamertag;

    @Column(name = "u_plateform",nullable = false)
    private String plateform;

    @OneToOne
    @JoinColumn(name = "u_role")
    private Role roles;

    public User() {
    }

    public User(String pseudo, String email, String password, String gamertag, String plateform, Role roles) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.gamertag = gamertag;
        this.plateform = plateform;
        this.roles = roles;
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

    public String getPlateform() {
        return plateform;
    }

    public void setPlateform(String plateform) {
        this.plateform = plateform;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }
}