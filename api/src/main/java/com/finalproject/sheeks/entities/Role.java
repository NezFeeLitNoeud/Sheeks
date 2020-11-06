package com.finalproject.sheeks.entities;


import javax.persistence.*;

@Entity(name = "role")
public class Role {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "r_id")
    private Long id;

    @Column(name = "r_name", nullable = false)
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
