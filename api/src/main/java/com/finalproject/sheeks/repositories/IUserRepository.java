package com.finalproject.sheeks.repositories;
import com.finalproject.sheeks.entities.UserEntity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
}
