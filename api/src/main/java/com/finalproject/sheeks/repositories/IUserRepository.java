package com.finalproject.sheeks.repositories;
import com.finalproject.sheeks.entities.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.pseudo = :pseudo")
    User findByUsername(@Param("pseudo") String name);

    @Query("SELECT u.id FROM User u WHERE u.pseudo = :pseudo")
    int findIdByUsername(@Param("pseudo") String name);

    @Query("SELECT u FROM User u WHERE u.id = :id")
    User findUserById(@Param("id") Long id);

}
