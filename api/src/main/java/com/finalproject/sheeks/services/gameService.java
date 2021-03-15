package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Jeux;
import com.finalproject.sheeks.repositories.JeuxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gameService implements IGameService{

    @Autowired
    JeuxRepository jeuxRepository;
    @Override
    public List<Jeux> getAllGame() {
        return jeuxRepository.findAll();
    }
}
