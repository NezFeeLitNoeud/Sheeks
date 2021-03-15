package com.finalproject.sheeks.services;


import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Jeux;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.repositories.JeuxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
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

        return announceRepository.findAnnounceByResearch(jeux, plateforme, level);
    }

    @Override
    public void deleteAnnounce(Long id) {
        Announce announceToDelete = announceRepository.findAnnounceById(id);

        if(announceToDelete.getUser() == userService.getLoggedUser()) {
            announceRepository.delete(announceToDelete);
        }

    }


}
