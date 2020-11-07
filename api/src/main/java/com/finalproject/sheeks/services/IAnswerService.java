package com.finalproject.sheeks.services;

import com.finalproject.sheeks.entities.Announce;
import com.finalproject.sheeks.entities.User;

import java.time.LocalDateTime;
import java.util.Date;

public interface IAnswerService {

    public void addAnswer(User user_id, Announce announce_id, LocalDateTime creation_date, String message);
}
