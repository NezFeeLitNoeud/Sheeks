package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Answer;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class AnswerService implements IAnswerService{

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public void addAnswer(User user_id, Announce announce_id, LocalDateTime creation_date, String message) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        Answer answer = new Answer(user_id, announce_id, message, currentDateTime);
        answerRepository.save(answer);
    }

    @Override
    public List<Answer> getAnswerByAnnounceId(Announce id) {
        return answerRepository.findAnswerByAnnounceId(id);
    }


}
