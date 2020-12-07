package com.finalproject.sheeks.entities;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "answer_announce")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aa_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aa_u_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "aa_a_id")
    private Announce announce_id;

    @Column(name = "aa_message", nullable = false)
    private String message;

    @Column(name = "aa_creation_date", nullable = false)
    private LocalDateTime creation_date;

    public Answer() {
    }

    public Answer(User user_id, Announce announce_id, String message, LocalDateTime creation_date) {
        this.user_id = user_id;
        this.announce_id = announce_id;
        this.message = message;
        this.creation_date = creation_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
