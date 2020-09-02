package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.dtos.UserDto;
import com.finalproject.sheeks.repositories.IUserRepository;
import com.finalproject.sheeks.services.IUserService;
import com.finalproject.sheeks.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserControllers {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserDto user) {
        userService.registerUser(user.getPseudo(), user.getEmail(), user.getPassword(), user.getGamertag(), user.getPlateform());
    }

}
