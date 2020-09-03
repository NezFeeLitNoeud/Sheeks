package com.finalproject.sheeks.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "role")
public class Role {

    @Id
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
