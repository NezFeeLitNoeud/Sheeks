package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.User;

public interface IUserService {

    void registerUser(String pseudo, String email, String password, String gamertag, String plateform);
    void verifyUser(String pseudo, String password);
    User getLoggedUser();
}
