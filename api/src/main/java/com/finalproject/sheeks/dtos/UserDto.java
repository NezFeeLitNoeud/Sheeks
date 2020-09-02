package com.finalproject.sheeks.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {
    @NotNull
    @NotEmpty
    @Size(max = 256)
    private String pseudo;

    @NotNull
    @NotEmpty
    @Email
    @Size(max = 256)
    private String email;

    @NotNull
    @NotEmpty
    @Size(max = 256)
    private String password;

    @NotNull
    @NotEmpty
    @Size(max = 256)
    private String gamertag;

    @NotNull
    @NotEmpty
    @Size(max = 256)
    private String plateform;


    public UserDto() {
    }

    public UserDto(String pseudo, String email, String password, String gamertag, String plateform) {
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
        return "UserDto{" +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gamertag='" + gamertag + '\'' +
                ", plateform='" + plateform + '\'' +
                '}';
    }
}
