package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Role;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Base64;

@Service
public class UserService implements IUserService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void verifyUser(String pseudo, String password) {
        UserDetails user = userDetailsService.loadUserByUsername(pseudo);

        byte[] decodedBytes = Base64.getDecoder().decode(password);
        String decodedPassword = new String(decodedBytes);

        if (!passwordEncoder.matches(decodedPassword, user.getPassword())) {
            throw new BadCredentialsException("bad credentials " + pseudo);
        }
    }

    @Override
    public void registerUser(String pseudo, String email, String password, String gamertag, String plateform) {
        Role roleUser = roleRepository.findById((long) 2).orElseThrow();
        User user = new User(pseudo, email, passwordEncoder.encode(password), gamertag, plateform, roleUser);

        userRepository.save(user);
    }

    @Override
    public User getLoggedUser() {
        String authentication = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(authentication);

        return user;
    }

}
