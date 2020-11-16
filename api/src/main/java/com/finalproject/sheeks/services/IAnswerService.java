package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.Answer;
import com.finalproject.sheeks.entities.User;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface IAnswerService {

    public void addAnswer(User user_id, Announce announce_id, LocalDateTime creation_date, String message);

    public List<Answer> getAnswerByAnnounceId(Announce id);
}
