package com.finalproject.sheeks.repositories;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Jeux;
import com.finalproject.sheeks.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnnounceRepository  extends JpaRepository<Announce, Long> {

    @Query("SELECT a FROM Announce a WHERE a.jeux = :jeux AND a.plateforme = :plateforme AND a.niveau = :niveau")
    List<Announce> findAnnounceByResearch(@Param("jeux") Jeux jeux, @Param("plateforme") String plateforme, @Param("niveau") String niveau);

    @Query("SELECT a FROM Announce a WHERE a.id = :id")
    Announce findAnnounceById(@Param("id") Long id);
}
