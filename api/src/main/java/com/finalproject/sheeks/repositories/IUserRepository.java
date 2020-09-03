package com.finalproject.sheeks.repositories;
import com.finalproject.sheeks.entities.User;


import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
}
