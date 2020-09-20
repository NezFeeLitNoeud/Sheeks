package com.finalproject.sheeks.dtos;

import com.finalproject.sheeks.entities.Announce;

public class AnnounceDto {

    private long id;

    private String userPseudo;

    private String titre;

    private String jeux;

    private String plateforme;

    private String niveau;

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
