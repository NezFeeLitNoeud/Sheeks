package com.finalproject.sheeks.controllers;

import com.finalproject.sheeks.dtos.AnnounceDto;
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
    public void postAnnounce(@RequestBody AnnounceDto announce){
        announceService.postAnnounce(announce.getTitre(), announce.getMessage(), announce.getNiveau(), announce.getPlateforme(), announce.getJeux());
    }

    @GetMapping("/search/announce/{id}/answer")
    public List<Answer> getAnswerToAnnounce(@PathVariable("id") Announce id){
       return answerService.getAnswerByAnnounceId(id);
    }

    @PostMapping("/search/answer")
    public void postAnswerToAnnounce(@RequestBody AnswerDto answer){
        answerService.addAnswer(answer.getAnnounce_id(), answer.getMessage());
    }

    @GetMapping("/research/{jeux}/{plateforme}/{niveau}")
    public List<Announce> searchAnnounce(@PathVariable("jeux") String jeux, @PathVariable("plateforme") String plateforme, @PathVariable("niveau") String niveau){
        return announceService.researchAnnounce(jeux, plateforme, niveau);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnnounce(@PathVariable("id") Long id){
        announceService.deleteAnnounce(id);
    }
}
