package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.entities.Jeux;
import com.finalproject.sheeks.services.gameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GameControllers {

    @Autowired
    gameService gameservice;


    @GetMapping("/game")
    public List<Jeux> getAllGame() {
        return gameservice.getAllGame();
    }
}
