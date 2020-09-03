package com.finalproject.sheeks.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "users")
public class User {

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

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_pseudo"),
            inverseJoinColumns = @JoinColumn(name = "role_name"))
    private List<Role> roles;

    public User() {
    }

    public User(String pseudo, String email, String password, String gamertag, String plateform, Role... roles) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.gamertag = gamertag;
        this.plateform = plateform;
        this.roles = List.of(roles);
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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
