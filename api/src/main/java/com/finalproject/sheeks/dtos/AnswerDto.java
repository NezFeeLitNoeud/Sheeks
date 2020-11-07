package com.finalproject.sheeks.dtos;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.User;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

public class AnswerDto {

    @NotNull
    @NotEmpty
    @Size(max = 256)
    private User user_id;

    @NotNull
    @NotEmpty
    @Size(max = 256)
    private Announce announce_id;

    @NotNull
    @NotEmpty
    @Size(max = 500)
    private String message;

    @NotNull
    @NotEmpty
    @Size(max = 30)
    private LocalDateTime creation_date;


    public AnswerDto() {
    }

    public AnswerDto(User user_id, Announce announce_id, String message, LocalDateTime creation_date) {
        this.user_id = user_id;
        this.announce_id = announce_id;
        this.message = message;
        this.creation_date = creation_date;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Announce getAnnounce_id() {
        return announce_id;
    }

    public void setAnnounce_id(Announce announce_id) {
        this.announce_id = announce_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDateTime creation_date) {
        this.creation_date = creation_date;
    }
}
