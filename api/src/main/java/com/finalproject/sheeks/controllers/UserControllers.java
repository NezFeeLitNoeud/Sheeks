package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.dtos.UserDto;
import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@CrossOrigin
@RestController
public class UserControllers {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public void login(@RequestBody UserDto user) {
        userService.verifyUser(user.getPseudo(), user.getPassword());
    }

    @PostMapping("/register")
    public void register(@RequestBody UserDto user) {
        userService.registerUser(user.getPseudo(), user.getEmail(), user.getPassword(), user.getGamertag(),
                user.getGender());
    }

    @GetMapping("/user")
    public User getUser() {

        User loggedUser = userService.getLoggedUser();

        return loggedUser;


    }

}
