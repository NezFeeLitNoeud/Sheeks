package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Role;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void registerUser(String pseudo, String email, String password, String gamertag, String plateform) {
        Role roleUser = roleRepository.findById("USER").orElseThrow();
        User user = new User(pseudo, email, password, gamertag, plateform, roleUser);

        userRepository.save(user);
    }
}
