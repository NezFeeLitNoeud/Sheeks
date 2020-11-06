package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.services.IAnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class AnnounceControllers {

    @Autowired
    IAnnounceService announceService;

    @Autowired
    AnnounceRepository announceRepository;

    @GetMapping("/search/announce")
    public List<Announce> getAnnounce(){
        return announceService.findAnnounce();
    }


    @GetMapping("/search/announce/{id}")
    public Optional<Announce> getAnnounceById(@PathVariable("id") Long id){

        return announceService.getAnnounceById(id);
    }
}
