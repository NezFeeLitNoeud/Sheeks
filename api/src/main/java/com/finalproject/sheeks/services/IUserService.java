package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.User;

import java.util.Optional;

public interface IUserService {

    void registerUser(String pseudo, String email, String password, String gamertag, String plateform);
    void verifyUser(String pseudo, String password);

    Optional<User> getUser(String pseudo);
}
