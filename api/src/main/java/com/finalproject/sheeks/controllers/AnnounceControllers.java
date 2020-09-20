package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.services.IAnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AnnounceControllers {

    @Autowired
    IAnnounceService announceService;

    @Autowired
    AnnounceRepository announceRepository;

    @GetMapping("/announce")
    public List<Announce> getAnnounce(){
        return announceService.findAnnounce();
    }
}
