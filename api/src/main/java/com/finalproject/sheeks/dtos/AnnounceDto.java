package com.finalproject.sheeks.dtos;

import com.finalproject.sheeks.entities.Announce;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AnnounceDto {
    @NotNull
    @NotEmpty
    @Size(max = 256)
    private long id;

    @NotNull
    @NotEmpty
    @Size(max = 30)
    private String userPseudo;

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String titre;

    @NotNull
    @NotEmpty
    @Size(max = 36)
    private String jeux;

    @NotNull
    @NotEmpty
    @Size(max = 10)
    private String plateforme;

    @NotNull
    @NotEmpty
    @Size(max = 20)
    private String niveau;

    @NotNull
    @NotEmpty
    @Size(max = 500)
    private String message;

    public AnnounceDto() {
    }

    public AnnounceDto(long id, String userPseudo, String titre, String jeux, String plateforme, String niveau, String message) {
        this.id = id;
        this.userPseudo = userPseudo;
        this.titre = titre;
        this.jeux = jeux;
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

    public String getUserPseudo() {
        return userPseudo;
    }

    public void setUserPseudo(String userPseudo) {
        this.userPseudo = userPseudo;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getJeux() {
        return jeux;
    }

    public void setJeux(String jeux) {
        this.jeux = jeux;
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
