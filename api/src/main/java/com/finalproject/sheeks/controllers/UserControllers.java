package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.dtos.UserDto;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        userService.registerUser(user.getPseudo(), user.getEmail(), user.getPassword(), user.getGamertag(), user.getPlateform());
    }

    @GetMapping("/profil/{pseudo}")
    public Optional<User> findUser(@PathVariable("pseudo") String pseudo) {
        return userService.getUser(pseudo);
    }

}
