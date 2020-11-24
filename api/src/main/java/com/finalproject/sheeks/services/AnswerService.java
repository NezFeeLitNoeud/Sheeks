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

    @Autowired
    UserService userService;

    @Override
    public void addAnswer(Long announce_id, String message) {
        User loggedUser = userService.getLoggedUser();
        Announce annonceId = announceRepository.findAnnounceById(announce_id);
        LocalDateTime currentDateTime = LocalDateTime.now();

        Answer answer = new Answer(loggedUser, annonceId, message, currentDateTime);
        answerRepository.save(answer);
    }

    @Override
    public List<Answer> getAnswerByAnnounceId(Announce id) {
        return answerRepository.findAnswerByAnnounceId(id);
    }


}
