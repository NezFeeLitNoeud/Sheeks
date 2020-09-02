package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.UserEntity;
import com.finalproject.sheeks.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void registerUser(String pseudo, String email, String password, String gamertag, String platefrom) {
        UserEntity user = new UserEntity(pseudo, email, password, gamertag, platefrom);

        userRepository.save(user);
    }
}
