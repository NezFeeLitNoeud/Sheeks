package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.dtos.AnswerDto;
import com.finalproject.sheeks.dtos.UserDto;
import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Answer;
import com.finalproject.sheeks.entities.User;
import com.finalproject.sheeks.repositories.AnnounceRepository;
import com.finalproject.sheeks.repositories.AnswerRepository;
import com.finalproject.sheeks.services.IAnnounceService;
import com.finalproject.sheeks.services.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class AnnounceControllers {

    @Autowired
    IAnnounceService announceService;

    @Autowired
    IAnswerService answerService;

    @Autowired
    AnnounceRepository announceRepository;

    @Autowired
    AnswerRepository answerRepository;

    @GetMapping("/search/announce")
    public List<Announce> getAnnounce(){
        return announceService.findAnnounce();
    }


    @GetMapping("/search/announce/{id}")
    public Optional<Announce> getAnnounceById(@PathVariable("id") Long id){
        return announceService.getAnnounceById(id);
    }

    @PostMapping("/search/post")
    public void postAnnounce(@RequestBody AnswerDto answer){
        // Methode avec laquelle on va enregistrer la reponse dans la BDD.
    }

    @GetMapping("/search/announce/{id}/answer")
    public List<Answer> getAnswerToAnnounce(@PathVariable("id") Announce id){
       return answerService.getAnswerByAnnounceId(id);
    }

    @PostMapping("/search/answer")
    public void postAnswerToAnnounce(@RequestBody AnswerDto answer){
        answerService.addAnswer(answer.getUser_id(), answer.getAnnounce_id(), answer.getCreation_date(), answer.getMessage());
    }
}
