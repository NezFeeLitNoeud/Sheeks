package com.finalproject.sheeks.repositories;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnnounceRepository  extends JpaRepository<Announce, Long> {

    //@Query("SELECT a FROM Announce a WHERE a.id = :id")
    //User findById(@Param("id") Long id);
}
