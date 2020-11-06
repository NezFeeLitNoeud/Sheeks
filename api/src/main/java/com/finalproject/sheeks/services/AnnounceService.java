package com.finalproject.sheeks.services;


import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.repositories.AnnounceRepository;
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
    AnnounceRepository announceRepository;

    @Override
    @Transactional
    public List<Announce> findAnnounce() {
        return announceRepository.findAll();

    }

    @Override
    public Optional<Announce> getAnnounceById(Long id) {

        return announceRepository.findById(id);
    }
}
