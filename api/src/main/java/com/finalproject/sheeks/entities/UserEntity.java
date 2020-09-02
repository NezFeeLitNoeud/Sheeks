package com.finalproject.sheeks.entities;

import javax.persistence.*;

@Entity
@Table( name = "users")
public class UserEntity {

    @Id
    private String pseudo;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String gamertag;

    @Column(nullable = false)
    private String plateform;

    public UserEntity() {
    }

    public UserEntity(String pseudo, String email, String password, String gamertag, String plateform) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.gamertag = gamertag;
        this.plateform = plateform;
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

    @Override
    public String toString() {
        return "UserEntity{" +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", password= ********'" + '\'' +
                ", gamertag='" + gamertag + '\'' +
                ", plateform='" + plateform + '\'' +
                '}';
    }
}
