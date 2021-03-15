package com.finalproject.sheeks.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {
    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String pseudo;

    @NotNull
    @NotEmpty
    @Email
    @Size(max = 50)
    private String email;

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String password;

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String gamertag;

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String gender;


    public UserDto() {
    }

    public UserDto(String pseudo, String email, String password, String gamertag, String gender) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.gamertag = gamertag;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String plateform) {
        this.gender = plateform;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gamertag='" + gamertag + '\'' +
                ", plateform='" + gender + '\'' +
                '}';
    }
}
