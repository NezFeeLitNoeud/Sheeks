package com.finalproject.sheeks.dtos;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Answer;
import com.finalproject.sheeks.entities.User;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

public class AnswerDto {

    @NotNull
    private Long announce_id;

    @NotNull
    @NotEmpty
    @Size(max = 200)
    private String message;

    public AnswerDto() {
    }

    public AnswerDto(Long announce_id, String message) {

        this.announce_id = announce_id;
        this.message = message;
    }

    public Long getAnnounce_id() {
        return announce_id;
    }

    public void setAnnounce_id(Long announce_id) {
        this.announce_id = announce_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
