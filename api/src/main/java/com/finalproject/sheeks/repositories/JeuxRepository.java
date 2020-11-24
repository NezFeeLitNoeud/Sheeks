package com.finalproject.sheeks.repositories;

import com.finalproject.sheeks.entities.Jeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JeuxRepository extends JpaRepository<Jeux, Long> {


    @Query("SELECT g FROM Jeux g WHERE g.nom = :nom")
    Jeux findByName(@Param("nom") String nom);
}
