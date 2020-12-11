package com.finalproject.sheeks.services;


import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Jeux;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.repositories.JeuxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class AnnounceService implements IAnnounceService{

    @Autowired
    JeuxRepository jeuxRepository;

    @Autowired
    AnnounceRepository announceRepository;

    @Autowired
    UserService userService;

    @Override
    @Transactional
    public List<Announce> findAnnounce() {
        return announceRepository.findAll();

    }

    @Override
    public Optional<Announce> getAnnounceById(Long id) {

        return announceRepository.findById(id);
    }

    @Override
    public void postAnnounce(String titre, String message, String niveau, String plateforme, String game) {
        Jeux jeux = jeuxRepository.findByName(game);

        Announce annonce = new Announce(userService.getLoggedUser(), jeux, titre, message, niveau, plateforme);
        announceRepository.save(annonce);

    }

    @Override
    public List<Announce> researchAnnounce(String jeu, String plateforme, String level) {
        Jeux jeux = jeuxRepository.findByName(jeu);

        return announceRepository.findAnnounceByReasearch(jeux, plateforme, level);
    }
}
