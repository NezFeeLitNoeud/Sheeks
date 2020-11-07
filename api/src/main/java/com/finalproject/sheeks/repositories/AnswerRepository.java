package com.finalproject.sheeks.repositories;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
