package com.finalproject.sheeks.services;

import com.finalproject.sheeks.dtos.AnswerDto;
import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Answer;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.repositories.AnswerRepository;
import com.finalproject.sheeks.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerService implements IAnswerService{

    @Autowired
    IUserRepository userRepository;

    @Autowired
    AnnounceRepository announceRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public void addAnswer(Long user_id, Long announce_id, LocalDateTime creation_date, String message) {
        //String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User byId = userRepository.findUserById(user_id);
        Announce annonceId = announceRepository.findAnnounceById(announce_id);

        LocalDateTime currentDateTime = LocalDateTime.now();

        Answer answer = new Answer(byId, annonceId, message, currentDateTime);
        answerRepository.save(answer);
    }

    @Override
    public List<Answer> getAnswerByAnnounceId(Announce id) {
        return answerRepository.findAnswerByAnnounceId(id);
    }


}
