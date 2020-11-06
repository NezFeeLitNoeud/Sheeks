package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Role;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

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
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("bad credentials " + pseudo);
        }
    }

    @Override
    public User getUser(String pseudo) {
        return userRepository.findByUsername(pseudo);
    }

    @Override
    public void registerUser(String pseudo, String email, String password, String gamertag, String plateform) {
        Role roleUser = roleRepository.findById((long) 1).orElseThrow();
        User user = new User(pseudo, email, passwordEncoder.encode(password), gamertag, plateform, roleUser);

        userRepository.save(user);
    }
}
