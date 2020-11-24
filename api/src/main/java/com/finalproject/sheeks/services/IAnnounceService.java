package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Announce;

import java.util.List;
import java.util.Optional;

public interface IAnnounceService {

    List<Announce> findAnnounce();

    Optional<Announce> getAnnounceById(Long id);
}
